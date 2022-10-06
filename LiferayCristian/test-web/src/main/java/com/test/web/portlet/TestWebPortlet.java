package com.test.web.portlet;

import com.test.api.api.TestApi;
import com.test.web.constants.TestWebPortletKeys;

import java.io.IOException;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author christian.sanchez
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category="+ TestWebPortletKeys.CUSTOM,
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=TestWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TestWebPortletKeys.TESTWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TestWebPortlet extends MVCPortlet {
	
	@Reference
	TestApi testapi;
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		String url = "https://gorest.co.in/public/v2/users";
		
		JSONObject jsonResponse = testapi.callServiceByGet(url, "");
		
		PortletSession session = renderRequest.getPortletSession();
		session.setAttribute("responseCode", jsonResponse.get("prueba"));
		session.setAttribute("responseService", jsonResponse.get("respuesta"));
		
		System.out.println(jsonResponse.get("prueba"));
		System.out.println(jsonResponse.get("respuesta"));
		
		super.doView(renderRequest, renderResponse);
	}
}
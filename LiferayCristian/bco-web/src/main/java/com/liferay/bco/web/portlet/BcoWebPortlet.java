package com.liferay.bco.web.portlet;

import com.liferay.bco.api.api.BcoApi;
import com.liferay.bco.web.constants.BcoWebPortletKeys;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
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
		"com.liferay.portlet.display-category="+BcoWebPortletKeys.CUSTOM,
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=BcoWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + BcoWebPortletKeys.BCOWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class BcoWebPortlet extends MVCPortlet {
	
	private static final Log LOGGER= LogFactoryUtil.getLog(BcoWebPortlet.class);
	
	@Reference
	BcoApi bcoapi;
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
	ThemeDisplay themeDisplay  =(ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	User user = themeDisplay.getUser();
	Long customerId = (Long) user.getExpandoBridge().getAttribute("customerId");
		
		
	JSONArray jsonresponse = bcoapi.getCustomerAccounts(customerId);
	LOGGER.info(jsonresponse);
	renderRequest.setAttribute("JsonResponse", jsonresponse);
	
			super.doView(renderRequest, renderResponse);
	}
}

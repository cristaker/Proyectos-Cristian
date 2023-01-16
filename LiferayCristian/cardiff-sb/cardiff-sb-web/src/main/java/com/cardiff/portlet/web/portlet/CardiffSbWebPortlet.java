package com.cardiff.portlet.web.portlet;

import com.cardiff.model.cardiff;
import com.cardiff.portlet.web.constants.CardiffSbWebPortletKeys;
import com.cardiff.service.cardiffLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author christian.sanchez
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=CardiffSbWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CardiffSbWebPortletKeys.CARDIFFSBWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CardiffSbWebPortlet extends MVCPortlet {
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		final List<cardiff> Cardiff = cardiffLocalServiceUtil.getcardiffs(0, Integer.MAX_VALUE);
		renderRequest.setAttribute("cardiff", Cardiff);
		
		super.render(renderRequest, renderResponse);
	}
}
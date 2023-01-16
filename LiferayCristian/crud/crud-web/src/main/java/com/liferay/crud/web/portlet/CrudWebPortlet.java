package com.liferay.crud.web.portlet;

import com.liferay.crud.model.crud;
import com.liferay.crud.service.crudLocalServiceUtil;
import com.liferay.crud.web.constants.CrudWebPortletKeys;
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
		"key=login.events.post",
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=CrudWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CrudWebPortletKeys.CRUDWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CrudWebPortlet extends MVCPortlet {
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		final List<crud> Crud = crudLocalServiceUtil.getcruds(0, Integer.MAX_VALUE);
		renderRequest.setAttribute("crud", Crud);

		super.render(renderRequest, renderResponse);
	}

}
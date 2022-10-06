package com.liferay.training.crud.web.portlet;

import com.liferay.training.crud.model.crud;
import com.liferay.training.crud.service.crudLocalServiceUtil;
import com.liferay.training.crud.web.constants.CrudWebMVCPortletKeys;

import java.io.IOException;
import java.util.List;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;

/**
 * @author christian.sanchez
 */
@Component(immediate = true, property = { 
		"key=login.events.post",
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=CrudWebMVC",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CrudWebMVCPortletKeys.CRUDWEBMVC,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" },

service = Portlet.class)
public class CrudWebMVCPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		final List<crud> Crud = crudLocalServiceUtil.getcruds(0, Integer.MAX_VALUE);
		renderRequest.setAttribute("crud", Crud);

		super.render(renderRequest, renderResponse);
	}

	public class PostLoginPortlet implements LifecycleAction {

		@SuppressWarnings("deprecation")
		@Override
		public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
			final HttpSession sesion = lifecycleEvent.getRequest().getSession();
			String path = "/group/guest/Actualizacion";
			LastPath lasthpath = new LastPath(StringPool.BLANK, path);
			sesion.setAttribute(WebKeys.LAST_PATH, lasthpath);

		}
	}

}
package com.pagofacturas.web.portlet;

import com.pagofacturas.web.constants.PagoFacturasWebPortletKeys;

import java.io.IOException;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
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
		"javax.portlet.display-name=PagoFacturasWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PagoFacturasWebPortletKeys.PAGOFACTURASWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PagoFacturasWebPortlet extends MVCPortlet {
	
	private static final Log LOGGER= LogFactoryUtil.getLog(PagoFacturasWebPortlet.class);
	
	@Indexable(type=IndexableType.REINDEX)
	@Override
		public void render(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
			LOGGER.debug("render()");
			renderRequest.setAttribute("Mensaje", "Que factura desea pagar: ");
			super.render(renderRequest, renderResponse);
		}
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		LOGGER.debug("processAction()");
		
		actionRequest.setAttribute("valor", "Este es el valor que se pasa por action");
		
		super.processAction(actionRequest, actionResponse);
	}
	
}
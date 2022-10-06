package com.liferay.training.crud.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.crud.model.crud;
import com.liferay.training.crud.service.crudLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate=true,
		property= {
				"javax.portlet.name=com_liferay_training_crud_web_CrudWebMVCPortlet",
				"mvc.command.name=displayCrudEdition"
		},
		service= MVCRenderCommand.class
		)
public class editCrudRenderCommand implements MVCRenderCommand {
	
	@Override
	public String render(RenderRequest request, RenderResponse response) throws PortletException {
		final String id = ParamUtil.getString(request, "idcrud");
		
		try {
			final crud Crud = crudLocalServiceUtil.getcrud(Long.valueOf(id));
			
			request.setAttribute("crud", Crud);
		}
		catch (PortalException e) {
			throw new RuntimeException(e);
		}
		
		return "/crudEdit.jsp";
	}
}

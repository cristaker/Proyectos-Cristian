package com.liferay.training.crud.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.crud.service.crudLocalServiceUtil;

import java.text.DateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate=true,
		property= {
				"javax.portlet.name=com_liferay_training_crud_web_CrudWebMVCPortlet",
				"mvc.command.name=/editCrud"
		},
		service=MVCActionCommand.class
		
		)

public class editCrudMVCActionCommand extends BaseMVCActionCommand {
	
	@Override
	protected void doProcessAction(ActionRequest request, ActionResponse response) throws Exception {
		final String id = ParamUtil.getString(request, "idcrud");
		final String nombre = ParamUtil.getString(request, "nombre");
		final String apellido = ParamUtil.getString(request, "apellido");
		final String edad = ParamUtil.getString(request, "edad");
		final String documento = ParamUtil.getString(request, "documento");
		final String tipoDocumento = ParamUtil.getString(request, "tipoDocumento");
		final Date nacimiento = ParamUtil.getDate(request, "nacimiento", DateFormat.getDateInstance());
		final String direccion = ParamUtil.getString(request, "direccionPersona");
		final String ciudad = ParamUtil.getString(request, "ciudadPersona");
		final String telefonoFijo = ParamUtil.getString(request, "telefonoFijo");
		final String telefonoCelular = ParamUtil.getString(request, "telefonoCelular");
		
		
		crudLocalServiceUtil.updateCrud(Long.valueOf(id), nombre, apellido, edad, documento, tipoDocumento, nacimiento, direccion, ciudad, telefonoFijo, telefonoCelular);
		
		response.setRenderParameter("mvcPath", "/view.jsp");
	}
}

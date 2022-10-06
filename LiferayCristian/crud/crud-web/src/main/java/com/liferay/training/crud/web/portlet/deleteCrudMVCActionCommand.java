package com.liferay.training.crud.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.crud.service.crudLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate=true,
		property= {
				"javax.portlet.name=com_liferay_training_crud_web_CrudWebMVCPortlet",
				"mvc.command.name=/deleteCrud"
		},
		service=MVCActionCommand.class
		
		)

public class deleteCrudMVCActionCommand extends BaseMVCActionCommand {
	
	@Override
	protected void doProcessAction(ActionRequest request, ActionResponse response) throws Exception {
		final String id = ParamUtil.getString(request, "idcrud");
		crudLocalServiceUtil.deletecrud(Long.valueOf(id));
}
}
package com.cardiff.portlet.web.portlet;

import com.cardiff.service.cardiffLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate=true,
		property= {
				"javax.portlet.name=com_cardiff_portlet_web_CardiffSbWebPortlet",
                "mvc.command.name=/addCardiff"
	
},
		service = MVCActionCommand.class
		
		)

public class addCardiffMVCActionCommand extends BaseMVCActionCommand {
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		final ThemeDisplay themedisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long groupId = themedisplay.getScopeGroupId();
		long companyId = themedisplay.getCompanyId();
		
		final long userId = ParamUtil.getLong(actionRequest, "userId");
		final String defaultLocale = ParamUtil.getString(actionRequest, "defaultLocale");
		final String taskExecutorClassName = ParamUtil.getString(actionRequest, "taskExecutorClassName");
		final String name = ParamUtil.getString(actionRequest, "name");
		final long backgroundTaskId = ParamUtil.getLong(actionRequest, "backgroundTaskId");
		final String userName = ParamUtil.getString(actionRequest, "userName");
		final String permissionChecker = ParamUtil.getString(actionRequest, "permissionChecker");
		final String siteDefaultLocale = ParamUtil.getString(actionRequest, "siteDefaultLocale");
		final long status = ParamUtil.getLong(actionRequest, "status");
		final String themeDisplayLocale = ParamUtil.getString(actionRequest, "themeDisplayLocale");
		
		cardiffLocalServiceUtil.addCardiff(groupId, companyId, userId, userName, null, null, defaultLocale, taskExecutorClassName, name, backgroundTaskId, permissionChecker, siteDefaultLocale, status, themeDisplayLocale);
		
	}

}

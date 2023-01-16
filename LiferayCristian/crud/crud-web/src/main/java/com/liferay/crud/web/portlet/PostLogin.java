package com.liferay.crud.web.portlet;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;

@SuppressWarnings("deprecation")
@Component(
		immediate = true,
		property = {
			"key=login.events.post"
		},
		service = LifecycleAction.class
		)

public class PostLogin implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		final HttpSession sesion = lifecycleEvent.getRequest().getSession();
		String path = "/group/guest/Actualizacion";
		LastPath lasthpath = new LastPath(StringPool.BLANK, path);
		sesion.setAttribute(WebKeys.LAST_PATH, lasthpath);
		System.out.println("Este es el evento postlogin "+ sesion);
		
	}

}

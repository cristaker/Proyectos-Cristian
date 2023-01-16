/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.cardiff.service.impl;

import com.cardiff.model.cardiff;
import com.cardiff.model.impl.cardiffImpl;
import com.cardiff.service.base.cardiffLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the cardiff local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.cardiff.service.cardiffLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see cardiffLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.cardiff.model.cardiff",
	service = AopService.class
)
public class cardiffLocalServiceImpl extends cardiffLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.cardiff.service.cardiffLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.cardiff.service.cardiffLocalServiceUtil</code>.
	 */
	
	public void addCardiff(long groupId, long companyId, long userId, String userName, 
			Date createDate, Date modifiedDate, String defaultLocale, String taskExecutorClassName,
			String name, long backgroundTaskId, String permissionChecker, String siteDefaultLocale, 
			long status, String themeDisplayLocale) {
		
		final cardiff Cardiff = new cardiffImpl();
		
		Cardiff.setCardiffId(counterLocalService.increment());
		Cardiff.setCompanyId(groupId);
		Cardiff.setGroupId(groupId);
		Cardiff.setUserId(userId);
		Cardiff.setUserName(userName);
		Cardiff.setCreateDate(createDate);
		Cardiff.setModifiedDate(modifiedDate);
		Cardiff.setDefaultLocale(defaultLocale);
		Cardiff.setTaskExecutorClassName(taskExecutorClassName);
		Cardiff.setName(name);
		Cardiff.setBackgroundTaskId(backgroundTaskId);
		Cardiff.setPermissionChecker(permissionChecker);
		Cardiff.setSiteDefaultLocale(siteDefaultLocale);
		Cardiff.setStatus(status);
		Cardiff.setThemeDisplayLocale(themeDisplayLocale);
		
		addcardiff(Cardiff);
		
	}
}
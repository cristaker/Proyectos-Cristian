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

package com.cardiff.servicebuilder.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link cardiff}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see cardiff
 * @generated
 */
public class cardiffWrapper
	extends BaseModelWrapper<cardiff>
	implements cardiff, ModelWrapper<cardiff> {

	public cardiffWrapper(cardiff cardiff) {
		super(cardiff);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cardiffId", getCardiffId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("defaultLocale", getDefaultLocale());
		attributes.put("taskExecutorClassName", getTaskExecutorClassName());
		attributes.put("name", getName());
		attributes.put("backgroundTaskId", getBackgroundTaskId());
		attributes.put("permissionChecker", getPermissionChecker());
		attributes.put("siteDefaultLocale", getSiteDefaultLocale());
		attributes.put("status", getStatus());
		attributes.put("themeDisplayLocale", getThemeDisplayLocale());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cardiffId = (Long)attributes.get("cardiffId");

		if (cardiffId != null) {
			setCardiffId(cardiffId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String defaultLocale = (String)attributes.get("defaultLocale");

		if (defaultLocale != null) {
			setDefaultLocale(defaultLocale);
		}

		String taskExecutorClassName = (String)attributes.get(
			"taskExecutorClassName");

		if (taskExecutorClassName != null) {
			setTaskExecutorClassName(taskExecutorClassName);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long backgroundTaskId = (Long)attributes.get("backgroundTaskId");

		if (backgroundTaskId != null) {
			setBackgroundTaskId(backgroundTaskId);
		}

		String permissionChecker = (String)attributes.get("permissionChecker");

		if (permissionChecker != null) {
			setPermissionChecker(permissionChecker);
		}

		String siteDefaultLocale = (String)attributes.get("siteDefaultLocale");

		if (siteDefaultLocale != null) {
			setSiteDefaultLocale(siteDefaultLocale);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String themeDisplayLocale = (String)attributes.get(
			"themeDisplayLocale");

		if (themeDisplayLocale != null) {
			setThemeDisplayLocale(themeDisplayLocale);
		}
	}

	/**
	 * Returns the background task ID of this cardiff.
	 *
	 * @return the background task ID of this cardiff
	 */
	@Override
	public long getBackgroundTaskId() {
		return model.getBackgroundTaskId();
	}

	/**
	 * Returns the cardiff ID of this cardiff.
	 *
	 * @return the cardiff ID of this cardiff
	 */
	@Override
	public long getCardiffId() {
		return model.getCardiffId();
	}

	/**
	 * Returns the company ID of this cardiff.
	 *
	 * @return the company ID of this cardiff
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cardiff.
	 *
	 * @return the create date of this cardiff
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the default locale of this cardiff.
	 *
	 * @return the default locale of this cardiff
	 */
	@Override
	public String getDefaultLocale() {
		return model.getDefaultLocale();
	}

	/**
	 * Returns the group ID of this cardiff.
	 *
	 * @return the group ID of this cardiff
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this cardiff.
	 *
	 * @return the modified date of this cardiff
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this cardiff.
	 *
	 * @return the name of this cardiff
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the permission checker of this cardiff.
	 *
	 * @return the permission checker of this cardiff
	 */
	@Override
	public String getPermissionChecker() {
		return model.getPermissionChecker();
	}

	/**
	 * Returns the primary key of this cardiff.
	 *
	 * @return the primary key of this cardiff
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the site default locale of this cardiff.
	 *
	 * @return the site default locale of this cardiff
	 */
	@Override
	public String getSiteDefaultLocale() {
		return model.getSiteDefaultLocale();
	}

	/**
	 * Returns the status of this cardiff.
	 *
	 * @return the status of this cardiff
	 */
	@Override
	public long getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the task executor class name of this cardiff.
	 *
	 * @return the task executor class name of this cardiff
	 */
	@Override
	public String getTaskExecutorClassName() {
		return model.getTaskExecutorClassName();
	}

	/**
	 * Returns the theme display locale of this cardiff.
	 *
	 * @return the theme display locale of this cardiff
	 */
	@Override
	public String getThemeDisplayLocale() {
		return model.getThemeDisplayLocale();
	}

	/**
	 * Returns the user ID of this cardiff.
	 *
	 * @return the user ID of this cardiff
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cardiff.
	 *
	 * @return the user name of this cardiff
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cardiff.
	 *
	 * @return the user uuid of this cardiff
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the background task ID of this cardiff.
	 *
	 * @param backgroundTaskId the background task ID of this cardiff
	 */
	@Override
	public void setBackgroundTaskId(long backgroundTaskId) {
		model.setBackgroundTaskId(backgroundTaskId);
	}

	/**
	 * Sets the cardiff ID of this cardiff.
	 *
	 * @param cardiffId the cardiff ID of this cardiff
	 */
	@Override
	public void setCardiffId(long cardiffId) {
		model.setCardiffId(cardiffId);
	}

	/**
	 * Sets the company ID of this cardiff.
	 *
	 * @param companyId the company ID of this cardiff
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cardiff.
	 *
	 * @param createDate the create date of this cardiff
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the default locale of this cardiff.
	 *
	 * @param defaultLocale the default locale of this cardiff
	 */
	@Override
	public void setDefaultLocale(String defaultLocale) {
		model.setDefaultLocale(defaultLocale);
	}

	/**
	 * Sets the group ID of this cardiff.
	 *
	 * @param groupId the group ID of this cardiff
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this cardiff.
	 *
	 * @param modifiedDate the modified date of this cardiff
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this cardiff.
	 *
	 * @param name the name of this cardiff
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the permission checker of this cardiff.
	 *
	 * @param permissionChecker the permission checker of this cardiff
	 */
	@Override
	public void setPermissionChecker(String permissionChecker) {
		model.setPermissionChecker(permissionChecker);
	}

	/**
	 * Sets the primary key of this cardiff.
	 *
	 * @param primaryKey the primary key of this cardiff
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the site default locale of this cardiff.
	 *
	 * @param siteDefaultLocale the site default locale of this cardiff
	 */
	@Override
	public void setSiteDefaultLocale(String siteDefaultLocale) {
		model.setSiteDefaultLocale(siteDefaultLocale);
	}

	/**
	 * Sets the status of this cardiff.
	 *
	 * @param status the status of this cardiff
	 */
	@Override
	public void setStatus(long status) {
		model.setStatus(status);
	}

	/**
	 * Sets the task executor class name of this cardiff.
	 *
	 * @param taskExecutorClassName the task executor class name of this cardiff
	 */
	@Override
	public void setTaskExecutorClassName(String taskExecutorClassName) {
		model.setTaskExecutorClassName(taskExecutorClassName);
	}

	/**
	 * Sets the theme display locale of this cardiff.
	 *
	 * @param themeDisplayLocale the theme display locale of this cardiff
	 */
	@Override
	public void setThemeDisplayLocale(String themeDisplayLocale) {
		model.setThemeDisplayLocale(themeDisplayLocale);
	}

	/**
	 * Sets the user ID of this cardiff.
	 *
	 * @param userId the user ID of this cardiff
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cardiff.
	 *
	 * @param userName the user name of this cardiff
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cardiff.
	 *
	 * @param userUuid the user uuid of this cardiff
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected cardiffWrapper wrap(cardiff cardiff) {
		return new cardiffWrapper(cardiff);
	}

}
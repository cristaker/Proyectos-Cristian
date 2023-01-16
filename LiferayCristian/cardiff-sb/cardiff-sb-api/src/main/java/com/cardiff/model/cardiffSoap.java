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

package com.cardiff.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class cardiffSoap implements Serializable {

	public static cardiffSoap toSoapModel(cardiff model) {
		cardiffSoap soapModel = new cardiffSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCardiffId(model.getCardiffId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDefaultLocale(model.getDefaultLocale());
		soapModel.setTaskExecutorClassName(model.getTaskExecutorClassName());
		soapModel.setName(model.getName());
		soapModel.setBackgroundTaskId(model.getBackgroundTaskId());
		soapModel.setPermissionChecker(model.getPermissionChecker());
		soapModel.setSiteDefaultLocale(model.getSiteDefaultLocale());
		soapModel.setStatus(model.getStatus());
		soapModel.setThemeDisplayLocale(model.getThemeDisplayLocale());

		return soapModel;
	}

	public static cardiffSoap[] toSoapModels(cardiff[] models) {
		cardiffSoap[] soapModels = new cardiffSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static cardiffSoap[][] toSoapModels(cardiff[][] models) {
		cardiffSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new cardiffSoap[models.length][models[0].length];
		}
		else {
			soapModels = new cardiffSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static cardiffSoap[] toSoapModels(List<cardiff> models) {
		List<cardiffSoap> soapModels = new ArrayList<cardiffSoap>(
			models.size());

		for (cardiff model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new cardiffSoap[soapModels.size()]);
	}

	public cardiffSoap() {
	}

	public long getPrimaryKey() {
		return _cardiffId;
	}

	public void setPrimaryKey(long pk) {
		setCardiffId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCardiffId() {
		return _cardiffId;
	}

	public void setCardiffId(long cardiffId) {
		_cardiffId = cardiffId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getDefaultLocale() {
		return _defaultLocale;
	}

	public void setDefaultLocale(String defaultLocale) {
		_defaultLocale = defaultLocale;
	}

	public String getTaskExecutorClassName() {
		return _taskExecutorClassName;
	}

	public void setTaskExecutorClassName(String taskExecutorClassName) {
		_taskExecutorClassName = taskExecutorClassName;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getBackgroundTaskId() {
		return _backgroundTaskId;
	}

	public void setBackgroundTaskId(long backgroundTaskId) {
		_backgroundTaskId = backgroundTaskId;
	}

	public String getPermissionChecker() {
		return _permissionChecker;
	}

	public void setPermissionChecker(String permissionChecker) {
		_permissionChecker = permissionChecker;
	}

	public String getSiteDefaultLocale() {
		return _siteDefaultLocale;
	}

	public void setSiteDefaultLocale(String siteDefaultLocale) {
		_siteDefaultLocale = siteDefaultLocale;
	}

	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
	}

	public String getThemeDisplayLocale() {
		return _themeDisplayLocale;
	}

	public void setThemeDisplayLocale(String themeDisplayLocale) {
		_themeDisplayLocale = themeDisplayLocale;
	}

	private String _uuid;
	private long _cardiffId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _defaultLocale;
	private String _taskExecutorClassName;
	private String _name;
	private long _backgroundTaskId;
	private String _permissionChecker;
	private String _siteDefaultLocale;
	private long _status;
	private String _themeDisplayLocale;

}
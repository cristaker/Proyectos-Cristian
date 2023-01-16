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

package com.cardiff.servicebuilder.model.impl;

import com.cardiff.servicebuilder.model.cardiff;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing cardiff in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class cardiffCacheModel implements CacheModel<cardiff>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof cardiffCacheModel)) {
			return false;
		}

		cardiffCacheModel cardiffCacheModel = (cardiffCacheModel)object;

		if (cardiffId == cardiffCacheModel.cardiffId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cardiffId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{cardiffId=");
		sb.append(cardiffId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", defaultLocale=");
		sb.append(defaultLocale);
		sb.append(", taskExecutorClassName=");
		sb.append(taskExecutorClassName);
		sb.append(", name=");
		sb.append(name);
		sb.append(", backgroundTaskId=");
		sb.append(backgroundTaskId);
		sb.append(", permissionChecker=");
		sb.append(permissionChecker);
		sb.append(", siteDefaultLocale=");
		sb.append(siteDefaultLocale);
		sb.append(", status=");
		sb.append(status);
		sb.append(", themeDisplayLocale=");
		sb.append(themeDisplayLocale);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public cardiff toEntityModel() {
		cardiffImpl cardiffImpl = new cardiffImpl();

		cardiffImpl.setCardiffId(cardiffId);
		cardiffImpl.setGroupId(groupId);
		cardiffImpl.setCompanyId(companyId);
		cardiffImpl.setUserId(userId);

		if (userName == null) {
			cardiffImpl.setUserName("");
		}
		else {
			cardiffImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cardiffImpl.setCreateDate(null);
		}
		else {
			cardiffImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cardiffImpl.setModifiedDate(null);
		}
		else {
			cardiffImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (defaultLocale == null) {
			cardiffImpl.setDefaultLocale("");
		}
		else {
			cardiffImpl.setDefaultLocale(defaultLocale);
		}

		if (taskExecutorClassName == null) {
			cardiffImpl.setTaskExecutorClassName("");
		}
		else {
			cardiffImpl.setTaskExecutorClassName(taskExecutorClassName);
		}

		if (name == null) {
			cardiffImpl.setName("");
		}
		else {
			cardiffImpl.setName(name);
		}

		cardiffImpl.setBackgroundTaskId(backgroundTaskId);

		if (permissionChecker == null) {
			cardiffImpl.setPermissionChecker("");
		}
		else {
			cardiffImpl.setPermissionChecker(permissionChecker);
		}

		if (siteDefaultLocale == null) {
			cardiffImpl.setSiteDefaultLocale("");
		}
		else {
			cardiffImpl.setSiteDefaultLocale(siteDefaultLocale);
		}

		cardiffImpl.setStatus(status);

		if (themeDisplayLocale == null) {
			cardiffImpl.setThemeDisplayLocale("");
		}
		else {
			cardiffImpl.setThemeDisplayLocale(themeDisplayLocale);
		}

		cardiffImpl.resetOriginalValues();

		return cardiffImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cardiffId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		defaultLocale = objectInput.readUTF();
		taskExecutorClassName = objectInput.readUTF();
		name = objectInput.readUTF();

		backgroundTaskId = objectInput.readLong();
		permissionChecker = objectInput.readUTF();
		siteDefaultLocale = objectInput.readUTF();

		status = objectInput.readLong();
		themeDisplayLocale = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cardiffId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (defaultLocale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(defaultLocale);
		}

		if (taskExecutorClassName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taskExecutorClassName);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(backgroundTaskId);

		if (permissionChecker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permissionChecker);
		}

		if (siteDefaultLocale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(siteDefaultLocale);
		}

		objectOutput.writeLong(status);

		if (themeDisplayLocale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(themeDisplayLocale);
		}
	}

	public long cardiffId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String defaultLocale;
	public String taskExecutorClassName;
	public String name;
	public long backgroundTaskId;
	public String permissionChecker;
	public String siteDefaultLocale;
	public long status;
	public String themeDisplayLocale;

}
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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the cardiff service. Represents a row in the &quot;Cardiff_cardiff&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.cardiff.model.impl.cardiffModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.cardiff.model.impl.cardiffImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see cardiff
 * @generated
 */
@ProviderType
public interface cardiffModel
	extends BaseModel<cardiff>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cardiff model instance should use the {@link cardiff} interface instead.
	 */

	/**
	 * Returns the primary key of this cardiff.
	 *
	 * @return the primary key of this cardiff
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cardiff.
	 *
	 * @param primaryKey the primary key of this cardiff
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this cardiff.
	 *
	 * @return the uuid of this cardiff
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this cardiff.
	 *
	 * @param uuid the uuid of this cardiff
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the cardiff ID of this cardiff.
	 *
	 * @return the cardiff ID of this cardiff
	 */
	public long getCardiffId();

	/**
	 * Sets the cardiff ID of this cardiff.
	 *
	 * @param cardiffId the cardiff ID of this cardiff
	 */
	public void setCardiffId(long cardiffId);

	/**
	 * Returns the group ID of this cardiff.
	 *
	 * @return the group ID of this cardiff
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this cardiff.
	 *
	 * @param groupId the group ID of this cardiff
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this cardiff.
	 *
	 * @return the company ID of this cardiff
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this cardiff.
	 *
	 * @param companyId the company ID of this cardiff
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this cardiff.
	 *
	 * @return the user ID of this cardiff
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this cardiff.
	 *
	 * @param userId the user ID of this cardiff
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this cardiff.
	 *
	 * @return the user uuid of this cardiff
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this cardiff.
	 *
	 * @param userUuid the user uuid of this cardiff
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this cardiff.
	 *
	 * @return the user name of this cardiff
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this cardiff.
	 *
	 * @param userName the user name of this cardiff
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this cardiff.
	 *
	 * @return the create date of this cardiff
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this cardiff.
	 *
	 * @param createDate the create date of this cardiff
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this cardiff.
	 *
	 * @return the modified date of this cardiff
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this cardiff.
	 *
	 * @param modifiedDate the modified date of this cardiff
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the default locale of this cardiff.
	 *
	 * @return the default locale of this cardiff
	 */
	@AutoEscape
	public String getDefaultLocale();

	/**
	 * Sets the default locale of this cardiff.
	 *
	 * @param defaultLocale the default locale of this cardiff
	 */
	public void setDefaultLocale(String defaultLocale);

	/**
	 * Returns the task executor class name of this cardiff.
	 *
	 * @return the task executor class name of this cardiff
	 */
	@AutoEscape
	public String getTaskExecutorClassName();

	/**
	 * Sets the task executor class name of this cardiff.
	 *
	 * @param taskExecutorClassName the task executor class name of this cardiff
	 */
	public void setTaskExecutorClassName(String taskExecutorClassName);

	/**
	 * Returns the name of this cardiff.
	 *
	 * @return the name of this cardiff
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this cardiff.
	 *
	 * @param name the name of this cardiff
	 */
	public void setName(String name);

	/**
	 * Returns the background task ID of this cardiff.
	 *
	 * @return the background task ID of this cardiff
	 */
	public long getBackgroundTaskId();

	/**
	 * Sets the background task ID of this cardiff.
	 *
	 * @param backgroundTaskId the background task ID of this cardiff
	 */
	public void setBackgroundTaskId(long backgroundTaskId);

	/**
	 * Returns the permission checker of this cardiff.
	 *
	 * @return the permission checker of this cardiff
	 */
	@AutoEscape
	public String getPermissionChecker();

	/**
	 * Sets the permission checker of this cardiff.
	 *
	 * @param permissionChecker the permission checker of this cardiff
	 */
	public void setPermissionChecker(String permissionChecker);

	/**
	 * Returns the site default locale of this cardiff.
	 *
	 * @return the site default locale of this cardiff
	 */
	@AutoEscape
	public String getSiteDefaultLocale();

	/**
	 * Sets the site default locale of this cardiff.
	 *
	 * @param siteDefaultLocale the site default locale of this cardiff
	 */
	public void setSiteDefaultLocale(String siteDefaultLocale);

	/**
	 * Returns the status of this cardiff.
	 *
	 * @return the status of this cardiff
	 */
	public long getStatus();

	/**
	 * Sets the status of this cardiff.
	 *
	 * @param status the status of this cardiff
	 */
	public void setStatus(long status);

	/**
	 * Returns the theme display locale of this cardiff.
	 *
	 * @return the theme display locale of this cardiff
	 */
	@AutoEscape
	public String getThemeDisplayLocale();

	/**
	 * Sets the theme display locale of this cardiff.
	 *
	 * @param themeDisplayLocale the theme display locale of this cardiff
	 */
	public void setThemeDisplayLocale(String themeDisplayLocale);

}
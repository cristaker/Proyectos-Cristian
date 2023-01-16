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

package com.cardiff.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link cardiffLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see cardiffLocalService
 * @generated
 */
public class cardiffLocalServiceWrapper
	implements cardiffLocalService, ServiceWrapper<cardiffLocalService> {

	public cardiffLocalServiceWrapper(cardiffLocalService cardiffLocalService) {
		_cardiffLocalService = cardiffLocalService;
	}

	/**
	 * Adds the cardiff to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect cardiffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cardiff the cardiff
	 * @return the cardiff that was added
	 */
	@Override
	public com.cardiff.model.cardiff addcardiff(
		com.cardiff.model.cardiff cardiff) {

		return _cardiffLocalService.addcardiff(cardiff);
	}

	@Override
	public void addCardiff(
		long groupId, long companyId, long userId, String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		String defaultLocale, String taskExecutorClassName, String name,
		long backgroundTaskId, String permissionChecker,
		String siteDefaultLocale, long status, String themeDisplayLocale) {

		_cardiffLocalService.addCardiff(
			groupId, companyId, userId, userName, createDate, modifiedDate,
			defaultLocale, taskExecutorClassName, name, backgroundTaskId,
			permissionChecker, siteDefaultLocale, status, themeDisplayLocale);
	}

	/**
	 * Creates a new cardiff with the primary key. Does not add the cardiff to the database.
	 *
	 * @param cardiffId the primary key for the new cardiff
	 * @return the new cardiff
	 */
	@Override
	public com.cardiff.model.cardiff createcardiff(long cardiffId) {
		return _cardiffLocalService.createcardiff(cardiffId);
	}

	/**
	 * Deletes the cardiff from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect cardiffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cardiff the cardiff
	 * @return the cardiff that was removed
	 */
	@Override
	public com.cardiff.model.cardiff deletecardiff(
		com.cardiff.model.cardiff cardiff) {

		return _cardiffLocalService.deletecardiff(cardiff);
	}

	/**
	 * Deletes the cardiff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect cardiffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff that was removed
	 * @throws PortalException if a cardiff with the primary key could not be found
	 */
	@Override
	public com.cardiff.model.cardiff deletecardiff(long cardiffId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cardiffLocalService.deletecardiff(cardiffId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cardiffLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cardiffLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cardiffLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.cardiff.model.impl.cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _cardiffLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.cardiff.model.impl.cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _cardiffLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cardiffLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _cardiffLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.cardiff.model.cardiff fetchcardiff(long cardiffId) {
		return _cardiffLocalService.fetchcardiff(cardiffId);
	}

	/**
	 * Returns the cardiff matching the UUID and group.
	 *
	 * @param uuid the cardiff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	@Override
	public com.cardiff.model.cardiff fetchcardiffByUuidAndGroupId(
		String uuid, long groupId) {

		return _cardiffLocalService.fetchcardiffByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cardiffLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cardiff with the primary key.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff
	 * @throws PortalException if a cardiff with the primary key could not be found
	 */
	@Override
	public com.cardiff.model.cardiff getcardiff(long cardiffId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cardiffLocalService.getcardiff(cardiffId);
	}

	/**
	 * Returns the cardiff matching the UUID and group.
	 *
	 * @param uuid the cardiff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cardiff
	 * @throws PortalException if a matching cardiff could not be found
	 */
	@Override
	public com.cardiff.model.cardiff getcardiffByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cardiffLocalService.getcardiffByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cardiffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.cardiff.model.impl.cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @return the range of cardiffs
	 */
	@Override
	public java.util.List<com.cardiff.model.cardiff> getcardiffs(
		int start, int end) {

		return _cardiffLocalService.getcardiffs(start, end);
	}

	/**
	 * Returns all the cardiffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the cardiffs
	 * @param companyId the primary key of the company
	 * @return the matching cardiffs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.cardiff.model.cardiff>
		getcardiffsByUuidAndCompanyId(String uuid, long companyId) {

		return _cardiffLocalService.getcardiffsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of cardiffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the cardiffs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cardiffs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.cardiff.model.cardiff>
		getcardiffsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.cardiff.model.cardiff> orderByComparator) {

		return _cardiffLocalService.getcardiffsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cardiffs.
	 *
	 * @return the number of cardiffs
	 */
	@Override
	public int getcardiffsCount() {
		return _cardiffLocalService.getcardiffsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cardiffLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cardiffLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cardiffLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cardiffLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cardiff in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect cardiffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cardiff the cardiff
	 * @return the cardiff that was updated
	 */
	@Override
	public com.cardiff.model.cardiff updatecardiff(
		com.cardiff.model.cardiff cardiff) {

		return _cardiffLocalService.updatecardiff(cardiff);
	}

	@Override
	public cardiffLocalService getWrappedService() {
		return _cardiffLocalService;
	}

	@Override
	public void setWrappedService(cardiffLocalService cardiffLocalService) {
		_cardiffLocalService = cardiffLocalService;
	}

	private cardiffLocalService _cardiffLocalService;

}
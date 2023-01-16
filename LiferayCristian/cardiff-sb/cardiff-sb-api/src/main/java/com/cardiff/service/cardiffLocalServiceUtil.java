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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for cardiff. This utility wraps
 * <code>com.cardiff.service.impl.cardiffLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see cardiffLocalService
 * @generated
 */
public class cardiffLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.cardiff.service.impl.cardiffLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static com.cardiff.model.cardiff addcardiff(
		com.cardiff.model.cardiff cardiff) {

		return getService().addcardiff(cardiff);
	}

	public static void addCardiff(
		long groupId, long companyId, long userId, String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		String defaultLocale, String taskExecutorClassName, String name,
		long backgroundTaskId, String permissionChecker,
		String siteDefaultLocale, long status, String themeDisplayLocale) {

		getService().addCardiff(
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
	public static com.cardiff.model.cardiff createcardiff(long cardiffId) {
		return getService().createcardiff(cardiffId);
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
	public static com.cardiff.model.cardiff deletecardiff(
		com.cardiff.model.cardiff cardiff) {

		return getService().deletecardiff(cardiff);
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
	public static com.cardiff.model.cardiff deletecardiff(long cardiffId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletecardiff(cardiffId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.cardiff.model.cardiff fetchcardiff(long cardiffId) {
		return getService().fetchcardiff(cardiffId);
	}

	/**
	 * Returns the cardiff matching the UUID and group.
	 *
	 * @param uuid the cardiff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public static com.cardiff.model.cardiff fetchcardiffByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchcardiffByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cardiff with the primary key.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff
	 * @throws PortalException if a cardiff with the primary key could not be found
	 */
	public static com.cardiff.model.cardiff getcardiff(long cardiffId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getcardiff(cardiffId);
	}

	/**
	 * Returns the cardiff matching the UUID and group.
	 *
	 * @param uuid the cardiff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cardiff
	 * @throws PortalException if a matching cardiff could not be found
	 */
	public static com.cardiff.model.cardiff getcardiffByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getcardiffByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.cardiff.model.cardiff> getcardiffs(
		int start, int end) {

		return getService().getcardiffs(start, end);
	}

	/**
	 * Returns all the cardiffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the cardiffs
	 * @param companyId the primary key of the company
	 * @return the matching cardiffs, or an empty list if no matches were found
	 */
	public static java.util.List<com.cardiff.model.cardiff>
		getcardiffsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getcardiffsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.cardiff.model.cardiff>
		getcardiffsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.cardiff.model.cardiff> orderByComparator) {

		return getService().getcardiffsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cardiffs.
	 *
	 * @return the number of cardiffs
	 */
	public static int getcardiffsCount() {
		return getService().getcardiffsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static com.cardiff.model.cardiff updatecardiff(
		com.cardiff.model.cardiff cardiff) {

		return getService().updatecardiff(cardiff);
	}

	public static cardiffLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<cardiffLocalService, cardiffLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(cardiffLocalService.class);

		ServiceTracker<cardiffLocalService, cardiffLocalService>
			serviceTracker =
				new ServiceTracker<cardiffLocalService, cardiffLocalService>(
					bundle.getBundleContext(), cardiffLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
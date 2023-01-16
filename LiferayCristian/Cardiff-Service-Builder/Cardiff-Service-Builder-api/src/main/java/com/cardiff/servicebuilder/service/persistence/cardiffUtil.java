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

package com.cardiff.servicebuilder.service.persistence;

import com.cardiff.servicebuilder.model.cardiff;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the cardiff service. This utility wraps <code>com.cardiff.servicebuilder.service.persistence.impl.cardiffPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see cardiffPersistence
 * @generated
 */
public class cardiffUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(cardiff cardiff) {
		getPersistence().clearCache(cardiff);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, cardiff> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<cardiff> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<cardiff> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<cardiff> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<cardiff> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static cardiff update(cardiff cardiff) {
		return getPersistence().update(cardiff);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static cardiff update(
		cardiff cardiff, ServiceContext serviceContext) {

		return getPersistence().update(cardiff, serviceContext);
	}

	/**
	 * Returns all the cardiffs where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching cardiffs
	 */
	public static List<cardiff> findByname(String name) {
		return getPersistence().findByname(name);
	}

	/**
	 * Returns a range of all the cardiffs where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @return the range of matching cardiffs
	 */
	public static List<cardiff> findByname(String name, int start, int end) {
		return getPersistence().findByname(name, start, end);
	}

	/**
	 * Returns an ordered range of all the cardiffs where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cardiffs
	 */
	public static List<cardiff> findByname(
		String name, int start, int end,
		OrderByComparator<cardiff> orderByComparator) {

		return getPersistence().findByname(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cardiffs where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cardiffs
	 */
	public static List<cardiff> findByname(
		String name, int start, int end,
		OrderByComparator<cardiff> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByname(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	public static cardiff findByname_First(
			String name, OrderByComparator<cardiff> orderByComparator)
		throws com.cardiff.servicebuilder.exception.NoSuchcardiffException {

		return getPersistence().findByname_First(name, orderByComparator);
	}

	/**
	 * Returns the first cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public static cardiff fetchByname_First(
		String name, OrderByComparator<cardiff> orderByComparator) {

		return getPersistence().fetchByname_First(name, orderByComparator);
	}

	/**
	 * Returns the last cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	public static cardiff findByname_Last(
			String name, OrderByComparator<cardiff> orderByComparator)
		throws com.cardiff.servicebuilder.exception.NoSuchcardiffException {

		return getPersistence().findByname_Last(name, orderByComparator);
	}

	/**
	 * Returns the last cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public static cardiff fetchByname_Last(
		String name, OrderByComparator<cardiff> orderByComparator) {

		return getPersistence().fetchByname_Last(name, orderByComparator);
	}

	/**
	 * Returns the cardiffs before and after the current cardiff in the ordered set where name = &#63;.
	 *
	 * @param cardiffId the primary key of the current cardiff
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cardiff
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	public static cardiff[] findByname_PrevAndNext(
			long cardiffId, String name,
			OrderByComparator<cardiff> orderByComparator)
		throws com.cardiff.servicebuilder.exception.NoSuchcardiffException {

		return getPersistence().findByname_PrevAndNext(
			cardiffId, name, orderByComparator);
	}

	/**
	 * Removes all the cardiffs where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByname(String name) {
		getPersistence().removeByname(name);
	}

	/**
	 * Returns the number of cardiffs where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching cardiffs
	 */
	public static int countByname(String name) {
		return getPersistence().countByname(name);
	}

	/**
	 * Caches the cardiff in the entity cache if it is enabled.
	 *
	 * @param cardiff the cardiff
	 */
	public static void cacheResult(cardiff cardiff) {
		getPersistence().cacheResult(cardiff);
	}

	/**
	 * Caches the cardiffs in the entity cache if it is enabled.
	 *
	 * @param cardiffs the cardiffs
	 */
	public static void cacheResult(List<cardiff> cardiffs) {
		getPersistence().cacheResult(cardiffs);
	}

	/**
	 * Creates a new cardiff with the primary key. Does not add the cardiff to the database.
	 *
	 * @param cardiffId the primary key for the new cardiff
	 * @return the new cardiff
	 */
	public static cardiff create(long cardiffId) {
		return getPersistence().create(cardiffId);
	}

	/**
	 * Removes the cardiff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff that was removed
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	public static cardiff remove(long cardiffId)
		throws com.cardiff.servicebuilder.exception.NoSuchcardiffException {

		return getPersistence().remove(cardiffId);
	}

	public static cardiff updateImpl(cardiff cardiff) {
		return getPersistence().updateImpl(cardiff);
	}

	/**
	 * Returns the cardiff with the primary key or throws a <code>NoSuchcardiffException</code> if it could not be found.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	public static cardiff findByPrimaryKey(long cardiffId)
		throws com.cardiff.servicebuilder.exception.NoSuchcardiffException {

		return getPersistence().findByPrimaryKey(cardiffId);
	}

	/**
	 * Returns the cardiff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff, or <code>null</code> if a cardiff with the primary key could not be found
	 */
	public static cardiff fetchByPrimaryKey(long cardiffId) {
		return getPersistence().fetchByPrimaryKey(cardiffId);
	}

	/**
	 * Returns all the cardiffs.
	 *
	 * @return the cardiffs
	 */
	public static List<cardiff> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cardiffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @return the range of cardiffs
	 */
	public static List<cardiff> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cardiffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cardiffs
	 */
	public static List<cardiff> findAll(
		int start, int end, OrderByComparator<cardiff> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cardiffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cardiffs
	 */
	public static List<cardiff> findAll(
		int start, int end, OrderByComparator<cardiff> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cardiffs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cardiffs.
	 *
	 * @return the number of cardiffs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static cardiffPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<cardiffPersistence, cardiffPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(cardiffPersistence.class);

		ServiceTracker<cardiffPersistence, cardiffPersistence> serviceTracker =
			new ServiceTracker<cardiffPersistence, cardiffPersistence>(
				bundle.getBundleContext(), cardiffPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
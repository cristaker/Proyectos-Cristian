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

package com.liferay.training.crud.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.crud.model.crud;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the crud service. This utility wraps <code>com.liferay.training.crud.service.persistence.impl.crudPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see crudPersistence
 * @generated
 */
public class crudUtil {

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
	public static void clearCache(crud crud) {
		getPersistence().clearCache(crud);
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
	public static Map<Serializable, crud> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<crud> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<crud> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<crud> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<crud> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static crud update(crud crud) {
		return getPersistence().update(crud);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static crud update(crud crud, ServiceContext serviceContext) {
		return getPersistence().update(crud, serviceContext);
	}

	/**
	 * Returns all the cruds where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @return the matching cruds
	 */
	public static List<crud> findBynombre(String nombre, String apellido) {
		return getPersistence().findBynombre(nombre, apellido);
	}

	/**
	 * Returns a range of all the cruds where nombre = &#63; and apellido = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>crudModelImpl</code>.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @return the range of matching cruds
	 */
	public static List<crud> findBynombre(
		String nombre, String apellido, int start, int end) {

		return getPersistence().findBynombre(nombre, apellido, start, end);
	}

	/**
	 * Returns an ordered range of all the cruds where nombre = &#63; and apellido = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>crudModelImpl</code>.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cruds
	 */
	public static List<crud> findBynombre(
		String nombre, String apellido, int start, int end,
		OrderByComparator<crud> orderByComparator) {

		return getPersistence().findBynombre(
			nombre, apellido, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cruds where nombre = &#63; and apellido = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>crudModelImpl</code>.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cruds
	 */
	public static List<crud> findBynombre(
		String nombre, String apellido, int start, int end,
		OrderByComparator<crud> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBynombre(
			nombre, apellido, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud
	 * @throws NoSuchcrudException if a matching crud could not be found
	 */
	public static crud findBynombre_First(
			String nombre, String apellido,
			OrderByComparator<crud> orderByComparator)
		throws com.liferay.training.crud.exception.NoSuchcrudException {

		return getPersistence().findBynombre_First(
			nombre, apellido, orderByComparator);
	}

	/**
	 * Returns the first crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public static crud fetchBynombre_First(
		String nombre, String apellido,
		OrderByComparator<crud> orderByComparator) {

		return getPersistence().fetchBynombre_First(
			nombre, apellido, orderByComparator);
	}

	/**
	 * Returns the last crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud
	 * @throws NoSuchcrudException if a matching crud could not be found
	 */
	public static crud findBynombre_Last(
			String nombre, String apellido,
			OrderByComparator<crud> orderByComparator)
		throws com.liferay.training.crud.exception.NoSuchcrudException {

		return getPersistence().findBynombre_Last(
			nombre, apellido, orderByComparator);
	}

	/**
	 * Returns the last crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public static crud fetchBynombre_Last(
		String nombre, String apellido,
		OrderByComparator<crud> orderByComparator) {

		return getPersistence().fetchBynombre_Last(
			nombre, apellido, orderByComparator);
	}

	/**
	 * Returns the cruds before and after the current crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param crudId the primary key of the current crud
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next crud
	 * @throws NoSuchcrudException if a crud with the primary key could not be found
	 */
	public static crud[] findBynombre_PrevAndNext(
			long crudId, String nombre, String apellido,
			OrderByComparator<crud> orderByComparator)
		throws com.liferay.training.crud.exception.NoSuchcrudException {

		return getPersistence().findBynombre_PrevAndNext(
			crudId, nombre, apellido, orderByComparator);
	}

	/**
	 * Removes all the cruds where nombre = &#63; and apellido = &#63; from the database.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 */
	public static void removeBynombre(String nombre, String apellido) {
		getPersistence().removeBynombre(nombre, apellido);
	}

	/**
	 * Returns the number of cruds where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @return the number of matching cruds
	 */
	public static int countBynombre(String nombre, String apellido) {
		return getPersistence().countBynombre(nombre, apellido);
	}

	/**
	 * Caches the crud in the entity cache if it is enabled.
	 *
	 * @param crud the crud
	 */
	public static void cacheResult(crud crud) {
		getPersistence().cacheResult(crud);
	}

	/**
	 * Caches the cruds in the entity cache if it is enabled.
	 *
	 * @param cruds the cruds
	 */
	public static void cacheResult(List<crud> cruds) {
		getPersistence().cacheResult(cruds);
	}

	/**
	 * Creates a new crud with the primary key. Does not add the crud to the database.
	 *
	 * @param crudId the primary key for the new crud
	 * @return the new crud
	 */
	public static crud create(long crudId) {
		return getPersistence().create(crudId);
	}

	/**
	 * Removes the crud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud that was removed
	 * @throws NoSuchcrudException if a crud with the primary key could not be found
	 */
	public static crud remove(long crudId)
		throws com.liferay.training.crud.exception.NoSuchcrudException {

		return getPersistence().remove(crudId);
	}

	public static crud updateImpl(crud crud) {
		return getPersistence().updateImpl(crud);
	}

	/**
	 * Returns the crud with the primary key or throws a <code>NoSuchcrudException</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud
	 * @throws NoSuchcrudException if a crud with the primary key could not be found
	 */
	public static crud findByPrimaryKey(long crudId)
		throws com.liferay.training.crud.exception.NoSuchcrudException {

		return getPersistence().findByPrimaryKey(crudId);
	}

	/**
	 * Returns the crud with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud, or <code>null</code> if a crud with the primary key could not be found
	 */
	public static crud fetchByPrimaryKey(long crudId) {
		return getPersistence().fetchByPrimaryKey(crudId);
	}

	/**
	 * Returns all the cruds.
	 *
	 * @return the cruds
	 */
	public static List<crud> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cruds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>crudModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @return the range of cruds
	 */
	public static List<crud> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cruds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>crudModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cruds
	 */
	public static List<crud> findAll(
		int start, int end, OrderByComparator<crud> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cruds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>crudModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cruds
	 */
	public static List<crud> findAll(
		int start, int end, OrderByComparator<crud> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cruds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cruds.
	 *
	 * @return the number of cruds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static crudPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<crudPersistence, crudPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(crudPersistence.class);

		ServiceTracker<crudPersistence, crudPersistence> serviceTracker =
			new ServiceTracker<crudPersistence, crudPersistence>(
				bundle.getBundleContext(), crudPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
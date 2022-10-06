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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.crud.exception.NoSuchcrudException;
import com.liferay.training.crud.model.crud;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the crud service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see crudUtil
 * @generated
 */
@ProviderType
public interface crudPersistence extends BasePersistence<crud> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link crudUtil} to access the crud persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cruds where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @return the matching cruds
	 */
	public java.util.List<crud> findBynombre(String nombre, String apellido);

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
	public java.util.List<crud> findBynombre(
		String nombre, String apellido, int start, int end);

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
	public java.util.List<crud> findBynombre(
		String nombre, String apellido, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<crud>
			orderByComparator);

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
	public java.util.List<crud> findBynombre(
		String nombre, String apellido, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<crud>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud
	 * @throws NoSuchcrudException if a matching crud could not be found
	 */
	public crud findBynombre_First(
			String nombre, String apellido,
			com.liferay.portal.kernel.util.OrderByComparator<crud>
				orderByComparator)
		throws NoSuchcrudException;

	/**
	 * Returns the first crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public crud fetchBynombre_First(
		String nombre, String apellido,
		com.liferay.portal.kernel.util.OrderByComparator<crud>
			orderByComparator);

	/**
	 * Returns the last crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud
	 * @throws NoSuchcrudException if a matching crud could not be found
	 */
	public crud findBynombre_Last(
			String nombre, String apellido,
			com.liferay.portal.kernel.util.OrderByComparator<crud>
				orderByComparator)
		throws NoSuchcrudException;

	/**
	 * Returns the last crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud, or <code>null</code> if a matching crud could not be found
	 */
	public crud fetchBynombre_Last(
		String nombre, String apellido,
		com.liferay.portal.kernel.util.OrderByComparator<crud>
			orderByComparator);

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
	public crud[] findBynombre_PrevAndNext(
			long crudId, String nombre, String apellido,
			com.liferay.portal.kernel.util.OrderByComparator<crud>
				orderByComparator)
		throws NoSuchcrudException;

	/**
	 * Removes all the cruds where nombre = &#63; and apellido = &#63; from the database.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 */
	public void removeBynombre(String nombre, String apellido);

	/**
	 * Returns the number of cruds where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @return the number of matching cruds
	 */
	public int countBynombre(String nombre, String apellido);

	/**
	 * Caches the crud in the entity cache if it is enabled.
	 *
	 * @param crud the crud
	 */
	public void cacheResult(crud crud);

	/**
	 * Caches the cruds in the entity cache if it is enabled.
	 *
	 * @param cruds the cruds
	 */
	public void cacheResult(java.util.List<crud> cruds);

	/**
	 * Creates a new crud with the primary key. Does not add the crud to the database.
	 *
	 * @param crudId the primary key for the new crud
	 * @return the new crud
	 */
	public crud create(long crudId);

	/**
	 * Removes the crud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud that was removed
	 * @throws NoSuchcrudException if a crud with the primary key could not be found
	 */
	public crud remove(long crudId) throws NoSuchcrudException;

	public crud updateImpl(crud crud);

	/**
	 * Returns the crud with the primary key or throws a <code>NoSuchcrudException</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud
	 * @throws NoSuchcrudException if a crud with the primary key could not be found
	 */
	public crud findByPrimaryKey(long crudId) throws NoSuchcrudException;

	/**
	 * Returns the crud with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud, or <code>null</code> if a crud with the primary key could not be found
	 */
	public crud fetchByPrimaryKey(long crudId);

	/**
	 * Returns all the cruds.
	 *
	 * @return the cruds
	 */
	public java.util.List<crud> findAll();

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
	public java.util.List<crud> findAll(int start, int end);

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
	public java.util.List<crud> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<crud>
			orderByComparator);

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
	public java.util.List<crud> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<crud>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cruds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cruds.
	 *
	 * @return the number of cruds
	 */
	public int countAll();

}
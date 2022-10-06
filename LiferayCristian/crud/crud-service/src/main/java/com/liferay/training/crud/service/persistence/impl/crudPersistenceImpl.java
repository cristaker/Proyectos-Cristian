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

package com.liferay.training.crud.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.training.crud.exception.NoSuchcrudException;
import com.liferay.training.crud.model.crud;
import com.liferay.training.crud.model.impl.crudImpl;
import com.liferay.training.crud.model.impl.crudModelImpl;
import com.liferay.training.crud.service.persistence.crudPersistence;
import com.liferay.training.crud.service.persistence.impl.constants.ActualizacionDeDatosPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the crud service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = crudPersistence.class)
public class crudPersistenceImpl
	extends BasePersistenceImpl<crud> implements crudPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>crudUtil</code> to access the crud persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		crudImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBynombre;
	private FinderPath _finderPathWithoutPaginationFindBynombre;
	private FinderPath _finderPathCountBynombre;

	/**
	 * Returns all the cruds where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @return the matching cruds
	 */
	@Override
	public List<crud> findBynombre(String nombre, String apellido) {
		return findBynombre(
			nombre, apellido, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<crud> findBynombre(
		String nombre, String apellido, int start, int end) {

		return findBynombre(nombre, apellido, start, end, null);
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
	@Override
	public List<crud> findBynombre(
		String nombre, String apellido, int start, int end,
		OrderByComparator<crud> orderByComparator) {

		return findBynombre(
			nombre, apellido, start, end, orderByComparator, true);
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
	@Override
	public List<crud> findBynombre(
		String nombre, String apellido, int start, int end,
		OrderByComparator<crud> orderByComparator, boolean useFinderCache) {

		nombre = Objects.toString(nombre, "");
		apellido = Objects.toString(apellido, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBynombre;
				finderArgs = new Object[] {nombre, apellido};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBynombre;
			finderArgs = new Object[] {
				nombre, apellido, start, end, orderByComparator
			};
		}

		List<crud> list = null;

		if (useFinderCache) {
			list = (List<crud>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (crud crud : list) {
					if (!nombre.equals(crud.getNombre()) ||
						!apellido.equals(crud.getApellido())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CRUD_WHERE);

			boolean bindNombre = false;

			if (nombre.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBRE_NOMBRE_3);
			}
			else {
				bindNombre = true;

				sb.append(_FINDER_COLUMN_NOMBRE_NOMBRE_2);
			}

			boolean bindApellido = false;

			if (apellido.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBRE_APELLIDO_3);
			}
			else {
				bindApellido = true;

				sb.append(_FINDER_COLUMN_NOMBRE_APELLIDO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(crudModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombre) {
					queryPos.add(nombre);
				}

				if (bindApellido) {
					queryPos.add(apellido);
				}

				list = (List<crud>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public crud findBynombre_First(
			String nombre, String apellido,
			OrderByComparator<crud> orderByComparator)
		throws NoSuchcrudException {

		crud crud = fetchBynombre_First(nombre, apellido, orderByComparator);

		if (crud != null) {
			return crud;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombre=");
		sb.append(nombre);

		sb.append(", apellido=");
		sb.append(apellido);

		sb.append("}");

		throw new NoSuchcrudException(sb.toString());
	}

	/**
	 * Returns the first crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching crud, or <code>null</code> if a matching crud could not be found
	 */
	@Override
	public crud fetchBynombre_First(
		String nombre, String apellido,
		OrderByComparator<crud> orderByComparator) {

		List<crud> list = findBynombre(
			nombre, apellido, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public crud findBynombre_Last(
			String nombre, String apellido,
			OrderByComparator<crud> orderByComparator)
		throws NoSuchcrudException {

		crud crud = fetchBynombre_Last(nombre, apellido, orderByComparator);

		if (crud != null) {
			return crud;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nombre=");
		sb.append(nombre);

		sb.append(", apellido=");
		sb.append(apellido);

		sb.append("}");

		throw new NoSuchcrudException(sb.toString());
	}

	/**
	 * Returns the last crud in the ordered set where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching crud, or <code>null</code> if a matching crud could not be found
	 */
	@Override
	public crud fetchBynombre_Last(
		String nombre, String apellido,
		OrderByComparator<crud> orderByComparator) {

		int count = countBynombre(nombre, apellido);

		if (count == 0) {
			return null;
		}

		List<crud> list = findBynombre(
			nombre, apellido, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public crud[] findBynombre_PrevAndNext(
			long crudId, String nombre, String apellido,
			OrderByComparator<crud> orderByComparator)
		throws NoSuchcrudException {

		nombre = Objects.toString(nombre, "");
		apellido = Objects.toString(apellido, "");

		crud crud = findByPrimaryKey(crudId);

		Session session = null;

		try {
			session = openSession();

			crud[] array = new crudImpl[3];

			array[0] = getBynombre_PrevAndNext(
				session, crud, nombre, apellido, orderByComparator, true);

			array[1] = crud;

			array[2] = getBynombre_PrevAndNext(
				session, crud, nombre, apellido, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected crud getBynombre_PrevAndNext(
		Session session, crud crud, String nombre, String apellido,
		OrderByComparator<crud> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CRUD_WHERE);

		boolean bindNombre = false;

		if (nombre.isEmpty()) {
			sb.append(_FINDER_COLUMN_NOMBRE_NOMBRE_3);
		}
		else {
			bindNombre = true;

			sb.append(_FINDER_COLUMN_NOMBRE_NOMBRE_2);
		}

		boolean bindApellido = false;

		if (apellido.isEmpty()) {
			sb.append(_FINDER_COLUMN_NOMBRE_APELLIDO_3);
		}
		else {
			bindApellido = true;

			sb.append(_FINDER_COLUMN_NOMBRE_APELLIDO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(crudModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindNombre) {
			queryPos.add(nombre);
		}

		if (bindApellido) {
			queryPos.add(apellido);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(crud)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<crud> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cruds where nombre = &#63; and apellido = &#63; from the database.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 */
	@Override
	public void removeBynombre(String nombre, String apellido) {
		for (crud crud :
				findBynombre(
					nombre, apellido, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(crud);
		}
	}

	/**
	 * Returns the number of cruds where nombre = &#63; and apellido = &#63;.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @return the number of matching cruds
	 */
	@Override
	public int countBynombre(String nombre, String apellido) {
		nombre = Objects.toString(nombre, "");
		apellido = Objects.toString(apellido, "");

		FinderPath finderPath = _finderPathCountBynombre;

		Object[] finderArgs = new Object[] {nombre, apellido};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CRUD_WHERE);

			boolean bindNombre = false;

			if (nombre.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBRE_NOMBRE_3);
			}
			else {
				bindNombre = true;

				sb.append(_FINDER_COLUMN_NOMBRE_NOMBRE_2);
			}

			boolean bindApellido = false;

			if (apellido.isEmpty()) {
				sb.append(_FINDER_COLUMN_NOMBRE_APELLIDO_3);
			}
			else {
				bindApellido = true;

				sb.append(_FINDER_COLUMN_NOMBRE_APELLIDO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindNombre) {
					queryPos.add(nombre);
				}

				if (bindApellido) {
					queryPos.add(apellido);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_2 =
		"crud.nombre = ? AND ";

	private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_3 =
		"(crud.nombre IS NULL OR crud.nombre = '') AND ";

	private static final String _FINDER_COLUMN_NOMBRE_APELLIDO_2 =
		"crud.apellido = ?";

	private static final String _FINDER_COLUMN_NOMBRE_APELLIDO_3 =
		"(crud.apellido IS NULL OR crud.apellido = '')";

	public crudPersistenceImpl() {
		setModelClass(crud.class);

		setModelImplClass(crudImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the crud in the entity cache if it is enabled.
	 *
	 * @param crud the crud
	 */
	@Override
	public void cacheResult(crud crud) {
		entityCache.putResult(
			entityCacheEnabled, crudImpl.class, crud.getPrimaryKey(), crud);

		crud.resetOriginalValues();
	}

	/**
	 * Caches the cruds in the entity cache if it is enabled.
	 *
	 * @param cruds the cruds
	 */
	@Override
	public void cacheResult(List<crud> cruds) {
		for (crud crud : cruds) {
			if (entityCache.getResult(
					entityCacheEnabled, crudImpl.class, crud.getPrimaryKey()) ==
						null) {

				cacheResult(crud);
			}
			else {
				crud.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cruds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(crudImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the crud.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(crud crud) {
		entityCache.removeResult(
			entityCacheEnabled, crudImpl.class, crud.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<crud> cruds) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (crud crud : cruds) {
			entityCache.removeResult(
				entityCacheEnabled, crudImpl.class, crud.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, crudImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new crud with the primary key. Does not add the crud to the database.
	 *
	 * @param crudId the primary key for the new crud
	 * @return the new crud
	 */
	@Override
	public crud create(long crudId) {
		crud crud = new crudImpl();

		crud.setNew(true);
		crud.setPrimaryKey(crudId);

		crud.setCompanyId(CompanyThreadLocal.getCompanyId());

		return crud;
	}

	/**
	 * Removes the crud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud that was removed
	 * @throws NoSuchcrudException if a crud with the primary key could not be found
	 */
	@Override
	public crud remove(long crudId) throws NoSuchcrudException {
		return remove((Serializable)crudId);
	}

	/**
	 * Removes the crud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the crud
	 * @return the crud that was removed
	 * @throws NoSuchcrudException if a crud with the primary key could not be found
	 */
	@Override
	public crud remove(Serializable primaryKey) throws NoSuchcrudException {
		Session session = null;

		try {
			session = openSession();

			crud crud = (crud)session.get(crudImpl.class, primaryKey);

			if (crud == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcrudException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(crud);
		}
		catch (NoSuchcrudException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected crud removeImpl(crud crud) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(crud)) {
				crud = (crud)session.get(
					crudImpl.class, crud.getPrimaryKeyObj());
			}

			if (crud != null) {
				session.delete(crud);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (crud != null) {
			clearCache(crud);
		}

		return crud;
	}

	@Override
	public crud updateImpl(crud crud) {
		boolean isNew = crud.isNew();

		if (!(crud instanceof crudModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(crud.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(crud);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in crud proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom crud implementation " +
					crud.getClass());
		}

		crudModelImpl crudModelImpl = (crudModelImpl)crud;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (crud.getCreateDate() == null)) {
			if (serviceContext == null) {
				crud.setCreateDate(now);
			}
			else {
				crud.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!crudModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				crud.setModifiedDate(now);
			}
			else {
				crud.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (crud.isNew()) {
				session.save(crud);

				crud.setNew(false);
			}
			else {
				crud = (crud)session.merge(crud);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {
				crudModelImpl.getNombre(), crudModelImpl.getApellido()
			};

			finderCache.removeResult(_finderPathCountBynombre, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBynombre, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((crudModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBynombre.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					crudModelImpl.getOriginalNombre(),
					crudModelImpl.getOriginalApellido()
				};

				finderCache.removeResult(_finderPathCountBynombre, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBynombre, args);

				args = new Object[] {
					crudModelImpl.getNombre(), crudModelImpl.getApellido()
				};

				finderCache.removeResult(_finderPathCountBynombre, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBynombre, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, crudImpl.class, crud.getPrimaryKey(), crud,
			false);

		crud.resetOriginalValues();

		return crud;
	}

	/**
	 * Returns the crud with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the crud
	 * @return the crud
	 * @throws NoSuchcrudException if a crud with the primary key could not be found
	 */
	@Override
	public crud findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcrudException {

		crud crud = fetchByPrimaryKey(primaryKey);

		if (crud == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcrudException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return crud;
	}

	/**
	 * Returns the crud with the primary key or throws a <code>NoSuchcrudException</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud
	 * @throws NoSuchcrudException if a crud with the primary key could not be found
	 */
	@Override
	public crud findByPrimaryKey(long crudId) throws NoSuchcrudException {
		return findByPrimaryKey((Serializable)crudId);
	}

	/**
	 * Returns the crud with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud, or <code>null</code> if a crud with the primary key could not be found
	 */
	@Override
	public crud fetchByPrimaryKey(long crudId) {
		return fetchByPrimaryKey((Serializable)crudId);
	}

	/**
	 * Returns all the cruds.
	 *
	 * @return the cruds
	 */
	@Override
	public List<crud> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<crud> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<crud> findAll(
		int start, int end, OrderByComparator<crud> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<crud> findAll(
		int start, int end, OrderByComparator<crud> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<crud> list = null;

		if (useFinderCache) {
			list = (List<crud>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CRUD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CRUD;

				sql = sql.concat(crudModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<crud>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the cruds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (crud crud : findAll()) {
			remove(crud);
		}
	}

	/**
	 * Returns the number of cruds.
	 *
	 * @return the number of cruds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CRUD);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "crudId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CRUD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return crudModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the crud persistence.
	 */
	@Activate
	public void activate() {
		crudModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		crudModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, crudImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, crudImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindBynombre = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, crudImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBynombre",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBynombre = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, crudImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBynombre",
			new String[] {String.class.getName(), String.class.getName()},
			crudModelImpl.NOMBRE_COLUMN_BITMASK |
			crudModelImpl.APELLIDO_COLUMN_BITMASK);

		_finderPathCountBynombre = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBynombre",
			new String[] {String.class.getName(), String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(crudImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = ActualizacionDeDatosPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.liferay.training.crud.model.crud"),
			true);
	}

	@Override
	@Reference(
		target = ActualizacionDeDatosPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ActualizacionDeDatosPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CRUD = "SELECT crud FROM crud crud";

	private static final String _SQL_SELECT_CRUD_WHERE =
		"SELECT crud FROM crud crud WHERE ";

	private static final String _SQL_COUNT_CRUD =
		"SELECT COUNT(crud) FROM crud crud";

	private static final String _SQL_COUNT_CRUD_WHERE =
		"SELECT COUNT(crud) FROM crud crud WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "crud.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No crud exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No crud exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		crudPersistenceImpl.class);

	static {
		try {
			Class.forName(
				ActualizacionDeDatosPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}
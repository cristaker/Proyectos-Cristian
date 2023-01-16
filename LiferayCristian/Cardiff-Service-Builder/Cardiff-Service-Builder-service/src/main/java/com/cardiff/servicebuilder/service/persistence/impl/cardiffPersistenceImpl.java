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

package com.cardiff.servicebuilder.service.persistence.impl;

import com.cardiff.servicebuilder.exception.NoSuchcardiffException;
import com.cardiff.servicebuilder.model.cardiff;
import com.cardiff.servicebuilder.model.impl.cardiffImpl;
import com.cardiff.servicebuilder.model.impl.cardiffModelImpl;
import com.cardiff.servicebuilder.service.persistence.cardiffPersistence;
import com.cardiff.servicebuilder.service.persistence.impl.constants.CardiffPersistenceConstants;

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
 * The persistence implementation for the cardiff service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = cardiffPersistence.class)
public class cardiffPersistenceImpl
	extends BasePersistenceImpl<cardiff> implements cardiffPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>cardiffUtil</code> to access the cardiff persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		cardiffImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByname;
	private FinderPath _finderPathWithoutPaginationFindByname;
	private FinderPath _finderPathCountByname;

	/**
	 * Returns all the cardiffs where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching cardiffs
	 */
	@Override
	public List<cardiff> findByname(String name) {
		return findByname(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<cardiff> findByname(String name, int start, int end) {
		return findByname(name, start, end, null);
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
	@Override
	public List<cardiff> findByname(
		String name, int start, int end,
		OrderByComparator<cardiff> orderByComparator) {

		return findByname(name, start, end, orderByComparator, true);
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
	@Override
	public List<cardiff> findByname(
		String name, int start, int end,
		OrderByComparator<cardiff> orderByComparator, boolean useFinderCache) {

		name = Objects.toString(name, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByname;
				finderArgs = new Object[] {name};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByname;
			finderArgs = new Object[] {name, start, end, orderByComparator};
		}

		List<cardiff> list = null;

		if (useFinderCache) {
			list = (List<cardiff>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (cardiff cardiff : list) {
					if (!name.equals(cardiff.getName())) {
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
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CARDIFF_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				sb.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				sb.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(cardiffModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindName) {
					queryPos.add(name);
				}

				list = (List<cardiff>)QueryUtil.list(
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
	 * Returns the first cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	@Override
	public cardiff findByname_First(
			String name, OrderByComparator<cardiff> orderByComparator)
		throws NoSuchcardiffException {

		cardiff cardiff = fetchByname_First(name, orderByComparator);

		if (cardiff != null) {
			return cardiff;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("name=");
		sb.append(name);

		sb.append("}");

		throw new NoSuchcardiffException(sb.toString());
	}

	/**
	 * Returns the first cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	@Override
	public cardiff fetchByname_First(
		String name, OrderByComparator<cardiff> orderByComparator) {

		List<cardiff> list = findByname(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	@Override
	public cardiff findByname_Last(
			String name, OrderByComparator<cardiff> orderByComparator)
		throws NoSuchcardiffException {

		cardiff cardiff = fetchByname_Last(name, orderByComparator);

		if (cardiff != null) {
			return cardiff;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("name=");
		sb.append(name);

		sb.append("}");

		throw new NoSuchcardiffException(sb.toString());
	}

	/**
	 * Returns the last cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	@Override
	public cardiff fetchByname_Last(
		String name, OrderByComparator<cardiff> orderByComparator) {

		int count = countByname(name);

		if (count == 0) {
			return null;
		}

		List<cardiff> list = findByname(
			name, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public cardiff[] findByname_PrevAndNext(
			long cardiffId, String name,
			OrderByComparator<cardiff> orderByComparator)
		throws NoSuchcardiffException {

		name = Objects.toString(name, "");

		cardiff cardiff = findByPrimaryKey(cardiffId);

		Session session = null;

		try {
			session = openSession();

			cardiff[] array = new cardiffImpl[3];

			array[0] = getByname_PrevAndNext(
				session, cardiff, name, orderByComparator, true);

			array[1] = cardiff;

			array[2] = getByname_PrevAndNext(
				session, cardiff, name, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected cardiff getByname_PrevAndNext(
		Session session, cardiff cardiff, String name,
		OrderByComparator<cardiff> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CARDIFF_WHERE);

		boolean bindName = false;

		if (name.isEmpty()) {
			sb.append(_FINDER_COLUMN_NAME_NAME_3);
		}
		else {
			bindName = true;

			sb.append(_FINDER_COLUMN_NAME_NAME_2);
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
			sb.append(cardiffModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindName) {
			queryPos.add(name);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(cardiff)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<cardiff> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cardiffs where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	@Override
	public void removeByname(String name) {
		for (cardiff cardiff :
				findByname(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cardiff);
		}
	}

	/**
	 * Returns the number of cardiffs where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching cardiffs
	 */
	@Override
	public int countByname(String name) {
		name = Objects.toString(name, "");

		FinderPath finderPath = _finderPathCountByname;

		Object[] finderArgs = new Object[] {name};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CARDIFF_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				sb.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				sb.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindName) {
					queryPos.add(name);
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

	private static final String _FINDER_COLUMN_NAME_NAME_2 = "cardiff.name = ?";

	private static final String _FINDER_COLUMN_NAME_NAME_3 =
		"(cardiff.name IS NULL OR cardiff.name = '')";

	public cardiffPersistenceImpl() {
		setModelClass(cardiff.class);

		setModelImplClass(cardiffImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the cardiff in the entity cache if it is enabled.
	 *
	 * @param cardiff the cardiff
	 */
	@Override
	public void cacheResult(cardiff cardiff) {
		entityCache.putResult(
			entityCacheEnabled, cardiffImpl.class, cardiff.getPrimaryKey(),
			cardiff);

		cardiff.resetOriginalValues();
	}

	/**
	 * Caches the cardiffs in the entity cache if it is enabled.
	 *
	 * @param cardiffs the cardiffs
	 */
	@Override
	public void cacheResult(List<cardiff> cardiffs) {
		for (cardiff cardiff : cardiffs) {
			if (entityCache.getResult(
					entityCacheEnabled, cardiffImpl.class,
					cardiff.getPrimaryKey()) == null) {

				cacheResult(cardiff);
			}
			else {
				cardiff.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cardiffs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(cardiffImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cardiff.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(cardiff cardiff) {
		entityCache.removeResult(
			entityCacheEnabled, cardiffImpl.class, cardiff.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<cardiff> cardiffs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (cardiff cardiff : cardiffs) {
			entityCache.removeResult(
				entityCacheEnabled, cardiffImpl.class, cardiff.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, cardiffImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cardiff with the primary key. Does not add the cardiff to the database.
	 *
	 * @param cardiffId the primary key for the new cardiff
	 * @return the new cardiff
	 */
	@Override
	public cardiff create(long cardiffId) {
		cardiff cardiff = new cardiffImpl();

		cardiff.setNew(true);
		cardiff.setPrimaryKey(cardiffId);

		cardiff.setCompanyId(CompanyThreadLocal.getCompanyId());

		return cardiff;
	}

	/**
	 * Removes the cardiff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff that was removed
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	@Override
	public cardiff remove(long cardiffId) throws NoSuchcardiffException {
		return remove((Serializable)cardiffId);
	}

	/**
	 * Removes the cardiff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cardiff
	 * @return the cardiff that was removed
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	@Override
	public cardiff remove(Serializable primaryKey)
		throws NoSuchcardiffException {

		Session session = null;

		try {
			session = openSession();

			cardiff cardiff = (cardiff)session.get(
				cardiffImpl.class, primaryKey);

			if (cardiff == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcardiffException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cardiff);
		}
		catch (NoSuchcardiffException noSuchEntityException) {
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
	protected cardiff removeImpl(cardiff cardiff) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cardiff)) {
				cardiff = (cardiff)session.get(
					cardiffImpl.class, cardiff.getPrimaryKeyObj());
			}

			if (cardiff != null) {
				session.delete(cardiff);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cardiff != null) {
			clearCache(cardiff);
		}

		return cardiff;
	}

	@Override
	public cardiff updateImpl(cardiff cardiff) {
		boolean isNew = cardiff.isNew();

		if (!(cardiff instanceof cardiffModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cardiff.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cardiff);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cardiff proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom cardiff implementation " +
					cardiff.getClass());
		}

		cardiffModelImpl cardiffModelImpl = (cardiffModelImpl)cardiff;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (cardiff.getCreateDate() == null)) {
			if (serviceContext == null) {
				cardiff.setCreateDate(now);
			}
			else {
				cardiff.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!cardiffModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cardiff.setModifiedDate(now);
			}
			else {
				cardiff.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (cardiff.isNew()) {
				session.save(cardiff);

				cardiff.setNew(false);
			}
			else {
				cardiff = (cardiff)session.merge(cardiff);
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
			Object[] args = new Object[] {cardiffModelImpl.getName()};

			finderCache.removeResult(_finderPathCountByname, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByname, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((cardiffModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByname.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					cardiffModelImpl.getOriginalName()
				};

				finderCache.removeResult(_finderPathCountByname, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByname, args);

				args = new Object[] {cardiffModelImpl.getName()};

				finderCache.removeResult(_finderPathCountByname, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByname, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, cardiffImpl.class, cardiff.getPrimaryKey(),
			cardiff, false);

		cardiff.resetOriginalValues();

		return cardiff;
	}

	/**
	 * Returns the cardiff with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cardiff
	 * @return the cardiff
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	@Override
	public cardiff findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcardiffException {

		cardiff cardiff = fetchByPrimaryKey(primaryKey);

		if (cardiff == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcardiffException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cardiff;
	}

	/**
	 * Returns the cardiff with the primary key or throws a <code>NoSuchcardiffException</code> if it could not be found.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	@Override
	public cardiff findByPrimaryKey(long cardiffId)
		throws NoSuchcardiffException {

		return findByPrimaryKey((Serializable)cardiffId);
	}

	/**
	 * Returns the cardiff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff, or <code>null</code> if a cardiff with the primary key could not be found
	 */
	@Override
	public cardiff fetchByPrimaryKey(long cardiffId) {
		return fetchByPrimaryKey((Serializable)cardiffId);
	}

	/**
	 * Returns all the cardiffs.
	 *
	 * @return the cardiffs
	 */
	@Override
	public List<cardiff> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<cardiff> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<cardiff> findAll(
		int start, int end, OrderByComparator<cardiff> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<cardiff> findAll(
		int start, int end, OrderByComparator<cardiff> orderByComparator,
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

		List<cardiff> list = null;

		if (useFinderCache) {
			list = (List<cardiff>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CARDIFF);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CARDIFF;

				sql = sql.concat(cardiffModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<cardiff>)QueryUtil.list(
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
	 * Removes all the cardiffs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (cardiff cardiff : findAll()) {
			remove(cardiff);
		}
	}

	/**
	 * Returns the number of cardiffs.
	 *
	 * @return the number of cardiffs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CARDIFF);

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
		return "cardiffId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CARDIFF;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return cardiffModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cardiff persistence.
	 */
	@Activate
	public void activate() {
		cardiffModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		cardiffModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, cardiffImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, cardiffImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByname = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, cardiffImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByname",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByname = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, cardiffImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByname",
			new String[] {String.class.getName()},
			cardiffModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByname = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByname",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(cardiffImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = CardiffPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.cardiff.servicebuilder.model.cardiff"),
			true);
	}

	@Override
	@Reference(
		target = CardiffPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CardiffPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
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

	private static final String _SQL_SELECT_CARDIFF =
		"SELECT cardiff FROM cardiff cardiff";

	private static final String _SQL_SELECT_CARDIFF_WHERE =
		"SELECT cardiff FROM cardiff cardiff WHERE ";

	private static final String _SQL_COUNT_CARDIFF =
		"SELECT COUNT(cardiff) FROM cardiff cardiff";

	private static final String _SQL_COUNT_CARDIFF_WHERE =
		"SELECT COUNT(cardiff) FROM cardiff cardiff WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "cardiff.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No cardiff exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No cardiff exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		cardiffPersistenceImpl.class);

	static {
		try {
			Class.forName(CardiffPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}
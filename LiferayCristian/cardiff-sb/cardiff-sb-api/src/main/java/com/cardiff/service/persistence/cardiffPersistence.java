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

package com.cardiff.service.persistence;

import com.cardiff.exception.NoSuchcardiffException;
import com.cardiff.model.cardiff;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cardiff service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see cardiffUtil
 * @generated
 */
@ProviderType
public interface cardiffPersistence extends BasePersistence<cardiff> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link cardiffUtil} to access the cardiff persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cardiffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cardiffs
	 */
	public java.util.List<cardiff> findByUuid(String uuid);

	/**
	 * Returns a range of all the cardiffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @return the range of matching cardiffs
	 */
	public java.util.List<cardiff> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cardiffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cardiffs
	 */
	public java.util.List<cardiff> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cardiffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cardiffs
	 */
	public java.util.List<cardiff> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cardiff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	public cardiff findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<cardiff>
				orderByComparator)
		throws NoSuchcardiffException;

	/**
	 * Returns the first cardiff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public cardiff fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

	/**
	 * Returns the last cardiff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	public cardiff findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<cardiff>
				orderByComparator)
		throws NoSuchcardiffException;

	/**
	 * Returns the last cardiff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public cardiff fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

	/**
	 * Returns the cardiffs before and after the current cardiff in the ordered set where uuid = &#63;.
	 *
	 * @param cardiffId the primary key of the current cardiff
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cardiff
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	public cardiff[] findByUuid_PrevAndNext(
			long cardiffId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<cardiff>
				orderByComparator)
		throws NoSuchcardiffException;

	/**
	 * Removes all the cardiffs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cardiffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cardiffs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cardiff where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchcardiffException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	public cardiff findByUUID_G(String uuid, long groupId)
		throws NoSuchcardiffException;

	/**
	 * Returns the cardiff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public cardiff fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the cardiff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public cardiff fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cardiff where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cardiff that was removed
	 */
	public cardiff removeByUUID_G(String uuid, long groupId)
		throws NoSuchcardiffException;

	/**
	 * Returns the number of cardiffs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cardiffs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cardiffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cardiffs
	 */
	public java.util.List<cardiff> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the cardiffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @return the range of matching cardiffs
	 */
	public java.util.List<cardiff> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cardiffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cardiffs
	 */
	public java.util.List<cardiff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cardiffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>cardiffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cardiffs
	 * @param end the upper bound of the range of cardiffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cardiffs
	 */
	public java.util.List<cardiff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cardiff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	public cardiff findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<cardiff>
				orderByComparator)
		throws NoSuchcardiffException;

	/**
	 * Returns the first cardiff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public cardiff fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

	/**
	 * Returns the last cardiff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	public cardiff findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<cardiff>
				orderByComparator)
		throws NoSuchcardiffException;

	/**
	 * Returns the last cardiff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public cardiff fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

	/**
	 * Returns the cardiffs before and after the current cardiff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cardiffId the primary key of the current cardiff
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cardiff
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	public cardiff[] findByUuid_C_PrevAndNext(
			long cardiffId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<cardiff>
				orderByComparator)
		throws NoSuchcardiffException;

	/**
	 * Removes all the cardiffs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cardiffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cardiffs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the cardiffs where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching cardiffs
	 */
	public java.util.List<cardiff> findByname(String name);

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
	public java.util.List<cardiff> findByname(String name, int start, int end);

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
	public java.util.List<cardiff> findByname(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

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
	public java.util.List<cardiff> findByname(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	public cardiff findByname_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<cardiff>
				orderByComparator)
		throws NoSuchcardiffException;

	/**
	 * Returns the first cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public cardiff fetchByname_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

	/**
	 * Returns the last cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff
	 * @throws NoSuchcardiffException if a matching cardiff could not be found
	 */
	public cardiff findByname_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<cardiff>
				orderByComparator)
		throws NoSuchcardiffException;

	/**
	 * Returns the last cardiff in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cardiff, or <code>null</code> if a matching cardiff could not be found
	 */
	public cardiff fetchByname_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

	/**
	 * Returns the cardiffs before and after the current cardiff in the ordered set where name = &#63;.
	 *
	 * @param cardiffId the primary key of the current cardiff
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cardiff
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	public cardiff[] findByname_PrevAndNext(
			long cardiffId, String name,
			com.liferay.portal.kernel.util.OrderByComparator<cardiff>
				orderByComparator)
		throws NoSuchcardiffException;

	/**
	 * Removes all the cardiffs where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByname(String name);

	/**
	 * Returns the number of cardiffs where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching cardiffs
	 */
	public int countByname(String name);

	/**
	 * Caches the cardiff in the entity cache if it is enabled.
	 *
	 * @param cardiff the cardiff
	 */
	public void cacheResult(cardiff cardiff);

	/**
	 * Caches the cardiffs in the entity cache if it is enabled.
	 *
	 * @param cardiffs the cardiffs
	 */
	public void cacheResult(java.util.List<cardiff> cardiffs);

	/**
	 * Creates a new cardiff with the primary key. Does not add the cardiff to the database.
	 *
	 * @param cardiffId the primary key for the new cardiff
	 * @return the new cardiff
	 */
	public cardiff create(long cardiffId);

	/**
	 * Removes the cardiff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff that was removed
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	public cardiff remove(long cardiffId) throws NoSuchcardiffException;

	public cardiff updateImpl(cardiff cardiff);

	/**
	 * Returns the cardiff with the primary key or throws a <code>NoSuchcardiffException</code> if it could not be found.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff
	 * @throws NoSuchcardiffException if a cardiff with the primary key could not be found
	 */
	public cardiff findByPrimaryKey(long cardiffId)
		throws NoSuchcardiffException;

	/**
	 * Returns the cardiff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cardiffId the primary key of the cardiff
	 * @return the cardiff, or <code>null</code> if a cardiff with the primary key could not be found
	 */
	public cardiff fetchByPrimaryKey(long cardiffId);

	/**
	 * Returns all the cardiffs.
	 *
	 * @return the cardiffs
	 */
	public java.util.List<cardiff> findAll();

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
	public java.util.List<cardiff> findAll(int start, int end);

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
	public java.util.List<cardiff> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator);

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
	public java.util.List<cardiff> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cardiff>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cardiffs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cardiffs.
	 *
	 * @return the number of cardiffs
	 */
	public int countAll();

}
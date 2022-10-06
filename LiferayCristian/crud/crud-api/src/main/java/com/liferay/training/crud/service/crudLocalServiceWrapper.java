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

package com.liferay.training.crud.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link crudLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see crudLocalService
 * @generated
 */
public class crudLocalServiceWrapper
	implements crudLocalService, ServiceWrapper<crudLocalService> {

	public crudLocalServiceWrapper(crudLocalService crudLocalService) {
		_crudLocalService = crudLocalService;
	}

	/**
	 * Adds the crud to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect crudLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param crud the crud
	 * @return the crud that was added
	 */
	@Override
	public com.liferay.training.crud.model.crud addcrud(
		com.liferay.training.crud.model.crud crud) {

		return _crudLocalService.addcrud(crud);
	}

	@Override
	public void addCrud(
		long groupId, long companyId, long userId, String userName,
		String nombre, String apellido, String edad, String documento,
		String tipoDocumento, java.util.Date nacimiento, String direccion,
		String ciudad, String telefonoFijo, String telefonoCelular) {

		_crudLocalService.addCrud(
			groupId, companyId, userId, userName, nombre, apellido, edad,
			documento, tipoDocumento, nacimiento, direccion, ciudad,
			telefonoFijo, telefonoCelular);
	}

	/**
	 * Creates a new crud with the primary key. Does not add the crud to the database.
	 *
	 * @param crudId the primary key for the new crud
	 * @return the new crud
	 */
	@Override
	public com.liferay.training.crud.model.crud createcrud(long crudId) {
		return _crudLocalService.createcrud(crudId);
	}

	/**
	 * Deletes the crud from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect crudLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param crud the crud
	 * @return the crud that was removed
	 */
	@Override
	public com.liferay.training.crud.model.crud deletecrud(
		com.liferay.training.crud.model.crud crud) {

		return _crudLocalService.deletecrud(crud);
	}

	/**
	 * Deletes the crud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect crudLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud that was removed
	 * @throws PortalException if a crud with the primary key could not be found
	 */
	@Override
	public com.liferay.training.crud.model.crud deletecrud(long crudId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crudLocalService.deletecrud(crudId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crudLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _crudLocalService.dynamicQuery();
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

		return _crudLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.crud.model.impl.crudModelImpl</code>.
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

		return _crudLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.crud.model.impl.crudModelImpl</code>.
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

		return _crudLocalService.dynamicQuery(
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

		return _crudLocalService.dynamicQueryCount(dynamicQuery);
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

		return _crudLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.crud.model.crud fetchcrud(long crudId) {
		return _crudLocalService.fetchcrud(crudId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _crudLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the crud with the primary key.
	 *
	 * @param crudId the primary key of the crud
	 * @return the crud
	 * @throws PortalException if a crud with the primary key could not be found
	 */
	@Override
	public com.liferay.training.crud.model.crud getcrud(long crudId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crudLocalService.getcrud(crudId);
	}

	/**
	 * Returns a range of all the cruds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.crud.model.impl.crudModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cruds
	 * @param end the upper bound of the range of cruds (not inclusive)
	 * @return the range of cruds
	 */
	@Override
	public java.util.List<com.liferay.training.crud.model.crud> getcruds(
		int start, int end) {

		return _crudLocalService.getcruds(start, end);
	}

	/**
	 * Returns the number of cruds.
	 *
	 * @return the number of cruds
	 */
	@Override
	public int getcrudsCount() {
		return _crudLocalService.getcrudsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _crudLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _crudLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _crudLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the crud in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect crudLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param crud the crud
	 * @return the crud that was updated
	 */
	@Override
	public com.liferay.training.crud.model.crud updatecrud(
		com.liferay.training.crud.model.crud crud) {

		return _crudLocalService.updatecrud(crud);
	}

	@Override
	public void updateCrud(
			long id, String nombre, String apellido, String edad,
			String documento, String tipoDocumento, java.util.Date nacimiento,
			String direccion, String ciudad, String telefonoFijo,
			String telefonoCelular)
		throws com.liferay.portal.kernel.exception.PortalException {

		_crudLocalService.updateCrud(
			id, nombre, apellido, edad, documento, tipoDocumento, nacimiento,
			direccion, ciudad, telefonoFijo, telefonoCelular);
	}

	@Override
	public crudLocalService getWrappedService() {
		return _crudLocalService;
	}

	@Override
	public void setWrappedService(crudLocalService crudLocalService) {
		_crudLocalService = crudLocalService;
	}

	private crudLocalService _crudLocalService;

}
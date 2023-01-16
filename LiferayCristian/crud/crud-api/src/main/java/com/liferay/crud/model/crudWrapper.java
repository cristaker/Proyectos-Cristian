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

package com.liferay.crud.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link crud}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see crud
 * @generated
 */
public class crudWrapper
	extends BaseModelWrapper<crud> implements crud, ModelWrapper<crud> {

	public crudWrapper(crud crud) {
		super(crud);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("crudId", getCrudId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombre", getNombre());
		attributes.put("apellido", getApellido());
		attributes.put("edad", getEdad());
		attributes.put("documento", getDocumento());
		attributes.put("tipoDocumento", getTipoDocumento());
		attributes.put("nacimiento", getNacimiento());
		attributes.put("direccion", getDireccion());
		attributes.put("ciudad", getCiudad());
		attributes.put("telefonoFijo", getTelefonoFijo());
		attributes.put("telefonoCelular", getTelefonoCelular());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long crudId = (Long)attributes.get("crudId");

		if (crudId != null) {
			setCrudId(crudId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String apellido = (String)attributes.get("apellido");

		if (apellido != null) {
			setApellido(apellido);
		}

		String edad = (String)attributes.get("edad");

		if (edad != null) {
			setEdad(edad);
		}

		String documento = (String)attributes.get("documento");

		if (documento != null) {
			setDocumento(documento);
		}

		String tipoDocumento = (String)attributes.get("tipoDocumento");

		if (tipoDocumento != null) {
			setTipoDocumento(tipoDocumento);
		}

		Date nacimiento = (Date)attributes.get("nacimiento");

		if (nacimiento != null) {
			setNacimiento(nacimiento);
		}

		String direccion = (String)attributes.get("direccion");

		if (direccion != null) {
			setDireccion(direccion);
		}

		String ciudad = (String)attributes.get("ciudad");

		if (ciudad != null) {
			setCiudad(ciudad);
		}

		String telefonoFijo = (String)attributes.get("telefonoFijo");

		if (telefonoFijo != null) {
			setTelefonoFijo(telefonoFijo);
		}

		String telefonoCelular = (String)attributes.get("telefonoCelular");

		if (telefonoCelular != null) {
			setTelefonoCelular(telefonoCelular);
		}
	}

	/**
	 * Returns the apellido of this crud.
	 *
	 * @return the apellido of this crud
	 */
	@Override
	public String getApellido() {
		return model.getApellido();
	}

	/**
	 * Returns the ciudad of this crud.
	 *
	 * @return the ciudad of this crud
	 */
	@Override
	public String getCiudad() {
		return model.getCiudad();
	}

	/**
	 * Returns the company ID of this crud.
	 *
	 * @return the company ID of this crud
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this crud.
	 *
	 * @return the create date of this crud
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the crud ID of this crud.
	 *
	 * @return the crud ID of this crud
	 */
	@Override
	public long getCrudId() {
		return model.getCrudId();
	}

	/**
	 * Returns the direccion of this crud.
	 *
	 * @return the direccion of this crud
	 */
	@Override
	public String getDireccion() {
		return model.getDireccion();
	}

	/**
	 * Returns the documento of this crud.
	 *
	 * @return the documento of this crud
	 */
	@Override
	public String getDocumento() {
		return model.getDocumento();
	}

	/**
	 * Returns the edad of this crud.
	 *
	 * @return the edad of this crud
	 */
	@Override
	public String getEdad() {
		return model.getEdad();
	}

	/**
	 * Returns the group ID of this crud.
	 *
	 * @return the group ID of this crud
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this crud.
	 *
	 * @return the modified date of this crud
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nacimiento of this crud.
	 *
	 * @return the nacimiento of this crud
	 */
	@Override
	public Date getNacimiento() {
		return model.getNacimiento();
	}

	/**
	 * Returns the nombre of this crud.
	 *
	 * @return the nombre of this crud
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the primary key of this crud.
	 *
	 * @return the primary key of this crud
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telefono celular of this crud.
	 *
	 * @return the telefono celular of this crud
	 */
	@Override
	public String getTelefonoCelular() {
		return model.getTelefonoCelular();
	}

	/**
	 * Returns the telefono fijo of this crud.
	 *
	 * @return the telefono fijo of this crud
	 */
	@Override
	public String getTelefonoFijo() {
		return model.getTelefonoFijo();
	}

	/**
	 * Returns the tipo documento of this crud.
	 *
	 * @return the tipo documento of this crud
	 */
	@Override
	public String getTipoDocumento() {
		return model.getTipoDocumento();
	}

	/**
	 * Returns the user ID of this crud.
	 *
	 * @return the user ID of this crud
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this crud.
	 *
	 * @return the user name of this crud
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this crud.
	 *
	 * @return the user uuid of this crud
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the apellido of this crud.
	 *
	 * @param apellido the apellido of this crud
	 */
	@Override
	public void setApellido(String apellido) {
		model.setApellido(apellido);
	}

	/**
	 * Sets the ciudad of this crud.
	 *
	 * @param ciudad the ciudad of this crud
	 */
	@Override
	public void setCiudad(String ciudad) {
		model.setCiudad(ciudad);
	}

	/**
	 * Sets the company ID of this crud.
	 *
	 * @param companyId the company ID of this crud
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this crud.
	 *
	 * @param createDate the create date of this crud
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the crud ID of this crud.
	 *
	 * @param crudId the crud ID of this crud
	 */
	@Override
	public void setCrudId(long crudId) {
		model.setCrudId(crudId);
	}

	/**
	 * Sets the direccion of this crud.
	 *
	 * @param direccion the direccion of this crud
	 */
	@Override
	public void setDireccion(String direccion) {
		model.setDireccion(direccion);
	}

	/**
	 * Sets the documento of this crud.
	 *
	 * @param documento the documento of this crud
	 */
	@Override
	public void setDocumento(String documento) {
		model.setDocumento(documento);
	}

	/**
	 * Sets the edad of this crud.
	 *
	 * @param edad the edad of this crud
	 */
	@Override
	public void setEdad(String edad) {
		model.setEdad(edad);
	}

	/**
	 * Sets the group ID of this crud.
	 *
	 * @param groupId the group ID of this crud
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this crud.
	 *
	 * @param modifiedDate the modified date of this crud
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nacimiento of this crud.
	 *
	 * @param nacimiento the nacimiento of this crud
	 */
	@Override
	public void setNacimiento(Date nacimiento) {
		model.setNacimiento(nacimiento);
	}

	/**
	 * Sets the nombre of this crud.
	 *
	 * @param nombre the nombre of this crud
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the primary key of this crud.
	 *
	 * @param primaryKey the primary key of this crud
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telefono celular of this crud.
	 *
	 * @param telefonoCelular the telefono celular of this crud
	 */
	@Override
	public void setTelefonoCelular(String telefonoCelular) {
		model.setTelefonoCelular(telefonoCelular);
	}

	/**
	 * Sets the telefono fijo of this crud.
	 *
	 * @param telefonoFijo the telefono fijo of this crud
	 */
	@Override
	public void setTelefonoFijo(String telefonoFijo) {
		model.setTelefonoFijo(telefonoFijo);
	}

	/**
	 * Sets the tipo documento of this crud.
	 *
	 * @param tipoDocumento the tipo documento of this crud
	 */
	@Override
	public void setTipoDocumento(String tipoDocumento) {
		model.setTipoDocumento(tipoDocumento);
	}

	/**
	 * Sets the user ID of this crud.
	 *
	 * @param userId the user ID of this crud
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this crud.
	 *
	 * @param userName the user name of this crud
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this crud.
	 *
	 * @param userUuid the user uuid of this crud
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected crudWrapper wrap(crud crud) {
		return new crudWrapper(crud);
	}

}
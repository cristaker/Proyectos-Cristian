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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.crud.service.http.crudServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class crudSoap implements Serializable {

	public static crudSoap toSoapModel(crud model) {
		crudSoap soapModel = new crudSoap();

		soapModel.setCrudId(model.getCrudId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombre(model.getNombre());
		soapModel.setApellido(model.getApellido());
		soapModel.setEdad(model.getEdad());
		soapModel.setDocumento(model.getDocumento());
		soapModel.setTipoDocumento(model.getTipoDocumento());
		soapModel.setNacimiento(model.getNacimiento());
		soapModel.setDireccion(model.getDireccion());
		soapModel.setCiudad(model.getCiudad());
		soapModel.setTelefonoFijo(model.getTelefonoFijo());
		soapModel.setTelefonoCelular(model.getTelefonoCelular());

		return soapModel;
	}

	public static crudSoap[] toSoapModels(crud[] models) {
		crudSoap[] soapModels = new crudSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static crudSoap[][] toSoapModels(crud[][] models) {
		crudSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new crudSoap[models.length][models[0].length];
		}
		else {
			soapModels = new crudSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static crudSoap[] toSoapModels(List<crud> models) {
		List<crudSoap> soapModels = new ArrayList<crudSoap>(models.size());

		for (crud model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new crudSoap[soapModels.size()]);
	}

	public crudSoap() {
	}

	public long getPrimaryKey() {
		return _crudId;
	}

	public void setPrimaryKey(long pk) {
		setCrudId(pk);
	}

	public long getCrudId() {
		return _crudId;
	}

	public void setCrudId(long crudId) {
		_crudId = crudId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getApellido() {
		return _apellido;
	}

	public void setApellido(String apellido) {
		_apellido = apellido;
	}

	public String getEdad() {
		return _edad;
	}

	public void setEdad(String edad) {
		_edad = edad;
	}

	public String getDocumento() {
		return _documento;
	}

	public void setDocumento(String documento) {
		_documento = documento;
	}

	public String getTipoDocumento() {
		return _tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		_tipoDocumento = tipoDocumento;
	}

	public Date getNacimiento() {
		return _nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		_nacimiento = nacimiento;
	}

	public String getDireccion() {
		return _direccion;
	}

	public void setDireccion(String direccion) {
		_direccion = direccion;
	}

	public String getCiudad() {
		return _ciudad;
	}

	public void setCiudad(String ciudad) {
		_ciudad = ciudad;
	}

	public String getTelefonoFijo() {
		return _telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		_telefonoFijo = telefonoFijo;
	}

	public String getTelefonoCelular() {
		return _telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		_telefonoCelular = telefonoCelular;
	}

	private long _crudId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombre;
	private String _apellido;
	private String _edad;
	private String _documento;
	private String _tipoDocumento;
	private Date _nacimiento;
	private String _direccion;
	private String _ciudad;
	private String _telefonoFijo;
	private String _telefonoCelular;

}
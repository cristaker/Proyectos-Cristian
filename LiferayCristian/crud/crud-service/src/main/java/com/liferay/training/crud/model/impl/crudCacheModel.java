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

package com.liferay.training.crud.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.crud.model.crud;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing crud in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class crudCacheModel implements CacheModel<crud>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof crudCacheModel)) {
			return false;
		}

		crudCacheModel crudCacheModel = (crudCacheModel)object;

		if (crudId == crudCacheModel.crudId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, crudId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{crudId=");
		sb.append(crudId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", apellido=");
		sb.append(apellido);
		sb.append(", edad=");
		sb.append(edad);
		sb.append(", documento=");
		sb.append(documento);
		sb.append(", tipoDocumento=");
		sb.append(tipoDocumento);
		sb.append(", nacimiento=");
		sb.append(nacimiento);
		sb.append(", direccion=");
		sb.append(direccion);
		sb.append(", ciudad=");
		sb.append(ciudad);
		sb.append(", telefonoFijo=");
		sb.append(telefonoFijo);
		sb.append(", telefonoCelular=");
		sb.append(telefonoCelular);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public crud toEntityModel() {
		crudImpl crudImpl = new crudImpl();

		crudImpl.setCrudId(crudId);
		crudImpl.setGroupId(groupId);
		crudImpl.setCompanyId(companyId);
		crudImpl.setUserId(userId);

		if (userName == null) {
			crudImpl.setUserName("");
		}
		else {
			crudImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			crudImpl.setCreateDate(null);
		}
		else {
			crudImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			crudImpl.setModifiedDate(null);
		}
		else {
			crudImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombre == null) {
			crudImpl.setNombre("");
		}
		else {
			crudImpl.setNombre(nombre);
		}

		if (apellido == null) {
			crudImpl.setApellido("");
		}
		else {
			crudImpl.setApellido(apellido);
		}

		if (edad == null) {
			crudImpl.setEdad("");
		}
		else {
			crudImpl.setEdad(edad);
		}

		if (documento == null) {
			crudImpl.setDocumento("");
		}
		else {
			crudImpl.setDocumento(documento);
		}

		if (tipoDocumento == null) {
			crudImpl.setTipoDocumento("");
		}
		else {
			crudImpl.setTipoDocumento(tipoDocumento);
		}

		if (nacimiento == Long.MIN_VALUE) {
			crudImpl.setNacimiento(null);
		}
		else {
			crudImpl.setNacimiento(new Date(nacimiento));
		}

		if (direccion == null) {
			crudImpl.setDireccion("");
		}
		else {
			crudImpl.setDireccion(direccion);
		}

		if (ciudad == null) {
			crudImpl.setCiudad("");
		}
		else {
			crudImpl.setCiudad(ciudad);
		}

		if (telefonoFijo == null) {
			crudImpl.setTelefonoFijo("");
		}
		else {
			crudImpl.setTelefonoFijo(telefonoFijo);
		}

		if (telefonoCelular == null) {
			crudImpl.setTelefonoCelular("");
		}
		else {
			crudImpl.setTelefonoCelular(telefonoCelular);
		}

		crudImpl.resetOriginalValues();

		return crudImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		crudId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombre = objectInput.readUTF();
		apellido = objectInput.readUTF();
		edad = objectInput.readUTF();
		documento = objectInput.readUTF();
		tipoDocumento = objectInput.readUTF();
		nacimiento = objectInput.readLong();
		direccion = objectInput.readUTF();
		ciudad = objectInput.readUTF();
		telefonoFijo = objectInput.readUTF();
		telefonoCelular = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(crudId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (apellido == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(apellido);
		}

		if (edad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(edad);
		}

		if (documento == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documento);
		}

		if (tipoDocumento == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tipoDocumento);
		}

		objectOutput.writeLong(nacimiento);

		if (direccion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(direccion);
		}

		if (ciudad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ciudad);
		}

		if (telefonoFijo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telefonoFijo);
		}

		if (telefonoCelular == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telefonoCelular);
		}
	}

	public long crudId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombre;
	public String apellido;
	public String edad;
	public String documento;
	public String tipoDocumento;
	public long nacimiento;
	public String direccion;
	public String ciudad;
	public String telefonoFijo;
	public String telefonoCelular;

}
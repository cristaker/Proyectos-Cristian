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

package com.liferay.training.crud.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.crud.model.crud;
import com.liferay.training.crud.model.impl.crudImpl;
import com.liferay.training.crud.service.base.crudLocalServiceBaseImpl;
import java.time.LocalDate;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the crud local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.crud.service.crudLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see crudLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.training.crud.model.crud",
	service = AopService.class
)
public class crudLocalServiceImpl extends crudLocalServiceBaseImpl {

	public void addCrud(long groupId, long companyId, long userId, String userName, String nombre, String apellido, String edad, String documento, String tipoDocumento, Date nacimiento, String direccion, String ciudad, String telefonoFijo, String telefonoCelular) {
		
		final crud Crud = new crudImpl();
		
		Crud.setCrudId(counterLocalService.increment());
		Crud.setGroupId(groupId);
		Crud.setCompanyId(companyId);
		Crud.setUserId(userId);
		Crud.setUserName(userName);
		Crud.setNombre(nombre);
		Crud.setApellido(apellido);
		Crud.setEdad(edad);
		Crud.setDocumento(documento);
		Crud.setNacimiento(nacimiento);
		Crud.setTipoDocumento(tipoDocumento);
		Crud.setDireccion(direccion);
		Crud.setCiudad(ciudad);
		Crud.setTelefonoFijo(telefonoFijo);
		Crud.setTelefonoCelular(telefonoCelular);
		Crud.setCreateDate(nacimiento);
		
		addcrud(Crud);
	}

	@Override
	public void updateCrud(long id, String nombre, String apellido, String edad, String documento, String tipoDocumento, Date nacimiento, String direccion, String ciudad, String telefonoFijo, String telefonoCelular) throws PortalException {
		final crud Crud = getcrud(id);
		Crud.setNombre(nombre);
		Crud.setApellido(apellido);
		Crud.setEdad(edad);
		Crud.setDocumento(documento);
		Crud.setTipoDocumento(tipoDocumento);
		Crud.setNacimiento(nacimiento);
		Crud.setDireccion(direccion);
		Crud.setCiudad(ciudad);
		Crud.setTelefonoFijo(telefonoFijo);
		Crud.setTelefonoCelular(telefonoCelular);
		
		updatecrud(Crud);
		
	}
	
	

}
create table ActualizacionDeDatos_crud (
	crudId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre VARCHAR(40) null,
	apellido VARCHAR(40) null,
	edad VARCHAR(2) null,
	documento VARCHAR(10) null,
	tipoDocumento VARCHAR(75) null,
	nacimiento DATE null,
	direccion VARCHAR(30) null,
	ciudad VARCHAR(75) null,
	telefonoFijo VARCHAR(10) null,
	telefonoCelular VARCHAR(9) null
);
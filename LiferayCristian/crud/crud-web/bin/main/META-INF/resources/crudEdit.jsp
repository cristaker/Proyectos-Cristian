<%@page import="com.liferay.training.crud.model.crud"%>
<%@page contentType="text/html; charset=UTF-8" %>

<%@ include file="/init.jsp" %>

<jsp:useBean id="crud" type="com.liferay.training.crud.model.crud" scope="request"/>

<portlet:actionURL name="/editCrud" var="editCrudURL" />

<aui:form action="${editCrudURL}">
	<aui:input name="nombre" label="Modifica el Nombre: " value="<%=crud.getNombre()%>">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>
	<aui:input name="apellido" label="Modifica el Apellido: " value="<%=crud.getApellido()%>">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>
	<aui:input name="edad" label="Modifica la Edad: " value="<%=crud.getEdad()%>">
		<aui:validator name="digits" />
	</aui:input>
	<aui:input name="documento" label="Modifica el Documento " value="<%=crud.getDocumento()%>">
		<aui:validator name="required" />
		<aui:validator name="digits" />
	</aui:input>
	<aui:select name="tipoDocumento" label="Tipo de Documento">
    	<aui:validator name="required" />
		<aui:option value="Cedula">Cedula</aui:option>
		<aui:option value="pasaporte">Pasaporte</aui:option>
		<aui:option value="Tarjeta">Tarjeta De Identidad</aui:option>
		<aui:option value="NIT">NIT</aui:option>
		<aui:option value="registroCivil">Registro Civil</aui:option>
	</aui:select>
	<aui:input name="nacimiento" label="Modifica la Fecha De Nacimiento: " value="<%=crud.getNacimiento()%>">
		<aui:validator name="required" />
	</aui:input>
	<aui:input name="direccionPersona" label="Modifica la Direccion: " value="<%=crud.getDireccion()%>">
		<aui:validator name="alphanum" />
	</aui:input>
	<aui:select name="ciudadPersona" label="Modifica La Ciudad">
    	<aui:validator name="required" />
		<aui:option value="Bogota">Bogota</aui:option>
		<aui:option value="Medellin">Medellin</aui:option>
		<aui:option value="Cali">Cali</aui:option>
		<aui:option value="Barranquilla">Barranquilla</aui:option>
	</aui:select>
	<aui:input name="telefonoFijo" label="Modifica el Telefono Fijo: " value="<%=crud.getTelefonoFijo()%>">
		<aui:validator name="digits" />
	</aui:input>
	<aui:input name="telefonoCelular" label="Modifica el Telefono Celular: " value="<%=crud.getTelefonoCelular()%>">
		<aui:validator name="digits" />
	</aui:input>
	<aui:input name="idcrud" type="hidden" value="<%=String.valueOf(crud.getCrudId())%>"/>
	<aui:button name="editCrudButton" type="submit" value="Editar Registro"/>
</aui:form>

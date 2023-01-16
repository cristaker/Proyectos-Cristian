<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ include file="/init.jsp" %>

<%@ taglib uri="http://liferay.com/tld/clay" prefix="clay" %>

<portlet:actionURL name="/addCrud" var="addCrudURL" />

<aui:form action="${addCrudURL}" method="post">
	<aui:input name="nombre" type="textarea" label="Ingrese Su Nombre:" >
    	<aui:validator name="required" />
    	<aui:validator name="alpha" errorMessage="Este campo debe ir solo con letras"/>
    </aui:input>
    <aui:input name="apellido" type="textarea" label="Ingrese Su Apellido:" >
    	<aui:validator name="required" />
    	<aui:validator name="alpha" />
    </aui:input>
    <aui:input name="edad" type="textarea" label="Ingrese Su Edad:" >
    	<aui:validator name="digits"/>
    </aui:input>
    <aui:input name="documento" type="textarea" label="Ingrese Su Numero De Documento:" >
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
    <aui:input name="nacimiento" type="Date" label="Ingrese Su Fecha De Nacimiento:" placeholder="dd/mm/yyyy" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="direccion" type="textarea" label="Ingrese Su Direccion:" >
    	<aui:validator name="alphanum" />
    </aui:input>
    <aui:select name="ciudad" label="Ciudad De Residencia">
    	<aui:validator name="required" />
		<aui:option value="Bogota">Bogota</aui:option>
		<aui:option value="Medellin">Medellin</aui:option>
		<aui:option value="Cali">Cali</aui:option>
		<aui:option value="Barranquilla">Barranquilla</aui:option>
	</aui:select>
    <aui:input name="telefonoFijo" type="textarea" label="Ingrese Su Telefono Fijo:" >
    	<aui:validator name="digits" />
    </aui:input>
    <aui:input name="telefonoCelular" type="textarea" label="Ingrese Su Telefono Celular:" >
    	<aui:validator name="digits" />
    </aui:input>
    <aui:button name="addCrudButton" type="submit" value="CREAR"/>
</aui:form>

<jsp:useBean id="crud" type="java.util.List<com.liferay.crud.model.crud>" scope="request"/>

<liferay-ui:search-container emptyResultsMessage="No has creado ningun registro">
	<liferay-ui:search-container-results results="${crud}"/>
	
	<liferay-ui:search-container-row className="com.liferay.training.crud.model.crud" modelVar="crud">
		<liferay-ui:search-container-column-text name="Nombre" property="nombre" />
		<liferay-ui:search-container-column-text name="Apellido" property="apellido" />
		<liferay-ui:search-container-column-text name="Edad" property="edad" />
		<liferay-ui:search-container-column-text name="Documento" property="documento" />
		<liferay-ui:search-container-column-text name="Tipo De Documento" property="tipoDocumento" />
		<liferay-ui:search-container-column-text name="Fecha De Nacimiento" property="nacimiento" />
		<liferay-ui:search-container-column-text name="Direccion" property="direccion" />
		<liferay-ui:search-container-column-text name="Ciudad" property="ciudad" />
		<liferay-ui:search-container-column-text name="Telefono Fijo" property="telefonoFijo" />
		<liferay-ui:search-container-column-text name="Telefono Celular" property="telefonoCelular" />
		<liferay-ui:search-container-column-jsp name="Editar" path="/editarbutton.jsp" />
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
</liferay-ui:search-container>
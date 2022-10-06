<%@ include file="/init.jsp" %>

<%@page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@page import="com.liferay.taglib.search.ResultRow" %>
<%@page import="com.liferay.training.crud.model.crud" %>

<%
	final ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	final crud Crud = (crud) row.getObject();	
%>

<portlet:renderURL var="displayCrudEditionUrl" >
<portlet:param name="mvcRenderCommandName" value="displayCrudEdition"/>
	<portlet:param name="idcrud" value="<%=String.valueOf(Crud.getCrudId()) %>"/>
</portlet:renderURL>

<portlet:actionURL name="/deleteCrud" var="deleteCrudUrl" >
	<portlet:param name="idcrud" value="<%=String.valueOf(Crud.getCrudId()) %>"/>
</portlet:actionURL>

<liferay-ui:icon-menu>
	<liferay-ui:icon image="edit" message="editar" url="<%=displayCrudEditionUrl%>"/>
	<liferay-ui:icon image="delete" message="eliminar" url="<%=deleteCrudUrl%>"/>
</liferay-ui:icon-menu>
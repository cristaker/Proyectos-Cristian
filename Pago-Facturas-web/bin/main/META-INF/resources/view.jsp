<%@ include file="/init.jsp" %>
<h1>${Mensaje}</h1>





<portlet:renderURL var="agregarPagoURL">
    <portlet:param name="mvcPath" value="/claro.jsp"></portlet:param>
</portlet:renderURL>
<aui:button-row>
    <aui:button onClick="<%= agregarPagoURL.toString() %>" value="CLARO"></aui:button>
</aui:button-row>

<portlet:renderURL var="agregarPagoURL">
    <portlet:param name="mvcPath" value="/directv.jsp"></portlet:param>
</portlet:renderURL>
<aui:button-row>
    <aui:button onClick="<%= agregarPagoURL.toString() %>" value="DIRECTV"></aui:button>
</aui:button-row>

<portlet:renderURL var="agregarPagoURL">
    <portlet:param name="mvcPath" value="/emcali.jsp"></portlet:param>
</portlet:renderURL>
<aui:button-row>
    <aui:button onClick="<%= agregarPagoURL.toString() %>" value="EMCALI"></aui:button>
</aui:button-row>

<portlet:actionURL name="action" var="valorURL" />
<h1>${valor}</h1>

<%@ include file="/init.jsp" %>


<portlet:actionURL name="/addCardiff" var="addCardiffURL" />

<aui:form action="${addCardiffURL}" method="post">
	<aui:input name="defaultLocale" type="textarea" label="defaultLocale" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="companyId" type="textarea" label="companyId" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="taskExecutorClassName" type="textarea" label="taskExecutorClassName" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="groupId" type="textarea" label="groupId" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="name" type="textarea" label="name" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="backgroundTaskId" type="textarea" label="backgroundTaskId" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="userName" type="textarea" label="userName" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="permissionChecker" type="textarea" label="permissionChecker" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="siteDefaultLocale" type="textarea" label="siteDefaultLocale" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="status" type="textarea" label="status" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:input name="themeDisplayLocale" type="textarea" label="themeDisplayLocale" >
    	<aui:validator name="required" />
    </aui:input>
    <aui:button name="addCardiffButton" type="submit" value="CREAR"/>
</aui:form>

<jsp:useBean id="cardiff" type="java.util.List<com.cardiff.servicebuilder.model.cardiff>" scope="request"/>

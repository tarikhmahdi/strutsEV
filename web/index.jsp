<%-- 
    Document   : index
    Created on : 11-Apr-2017, 13:38:38
    Author     : Nazrul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Struts2 Hibernate Login Example</h1>
        <s:actionerror/>
        <s:form action="login">
            <s:textfield name="user.name" label="Name"/>
            <s:password name="user.pass" label="Password"/>
            <s:submit value="Login"/>
        </s:form>
        <a href="<s:url value="insert.jsp"  />" target="_blank">Click here for Registration</a>
        
    </body>
</html>

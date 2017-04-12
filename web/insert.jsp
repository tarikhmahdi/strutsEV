<%-- 
    Document   : insert
    Created on : 11-Apr-2017, 14:29:43
    Author     : Nazrul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Registration!</h1>
        <s:actionerror/>
        <s:form action="insert">
            <s:textfield name="user.name" label="User Name:"/>
            <s:password name="user.pass" label="Password"/>
            <s:submit value="Insert"/>
            
            
        </s:form>
        
        
    </body>
</html>

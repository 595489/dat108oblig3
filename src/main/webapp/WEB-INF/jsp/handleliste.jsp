<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>

    <title>Handleliste</title>
</head>
<body>

<h4>Handleliste</h4>

<form:form action="addToList" method="post">
    <form:label path="item">New item</form:label>
    <input type="text" name="newItem">
    <input type="submit" value="submitItem">
</form:form>

<table>
       <c:forEach var="item" items="${handleliste.varer}">
                 <tr>
                      <td>--%>
<%--                <form:form action="removeFromList" method="post">--%>
<%--                    <form:hidden path="${item.name}" id="${Handleliste.vareIndex}" />--%>
<%--                    <form:label path="${item.name}" />--%>
<%--                    <form:button name="remove" value="removeFromList">Remove</form:button>--%>
<%--                </form:form>--%>
<%--            </td>--%>
    <td><h4>${item.name}</h4></td>
    <td><button name="${item.name}" id="${item.name}">remove</button></td>
</tr>
</c:forEach>
</table>

<form action="logout" method="post">
<fieldset>
<p><input type="submit" value="Logg ut" /></p>
</fieldset>
</form>
</body>
</html>
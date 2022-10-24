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

<c:forEach var="vare" items="${handleliste.getCartItems()}">
    <tr>
        <td>
            <form action="handleliste.jsp" method = "post">
                <c:out value="${vare.name}"/>
                <input type ="hidden" name ="slettVare" value="${vare.name}"/>
                <input type="submit" value="Slett"/>
            </form>
        </td>
    </tr>
</c:forEach>

<form action="handleliste.jsp" method="post">
    <fieldset>
        Legg til vare: <br></br>
        <input type="text" name="vare" value="">
        <input type="submit" value="legg til" />
        <br></br>
    </fieldset>
</form>
</table>

<form action="logout" method="post">
<fieldset>
<p><input type="submit" value="Logg ut" /></p>
</fieldset>
</form>
</body>
</html>
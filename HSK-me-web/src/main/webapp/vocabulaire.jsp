<%-- 
    Document   : vocabulaire
    Created on : Dec 1, 2013, 4:32:55 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="title">
            <h1>Vocabulaire</h1>
        </div>
        <div id="menu" >
            <jsp:include page="menu.jsp" />
        </div>
        <div id="content" >
             <table>
                <tr>
                    <td>Caractere</td>
                    <td>Pinyin</td>
                    <td>Traduction</td>
                </tr>
                <c:forEach var="caractere" items="${dico.vocab}" varStatus="questCount" >
                    <tr>
                        <td>${caractere.caractere}</td>
                        <td>${caractere.pinyin}</td>
                        <td>${caractere.traduction}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div id="footer" >
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>

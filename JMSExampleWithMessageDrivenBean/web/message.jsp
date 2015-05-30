<%-- 
    Document   : message
    Created on : May 28, 2015, 11:04:10 AM
    Author     : abinash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Message Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="MessageServlet" method="post">
            <table>
                <tr>
                    <td>Your message</td>
                    <td><input type="text" name="msg"/></td>
                </tr>
            </table>
            <input type="submit" value="Send Message"/>
        </form>
    </body>
</html>

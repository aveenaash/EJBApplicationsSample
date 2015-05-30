<%-- 
    Document   : addException
    Created on : May 30, 2015, 3:14:28 PM
    Author     : abinash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Exeption</title>
    </head>
    <body>
        <h1>Add New Exception</h1>
        <form action="AddException" method="post">
            <table>
                <tr>
                    <td>Category : </td>
                    <td><input type="text" name="category"/></td>
                </tr>
                <tr>
                    <td>Category : </td>
                    <td><input type="text" name="category"/></td>
                </tr>
                <tr>
                    <td>Topic : </td>
                    <td><input type="text" name="topic"/></td>
                </tr>
                <tr>
                    <td>Detail : </td>
                    <td><textarea id="detail" cols="70" rows="8"></textarea></td>
                </tr>
                <tr>
                    <td>Solution : </td>
                    <td><textarea id="solution" cols="70" rows="8"></textarea></td>
                </tr>
                <tr>
                    <td>Solution Ref : </td>
                    <td><textarea id="solutionref" cols="70" rows="8"></textarea></td>
                </tr>
            </table>
            <input type="submit" value="Add Excp"/>
        </form>
</html>

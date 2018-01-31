<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<body>
<a href="/springmvc/helloworld">helloworld</a>
<br><br>
<a href="/springmvc/testRequestMapping">Test RequestMapping</a>
<br><br>
<form action="/springmvc/testMethod" method="post">
    <input type="submit" value="submit"/>
</form>
<br><br>
<a href="/springmvc/testPathVariable/1">Test PathVariable</a>
<br><br>
<form action="/springmvc/testPojo" method="post">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="text" name="email"/>
    <input type="number" name="age"/>
    <input type="text" name="address.province"/>
    <input type="text" name="address.city"/>

    <input type="submit" value="submit"/>
</form>
<br><br>
<a href="/springmvc/testServletAPI">Test ServletAPI</a>
<br><br>
<a href="/springmvc/testMap">Test Map</a>
<br><br>
<a href="/springmvc/testModel">Test Model</a>
<br><br>
<form action="/springmvc/testModalAttribute" method="post">
    <input type="text" name="username"/>
    <input type="text" name="email"/>
    <input type="number" name="age"/>
    <input type="submit" value="submit"/>
</form>
<br><br>
<a href="/springmvc/testView">Test View</a>
<br><br>
<a href="/springmvc/testRedirect">Test redirect</a>
<br><br>




<a href="/employee/emps">List all employees</a>
<br><br>


<form action="/springmvc/testConverter" method="post">
    <input type="text" name="employee"/>
    <input type="submit" value="submit"/>
</form>
<br><br>
<form action="/springmvc/testFormatting" method="post">
    lastname: <input type="text" name="lastName"/>
    email:<input type="text" name="email"/>
    birth:<input type="text" name="birth"/>
    <br><br>

    <input type="submit" value="submit"/>
    <br><br>
</form>

<a href="/springmvc/testJson">testJson</a>
<br><br>

<a href="/springmvc/testI18n">testI18n</a>
<br><br>

<form action="/springmvc/testFileUpload" method="post" enctype="multipart/form-data">
    lastname: <input type="text" name="desc"/>
    email:    <input type="file" name="file"/>
    <input type="submit" value="submit"/>
    <br><br>
</form>

</body>
</html>



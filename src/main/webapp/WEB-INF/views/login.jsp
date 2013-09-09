<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
     <body>
         <h1>Login to the world</h1>
        <form:form commandName="login" method="POST" action="login.html">
            <form:label path="loginName">Login-Name </form:label>
            <form:input path="loginName" />
            <form:label path="password">Login-Name </form:label>
            <form:input path="password" />
            <input type="submit" value="Login"/>
        </form:form>
    </body>
</html>

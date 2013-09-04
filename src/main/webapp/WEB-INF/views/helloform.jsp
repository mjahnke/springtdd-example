<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h1>Spring MVC Hello World Example</h1>
 
        <form:form commandName="hello" method="POST" action="helloform.html">
            <form:input path="name" />
            <input type="submit" value="Sag Hallo!"/>
        </form:form>
 
</body>
</html>
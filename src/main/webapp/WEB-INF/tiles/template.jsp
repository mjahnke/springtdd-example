<!DOCTYPE HTML>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
    <head>
        <tiles:insertAttribute name="meta" />
    </head>
    <body>
        <header>
            <tiles:insertAttribute name="header" />
        </header>
        <div id="body">
            <tiles:insertAttribute name="body" />
        </div>
        <footer>
            <tiles:insertAttribute name="footer" />
        </footer>
    </body>
</html>
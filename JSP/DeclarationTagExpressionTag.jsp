<!--WAP for declaration tag & expression tag.-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            String getName() {
                return "Hello JSP";
            }
        %>
        <h3><%=getName() %></h3>
    </body>
</html>

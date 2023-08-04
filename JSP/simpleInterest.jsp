
<!--Write a JSP program to calculate Simple Interest.-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Interest</title>
    </head>
    <body>
        <%
            double p = 200;
            double t = 12;
            double r = 10;
            
            double si = (p*t*r)/100;
            %>
            <h1>The Simple Interest is : <%= si%></h1>
    </body>
</html>

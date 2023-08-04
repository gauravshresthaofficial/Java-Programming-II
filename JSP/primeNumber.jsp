<!--Write a JSP program to calculate prime numbers between 20 and 100.-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prime Number</title>
    </head>
    <body>
        <%
            boolean flag = true;
            for (int i = 20; i < 100; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                if (flag) {
                    out.print("The prime number is: " + i);
                    %>
                    <br>
                    <%
                }

            }

        %>
    </body>
</html>

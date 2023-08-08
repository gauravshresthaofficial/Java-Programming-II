<!--Write a JSP program to redirect the another pages if exception occurs in JSP.-->
  
<%@page errorPage="Error.jsp" %>


<%
    int a = 5;
    int b = 0;
    int c;

    c = a / b;
%>



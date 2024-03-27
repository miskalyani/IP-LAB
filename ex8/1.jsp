<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>JSP Page</title>
 </head>
 <body>
 <%!int sum=0;
 double total=0;
 double avg;%>

 <%Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/kkk");
 Statement st =c.createStatement();
 ResultSet rs=st.executeQuery("SELECT SUM(total_amount )FROM invoices");
 while(rs.next())
 {
 sum=sum+5;
 total+=(rs.getInt(1));

 }
 avg=total/sum;%>
 <%out.println("the total no. of invoices is:"+sum);%><br>
 <%out.println("the total amount is:"+total);%><br>
 <% out.println("the average of invoices is:"+avg);%><br>

 </body>
</html>

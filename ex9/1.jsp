<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="package1.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <% 
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Kalyani", "S", "2024-01-01", 50000.00));
        employees.add(new Employee("S", "Kalyani", "2024-02-15", 60000.00));
        employees.add(new Employee("Kalyani", "Subramanian", "2014-05-01", 70000.00));

        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getLastName().compareTo(e2.getLastName());
            }
        }); 

        pageContext.setAttribute("employees", employees);
    %>
    
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Hire Date</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td><c:out value="${employee.getFirstName()} ${employee.getLastName()}" /></td>
                    <td><c:out value="${employee.getHireDate()}" /></td>
                    <td>
                        <c:choose>
                            <c:when test="${employee.getSalary() > 60000}">
                                <span style="color: red;">${employee.getSalary()}</span>
                            </c:when>
                            <c:otherwise>
                                ${employee.getSalary()}
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

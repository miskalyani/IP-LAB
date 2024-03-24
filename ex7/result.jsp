<!DOCTYPE html>
<html>
<head>
    <title>Temperature Conversion Result</title>
</head>
<body>
    <h2>Temperature Conversion Result</h2>
    <%-- Retrieving the converted temperature from the request attribute --%>
    <% if (request.getAttribute("result") != null) { %>
        <p>Temperature in Fahrenheit: <%= request.getAttribute("result") %></p>
    <% } else { %>
        <p>Error occurred during conversion.</p>
    <% } %>
    <br>
    <a href="index.jsp">Convert Another Temperature</a>
</body>
</html>


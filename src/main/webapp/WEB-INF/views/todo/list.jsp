
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Page</title>
</head>
<body>
<h2>Todo List Page</h2>
<a href="/todo/register">register</a>
<h2>title : ${todoDTO.title}</h2>
<h2>writer : ${todoDTO.writer}</h2>
<h2>dueDate : ${todoDTO.dueDate}</h2>
<h2>finished : ${todoDTO.finished}</h2>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 2024-03-05
  Time: 오전 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>user4::list</title>
</head>
<body>
    <h3>user4 목록</h3>

    <a href="/ch04">메인</a>
    <a href="/ch04/user4/register">등록</a>
        <table border="1">
            <tr>
                <th>아이디</th>
                <th>이름</th>
                <th>성별</th>
                <th>나이</th>
                <th>휴대폰</th>
                <th>주소</th>
                <th>관리</th>
            </tr>

            <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.uid}</td>
                <td>${user.name}</td>
                <td>${user.gender}</td>
                <td>${user.age}</td>
                <td>${user.hp}</td>
                <td>${user.addr}</td>
                <td>
                    <a href="/ch04/user4/modify?uid=${user.uid}">수정</a>
                    <a href="/ch04/user4/delete?uid=${user.uid}">삭제</a>
                </td>
            </tr>
            </c:forEach>
        </table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 2024-03-05
  Time: 오전 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>user5::modify</title>
</head>
<body>
    <h3>user5 등록</h3>

    <a href="/ch04">메인</a>
    <a href="/ch04/user5/list">목록</a>

    <form action="/ch04/user5/modify" method="post">
        <table>
            <tr>
                <td>번호</td>
                <td><input type="text" name="seq" readonly value="${user5DTO.seq}"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" value="${user5DTO.name}"></td>
            </tr>
            <tr>
                <td>성별</td>
                <td><input type="text" name="gender" value="${user5DTO.gender}"></td>
            </tr>
            <tr>
                <td>나이</td>
                <td><input type="number" name="age" value="${user5DTO.age}"></td>
            </tr>
            <tr>
                <td>주소</td>
                <td><input type="text" name="addr" value="${user5DTO.addr}"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="수정"></td>
            </tr>
        </table>

    </form>

</body>
</html>

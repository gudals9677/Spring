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
    <title>user2::modify</title>
</head>
<body>
    <h3>user2 등록</h3>

    <a href="/ch05">메인</a>
    <a href="/ch05/user3/list">목록</a>

    <form action="/ch05/user3/modify" method="post">
        <table>
            <tr>
                <td>아이디</td>
                <td><input type="text" name="uid" readonly value="${user3DTO.uid}"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" value="${user3DTO.name}"></td>
            </tr>
            <tr>
                <td>생년월일</td>
                <td><input type="date" name="birth" value="${user3DTO.birth}"></td>
            </tr>
            <tr>
                <td>휴대폰</td>
                <td><input type="text" name="hp" value="${user3DTO.hp}"></td>
            </tr>
            <tr>
                <td>주소</td>
                <td><input type="text" name="addr" value="${user3DTO.addr}"></td>
            </tr>

            <tr>
                <td colspan="2" align="right"><input type="submit" value="수정"></td>
            </tr>
        </table>

    </form>

</body>
</html>

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
    <title>member::modify</title>
</head>
<body>
    <h3>member 등록</h3>

    <a href="/ch05">메인</a>
    <a href="/ch05/member/list">목록</a>

    <form action="/ch05/member/modify" method="post">
        <table>
            <tr>
                <td>아이디</td>
                <td><input type="text" name="uid" readonly value="${memberDTO.uid}"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" value="${memberDTO.name}"></td>
            </tr>
            <tr>
                <td>휴대폰</td>
                <td><input type="text" name="hp" value="${memberDTO.hp}"></td>
            </tr>
            <tr>
                <td>직급</td>
                <td><input type="text" name="pos" value="${memberDTO.pos}"></td>
            </tr>
            <tr>
                <td>부서</td>
                <td><input type="number" name="dep" value="${memberDTO.dep}"></td>
            </tr>
            <tr>
                <td>날짜</td>
                <td><input type="date" name="rdate" value="${memberDTO.rdate}"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="수정"></td>
            </tr>
        </table>

    </form>

</body>
</html>

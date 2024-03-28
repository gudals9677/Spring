<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 2024-03-05
  Time: 오전 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>member::register</title>
</head>
<body>
    <h3>member 등록</h3>

    <a href="/ch05">메인</a>
    <a href="/ch05/member/list">목록</a>

    <form action="/ch05/member/register" method="post">
        <table>
            <tr>
                <td>아이디</td>
                <td><input type="text" name="uid"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>휴대폰</td>
                <td><input type="text" name="hp"></td>
            </tr>
            <tr>
                <td>직급</td>
                <td><input type="text" name="pos"></td>
            </tr>
            <tr>
                <td>부서</td>
                <td><input type="number" name="dep"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="등록"></td>
            </tr>
        </table>

    </form>

</body>
</html>

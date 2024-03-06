<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-06
  Time: 오후 2:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>동물 전체 조회</title>
</head>
<body>

<table border="1">
    <tr>
        <th colspan="12"><h1>동물 목록 전체 조회</h1></th>
    </tr>
    <tr>
        <th>동물번호</th>
        <th>성별</th>
        <th>모색</th>
        <th>나이</th>
        <th>무게</th>
        <th>내장칩</th>
        <th>중성화</th>
        <th>목걸이</th>
        <th>구조일자</th>
        <th>포획장소</th>
        <th>건강상태</th>
        <th>품종</th>
    </tr>
    <c:forEach items="${ aniList }" var="ani">
        <tr>
            <td>${ ani.animalCode }</td>
            <td>${ ani.animalGender }</td>
            <td>${ ani.animalColor }</td>
            <td>${ ani.animalAge }</td>
            <td>${ ani.animalWeight }</td>
            <td>${ ani.builtInChip }</td>
            <td>${ ani.neuteringSurgery }</td>
            <td>${ ani.animalCollar }</td>
            <td>${ ani.rescueDate }</td>
            <td>${ ani.capturePlace }</td>
            <td>${ ani.healthCondition }</td>
            <td>${ ani.categoryCode }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

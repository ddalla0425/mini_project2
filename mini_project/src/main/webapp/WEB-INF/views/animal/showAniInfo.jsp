<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-06
  Time: 오후 2:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>동물 정보</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th colspan="12"><h1>${ param.animalCode }번 동물의 정보</h1></th>
            </tr>
        </thead>
        <tbody>
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
            <tr>
                <td>${ selectedAni.animalCode }</td>
                <td>${ selectedAni.animalGender }</td>
                <td>${ selectedAni.animalColor }</td>
                <td>${ selectedAni.animalAge }</td>
                <td>${ selectedAni.animalWeight }</td>
                <td>${ selectedAni.builtInChip }</td>
                <td>${ selectedAni.neuteringSurgery }</td>
                <td>${ selectedAni.animalCollar }</td>
                <td>${ selectedAni.rescueDate }</td>
                <td>${ selectedAni.capturePlace }</td>
                <td>${ selectedAni.healthCondition }</td>
                <td>${ selectedAni.categoryCode }</td>
            </tr>
        </tbody>
    </table>
</body>
</html>

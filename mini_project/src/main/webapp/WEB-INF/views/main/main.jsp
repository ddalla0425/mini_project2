<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-06
  Time: 오후 2:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main JSP</title>
    <style>
        td,th {
            padding: 5px 10px;
        }

        .btn {
            text-align: right
        }
    </style>
</head>
<body>
<table border="1">
    <tr>
        <th>동물조회</th>
        <td>
            <form action="${pageContext.servletContext.contextPath}/animal/select">
                <label>조회할 동물</label>
                <input type="text" name="animalCode" id="animalCode">
                <button>조회하기</button>
            </form>
        </td>
    </tr>
    <tr>
        <th>전체조회</th>
        <td>
            <button onclick="location.href='${pageContext.servletContext.contextPath}/animal/list'">
                동물 정보 전체 조회하기
            </button>
        </td>
    </tr>
    <tr>
        <th>동물추가</th>
        <td>
            <form action="${ pageContext.servletContext.contextPath }/animal/insert" method="post">
                성별 :
                <select name="animalGender">
                    <option value="암컷">암컷</option>
                    <option value="수컷">수컷</option>
                    <option value="모름">모름</option>
                </select><br>
                모색 : <input type="text" name="animalColor"><br>
                나이 : <input type="text" name="animalAge"><br>
                무게 : <input type="text" name="animalWeight"><br>
                내장칩 :
                <select name="builtInChip">
                    <option value="Y">O</option>
                    <option value="N">X</option>
                    <option value="모름">모름</option>
                </select><br>
                중성화 :
                <select name="neuteringSurgery">
                    <option value="Y">O</option>
                    <option value="N">X</option>
                    <option value="모름">모름</option>
                </select><br>
                목걸이 :
                <select name="animalCollar">
                    <option value="Y">O</option>
                    <option value="N">X</option>
                    <option value="모름">모름</option>
                </select><br>
                구조일자 : <input type="date" name="rescueDate"><br>
                포획장소 : <input type="text" name="capturePlace"><br>
                건강상태 : <input type="text" name="healthCondition"><br>
                품종:
                <select name="categoryCode">
                    <option value="1">개</option>
                    <option value="2">고양이</option>
                    <option value="3">기타</option>
                    <option value="4">말티즈</option>
                    <option value="5">시베리안허스키</option>
                    <option value="6">비숑</option>
                    <option value="7">꼬똥드뚤레아</option>
                    <option value="8">푸들</option>
                    <option value="9">시바</option>
                    <option value="10">진돗개</option>
                    <option value="11">포메라이언</option>
                    <option value="12">치와와</option>
                    <option value="13">시고르자브종</option>
                    <option value="14">스코티시폴드</option>
                    <option value="15">터키쉬앙고라</option>
                    <option value="16">러시안블루</option>
                    <option value="17">페르시안</option>
                    <option value="18">브리티시숏헤어</option>
                    <option value="19">스핑크스</option>
                    <option value="20">샴</option>
                    <option value="21">벵골</option>
                    <option value="22">렉돌</option>
                    <option value="23">기르고르냐이</option>
                    <option value="24">판다</option>
                    <option value="25">라쿤</option>
                    <option value="26">고라니</option>
                </select><br>
                <div class="btn">
                    <button type="submit">등록하기</button>
                </div>
            </form>
        </td>
    </tr>
    <tr>
        <th>동물 수정</th>
        <td>
            <form action="${ pageContext.servletContext.contextPath }/animal/update" method="post">
                동물번호 : <input type="text" name="animalCode"/><br>
                내장칩 :
                <select name="builtInChip">
                    <option value="Y">O</option>
                    <option value="N">X</option>
                    <option value="모름">모름</option>
                </select><br>
                중성화 :
                <select name="neuteringSurgery">
                    <option value="Y">O</option>
                    <option value="N">X</option>
                    <option value="모름">모름</option>
                </select><br>
                목걸이 :
                <select name="animalCollar">
                    <option value="Y">O</option>
                    <option value="N">X</option>
                    <option value="모름">모름</option>
                </select><br>
                <button type="submit">동물 정보 수정 완료</button>
            </form>
        </td>
    </tr>
    <tr>
        <th>동물삭제</th>
        <td>
            <form action="${ pageContext.servletContext.contextPath }/animal/delete" method="post">
                동물번호 : <input type="text" name="animalCode"/>
                <button type="submit">동물 정보 삭제</button>
            </form>
        </td>
    </tr>
</table>

</body>
</html>

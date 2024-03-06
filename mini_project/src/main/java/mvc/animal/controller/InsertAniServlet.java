package mvc.animal.controller;

import mvc.animal.model.dto.AnimalDTO;
import mvc.animal.model.service.AnimalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/animal/insert")
public class InsertAniServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String animalGender = req.getParameter("animalGender");
        String animalColor = req.getParameter("animalColor");
        String animalAge = req.getParameter("animalAge");
        String animalWeight = req.getParameter("animalWeight");
        String builtInChip = req.getParameter("builtInChip");
        String neuteringSurgery = req.getParameter("neuteringSurgery");
        String animalCollar = req.getParameter("animalCollar");
        String rescueDate = req.getParameter("rescueDate").replace("-", "");
        String capturePlace = req.getParameter("capturePlace");
        String healthCondition = req.getParameter("healthCondition");
        int categoryCode = Integer.parseInt(req.getParameter("categoryCode"));

        AnimalDTO ani = new AnimalDTO();
        ani.setAnimalGender(animalGender);
        ani.setAnimalColor(animalColor);
        ani.setAnimalAge(animalAge);
        ani.setAnimalWeight(animalWeight);
        ani.setBuiltInChip(builtInChip);
        ani.setNeuteringSurgery(neuteringSurgery);
        ani.setAnimalCollar(animalCollar);
        ani.setRescueDate(rescueDate);
        ani.setCapturePlace(capturePlace);
        ani.setHealthCondition(healthCondition);
        ani.setCategoryCode(categoryCode);

        System.out.println("insert request animalDTO : " + ani);

        AnimalService animalService = new AnimalService();
        int result = animalService.insertAni(ani);

        if(result > 0) {
            //insert가 성공 했을 경우 요청 url이 그대로 남아있으면 브라우저 새로고침 시 insert 재요청이 발생한다 >> 2번 인설트 된단말
            //forward가 아닌 redirect 처리가 필요하며 전체 사원 목록을 조회하는 기능을 요청하도록 한다.
            resp.sendRedirect(req.getContextPath() + "/animal/list");
        } else {
            req.setAttribute("massage","신규 동물 등록에 실패하였습니다.");
            req.getRequestDispatcher("/WET-INT/views/common/errorPage.jsp").forward(req, resp);
        }

    }
}

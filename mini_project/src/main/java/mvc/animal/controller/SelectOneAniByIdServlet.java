package mvc.animal.controller;

import mvc.animal.model.dto.AnimalDTO;
import mvc.animal.model.service.AnimalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/animal/select")
public class SelectOneAniByIdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String animalCode = req.getParameter("animalCode");
        System.out.println("animalCode : " + animalCode);

        AnimalService animalService = new AnimalService();
        AnimalDTO selectedAni = animalService.selectOneAniById(animalCode);
        System.out.println("selectedAni : " + selectedAni);

        String path="";
        if(selectedAni != null) {
            path = "/WEB-INF/views/animal/showAniInfo.jsp";
            req.setAttribute("selectedAni", selectedAni);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "해당 번호를 가진 동물은 없습니다.");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}

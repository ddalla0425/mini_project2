package mvc.animal.controller;


import mvc.animal.model.dto.AnimalDTO;
import mvc.animal.model.service.AnimalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/animal/list")
public class SelectAllAniServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AnimalService animalService = new AnimalService();
        List<AnimalDTO> aniList = animalService.selectAllAni();

        String path = "";
        if(aniList != null && !aniList.isEmpty()) {
            path = "/WEB-INF/views/animal/animalList.jsp";
            req.setAttribute("aniList", aniList);

        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "직원 전체 목록이 조회 되지 않았습니다.");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}

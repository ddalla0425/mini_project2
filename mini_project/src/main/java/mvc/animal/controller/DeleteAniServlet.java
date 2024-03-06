package mvc.animal.controller;

import mvc.animal.model.service.AnimalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/animal/delete")
public class DeleteAniServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String animalCode = req.getParameter("animalCode");

        AnimalService animalService = new AnimalService();
        int result = animalService.deleteAni(animalCode);

        if(result > 0) {
            resp.sendRedirect(req.getContextPath() + "/animal/list");
        } else {
            req.setAttribute("message","동물 삭제에 실패하였습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }
    }
}

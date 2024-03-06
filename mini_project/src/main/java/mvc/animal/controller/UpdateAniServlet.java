package mvc.animal.controller;

import mvc.animal.model.dto.AnimalDTO;
import mvc.animal.model.service.AnimalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/animal/update")
public class UpdateAniServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int animalCode = Integer.parseInt(req.getParameter("animalCode"));
        String builtInChip = req.getParameter("builtInChip");
        String neuteringSurgery = req.getParameter("neuteringSurgery");
        String animalCollar = req.getParameter("animalCollar");

        AnimalDTO animalDTO = new AnimalDTO();
        animalDTO.setAnimalCode(animalCode);
        animalDTO.setBuiltInChip(builtInChip);
        animalDTO.setNeuteringSurgery(neuteringSurgery);
        animalDTO.setAnimalCollar(animalCollar);

        AnimalService animalService = new AnimalService();
        int result = animalService.updateAni(animalDTO);

        if(result > 0) {
            resp.sendRedirect(req.getContextPath() + "/animal/select?animalCode="+animalCode);
        } else {
            req.setAttribute("message","동물 품종 수정에 실패하였습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }
    }
}

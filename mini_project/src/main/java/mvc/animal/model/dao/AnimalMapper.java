package mvc.animal.model.dao;

import mvc.animal.model.dto.AnimalDTO;

import java.util.List;

public interface AnimalMapper {


    AnimalDTO selectOneAniById(String animalCode);

    List<AnimalDTO> selectAllAni();

    int insertAni(AnimalDTO ani);

    int updateAni(AnimalDTO animalDTO);

    int deleteAni(String animalDTO);
}

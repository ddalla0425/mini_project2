package mvc.animal.model.service;

import mvc.animal.model.dao.AnimalMapper;
import mvc.animal.model.dto.AnimalDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static mvc.common.Template.getSqlSession;

public class AnimalService {
    private AnimalMapper animalMapper;
    public AnimalDTO selectOneAniById(String animalCode) {

        SqlSession sqlSession = getSqlSession();
        System.out.println("sqlSession : " + sqlSession);

        animalMapper = sqlSession.getMapper(AnimalMapper.class);

        AnimalDTO selectedAni = animalMapper.selectOneAniById(animalCode);

        sqlSession.close();

        return selectedAni;
    }

    public List<AnimalDTO> selectAllAni() {
        SqlSession sqlSession = getSqlSession();
        System.out.println("sqlSession : " + sqlSession);
        animalMapper = sqlSession.getMapper(AnimalMapper.class);

        List<AnimalDTO> aniList = animalMapper.selectAllAni();

        sqlSession.close();

        return aniList;
    }

    public int insertAni(AnimalDTO ani) {
        SqlSession sqlSession = getSqlSession();
        animalMapper = sqlSession.getMapper(AnimalMapper.class);

        int result = animalMapper.insertAni(ani);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result;
    }

    public int updateAni(AnimalDTO animalDTO) {
        SqlSession sqlSession = getSqlSession();
        animalMapper = sqlSession.getMapper(AnimalMapper.class);

        int result = animalMapper.updateAni(animalDTO);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result;
    }

    public int deleteAni(String animalDTO) {
        SqlSession sqlSession = getSqlSession();
        animalMapper = sqlSession.getMapper(AnimalMapper.class);

        int result = animalMapper.deleteAni(animalDTO);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result;
    }
}

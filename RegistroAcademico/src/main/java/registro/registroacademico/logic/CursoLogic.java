package registro.registroacademico.logic;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import registro.registroacademico.entities.CursoEntity;
import registro.registroacademico.persistence.CursoPersistence;

/**
 * Logica de negocio curso
 * @author Uriel Rodríguez Vallarta
 */

@Stateless
public class CursoLogic {
    
    @Inject 
    private CursoPersistence cursoPersistance; 
    
    /**
     * Obtener todos los cursos
     * @return curso
     */
    public List<CursoEntity> getCursos(){
      List<CursoEntity> cursos = cursoPersistance.findAll();
      return cursos;
    }
    
    /**
     * Obtener un curso a través del id
     * @param id
     * @return 
     */
    
    public  CursoEntity getCurso(int id){
     CursoEntity curso = cursoPersistance.find(id);
        if (curso == null) {
            throw new IllegalArgumentException("El curso solicitado no existe");
        }
     return curso;
    }
    
    /**
     * Crear un nuevo curso
     * @param cursoEntity
     * @return 
     */
    
    public CursoEntity createCurso(CursoEntity cursoEntity){
      cursoPersistance.create(cursoEntity); 
      return  cursoEntity;
    }
    
    /**
     * Actualizar curso
     * @param id
     * @param cursoEntity
     * @return 
     */
    
    public CursoEntity updateCurso(int id, CursoEntity cursoEntity){
     CursoEntity curso = cursoPersistance.update(cursoEntity); 
     return curso;
    }
    
    /**
     * metodo para eliminar curso de la tabla
     * @param id 
     */
    
    public void deleteCurso(int id){
        cursoPersistance.remove(id);
    }
}//class
    
package registro.registroacademico.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registro.registroacademico.entities.CursoGrupoEntity;
import registro.registroacademico.entities.EstudianteEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T18:49:00")
@StaticMetamodel(CalificacionEntity.class)
public class CalificacionEntity_ { 

    public static volatile SingularAttribute<CalificacionEntity, EstudianteEntity> estudiante;
    public static volatile SingularAttribute<CalificacionEntity, Integer> id_calificacion;
    public static volatile SingularAttribute<CalificacionEntity, CursoGrupoEntity> cursoGrupo;
    public static volatile SingularAttribute<CalificacionEntity, Float> valor_nota;

}
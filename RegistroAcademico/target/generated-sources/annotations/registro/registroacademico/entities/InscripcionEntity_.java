package registro.registroacademico.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registro.registroacademico.entities.CursoGrupoEntity;
import registro.registroacademico.entities.EstudianteEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T18:49:00")
@StaticMetamodel(InscripcionEntity.class)
public class InscripcionEntity_ { 

    public static volatile SingularAttribute<InscripcionEntity, EstudianteEntity> estudiante;
    public static volatile SingularAttribute<InscripcionEntity, CursoGrupoEntity> curso_grupo;
    public static volatile SingularAttribute<InscripcionEntity, Integer> id_inscripcion;

}
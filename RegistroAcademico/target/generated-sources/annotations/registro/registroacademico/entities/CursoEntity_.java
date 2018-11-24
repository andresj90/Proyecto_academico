package registro.registroacademico.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registro.registroacademico.entities.ProgramaEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T18:49:00")
@StaticMetamodel(CursoEntity.class)
public class CursoEntity_ { 

    public static volatile SingularAttribute<CursoEntity, Integer> id_curso;
    public static volatile SingularAttribute<CursoEntity, ProgramaEntity> programa;
    public static volatile SingularAttribute<CursoEntity, String> nom_curso;

}
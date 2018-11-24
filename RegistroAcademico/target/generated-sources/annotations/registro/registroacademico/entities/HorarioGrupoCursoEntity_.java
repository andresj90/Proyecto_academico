package registro.registroacademico.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registro.registroacademico.entities.CursoGrupoEntity;
import registro.registroacademico.entities.HorarioEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T18:49:00")
@StaticMetamodel(HorarioGrupoCursoEntity.class)
public class HorarioGrupoCursoEntity_ { 

    public static volatile SingularAttribute<HorarioGrupoCursoEntity, Long> idHorarioGrupoCurso;
    public static volatile SingularAttribute<HorarioGrupoCursoEntity, CursoGrupoEntity> cursoGrupoId;
    public static volatile SingularAttribute<HorarioGrupoCursoEntity, HorarioEntity> horarioId;

}
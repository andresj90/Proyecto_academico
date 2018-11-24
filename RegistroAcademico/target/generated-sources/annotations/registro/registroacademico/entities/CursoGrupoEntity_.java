package registro.registroacademico.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registro.registroacademico.entities.CursoEntity;
import registro.registroacademico.entities.DocenteEntity;
import registro.registroacademico.entities.GrupoEntity;
import registro.registroacademico.entities.TipoCursoEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T18:49:00")
@StaticMetamodel(CursoGrupoEntity.class)
public class CursoGrupoEntity_ { 

    public static volatile SingularAttribute<CursoGrupoEntity, Integer> idCursoGrupo;
    public static volatile SingularAttribute<CursoGrupoEntity, CursoEntity> cursoIdCur;
    public static volatile SingularAttribute<CursoGrupoEntity, DocenteEntity> docenteIdGr;
    public static volatile SingularAttribute<CursoGrupoEntity, GrupoEntity> grupoIdGr;
    public static volatile SingularAttribute<CursoGrupoEntity, Integer> cupoGrupo;
    public static volatile SingularAttribute<CursoGrupoEntity, TipoCursoEntity> tipoCursoId;

}
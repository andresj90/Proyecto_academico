package registro.registroacademico.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registro.registroacademico.entities.CoordinadorEntity;
import registro.registroacademico.entities.FacultadEntity;
import registro.registroacademico.entities.TipoProgramaEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T18:49:00")
@StaticMetamodel(ProgramaEntity.class)
public class ProgramaEntity_ { 

    public static volatile SingularAttribute<ProgramaEntity, CoordinadorEntity> coordinador;
    public static volatile SingularAttribute<ProgramaEntity, Integer> id_programa;
    public static volatile SingularAttribute<ProgramaEntity, Integer> creditos_programa;
    public static volatile SingularAttribute<ProgramaEntity, TipoProgramaEntity> tipoPrograma;
    public static volatile SingularAttribute<ProgramaEntity, String> nombre_programa;
    public static volatile SingularAttribute<ProgramaEntity, FacultadEntity> facultad;

}
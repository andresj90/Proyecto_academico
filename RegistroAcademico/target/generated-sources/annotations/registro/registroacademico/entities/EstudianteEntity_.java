package registro.registroacademico.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registro.registroacademico.entities.ProgramaEntity;
import registro.registroacademico.entities.TipoDocumentoEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T18:49:00")
@StaticMetamodel(EstudianteEntity.class)
public class EstudianteEntity_ { 

    public static volatile SingularAttribute<EstudianteEntity, String> apellidos;
    public static volatile SingularAttribute<EstudianteEntity, Long> nro_documento;
    public static volatile SingularAttribute<EstudianteEntity, TipoDocumentoEntity> tipoDocumento;
    public static volatile SingularAttribute<EstudianteEntity, Integer> id_estudiante;
    public static volatile SingularAttribute<EstudianteEntity, Long> cod_estudiantil;
    public static volatile SingularAttribute<EstudianteEntity, String> genero;
    public static volatile SingularAttribute<EstudianteEntity, ProgramaEntity> programa;
    public static volatile SingularAttribute<EstudianteEntity, String> email;
    public static volatile SingularAttribute<EstudianteEntity, String> nombres;

}
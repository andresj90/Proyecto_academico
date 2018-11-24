package registro.registroacademico.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registro.registroacademico.entities.TipoDocumentoEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T18:49:00")
@StaticMetamodel(CoordinadorEntity.class)
public class CoordinadorEntity_ { 

    public static volatile SingularAttribute<CoordinadorEntity, String> apellidos;
    public static volatile SingularAttribute<CoordinadorEntity, Long> nro_documento;
    public static volatile SingularAttribute<CoordinadorEntity, TipoDocumentoEntity> tipoDocumento;
    public static volatile SingularAttribute<CoordinadorEntity, String> genero;
    public static volatile SingularAttribute<CoordinadorEntity, Integer> id_coordinador;
    public static volatile SingularAttribute<CoordinadorEntity, String> email;
    public static volatile SingularAttribute<CoordinadorEntity, String> nombres;

}
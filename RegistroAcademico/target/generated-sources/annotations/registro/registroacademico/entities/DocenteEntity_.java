package registro.registroacademico.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registro.registroacademico.entities.TipoDocumentoEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T18:49:00")
@StaticMetamodel(DocenteEntity.class)
public class DocenteEntity_ { 

    public static volatile SingularAttribute<DocenteEntity, String> apellidos;
    public static volatile SingularAttribute<DocenteEntity, Long> nro_documento;
    public static volatile SingularAttribute<DocenteEntity, TipoDocumentoEntity> tipoDocumento;
    public static volatile SingularAttribute<DocenteEntity, String> area_profundizacion;
    public static volatile SingularAttribute<DocenteEntity, String> genero;
    public static volatile SingularAttribute<DocenteEntity, Integer> id_docente;
    public static volatile SingularAttribute<DocenteEntity, String> email;
    public static volatile SingularAttribute<DocenteEntity, String> nombres;

}
package puc.tcc.logistics.persistence.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "supplier")
@EqualsAndHashCode
@Data
public class SupplierEntity implements Serializable {
    private static final String SEQ_SUPPLIER_GEN = "SEQ_SUPPLIER_GEN";
    private static final String SQ_SUPPLIER = "SEQ_SUPPLIER";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_SUPPLIER_GEN)
    @SequenceGenerator(name = SEQ_SUPPLIER_GEN, sequenceName = SQ_SUPPLIER, allocationSize = 1)
    private Long id;
    private String cnpj;
    private String phone;
    private String email;
    private String name;
}

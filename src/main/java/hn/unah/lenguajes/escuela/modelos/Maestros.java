package hn.unah.lenguajes.escuela.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="maestros")
@Data
public class Maestros {
    
    @Id
    @Column(name="codigomaestro")
    private String codigoMaestro;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    @OneToOne(mappedBy = "maestro", cascade = CascadeType.ALL)
    private Direccion direccion;
    
}

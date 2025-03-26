package unah.lenguajes.examen.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="prestamos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Prestamo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigoPrestamos")
    private int codigoPrestamos;

    private Date fechaApertura;
    
    private double monto;

    private double cuota;

    private int plazo;

    private double interes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente dni;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigoCuota", referencedColumnName = "codigoCuota")
    private List<Cuota> entidadCuota;
}

package unah.lenguajes.examen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cuotas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cuota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigocuota")
    private int codigoCuota;

    private int mes;

    private double interes;

    private double capital;

    private double saldo;

    @ManyToOne
    private int codigoPrestamo;
}

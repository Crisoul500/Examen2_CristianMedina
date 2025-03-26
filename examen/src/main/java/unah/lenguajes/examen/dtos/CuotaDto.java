package unah.lenguajes.examen.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CuotaDto {
    private int codigoCuotaDto;

    private int mesDto;

    private double interesDto;

    private double capitalDto;

    private double saldoDto;

    private int codigoPrestamoDto;
}

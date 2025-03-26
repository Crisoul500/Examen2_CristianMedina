package unah.lenguajes.examen.dtos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import unah.lenguajes.examen.entities.Cliente;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PrestamoDto {
    private int codigoPrestamosDto;

    private Date fechaAperturaDto;
    
    private double montoDto;

    private double cuotaDto;

    private int plazoDto;

    private double interesDto;

    private Cliente dniDto;

    private List<CuotaDto> entidadCuotaDto;
}

package unah.lenguajes.examen.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteDto {
    private String dniDto;

    private String nombreDto;

    private String apellidoDto;

    private String telefonoDto;

    private List<PrestamoDto> prestamoDto;
}

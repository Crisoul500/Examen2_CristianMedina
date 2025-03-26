package unah.lenguajes.examen.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.examen.dtos.ClienteDto;
import unah.lenguajes.examen.dtos.PrestamoDto;
import unah.lenguajes.examen.entities.Cliente;
import unah.lenguajes.examen.entities.Prestamo;
import unah.lenguajes.examen.repositories.ClienteRepository;
import unah.lenguajes.examen.repositories.CuotaRepository;
import unah.lenguajes.examen.repositories.PrestamoRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Autowired
    private CuotaRepository cuotaRepository;

    public ClienteDto crearCliente(ClienteDto entity) {
        if(clienteRepository.count() == 0){
            Cliente nvoCliente = new Cliente();
            nvoCliente.setDni(entity.getDniDto());
            nvoCliente.setNombre(entity.getNombreDto());
            nvoCliente.setApellido(entity.getApellidoDto());
            nvoCliente.setTelefono(entity.getTelefonoDto());

            Cliente save = clienteRepository.save(nvoCliente);
            
            if(entity.getPrestamoDto()!= null){
                List<Prestamo> prestamos = new LinkedList<>();
                for (PrestamoDto prestamoDto : entity.getPrestamoDto()) {
                    Prestamo nvoPrestamo = new Prestamo();
                    nvoPrestamo.setFechaApertura(prestamoDto.getFechaAperturaDto());
                    nvoPrestamo.setMonto(prestamoDto.getMontoDto());
                    nvoPrestamo.setPlazo(prestamoDto.getPlazoDto());
                    nvoPrestamo.setInteres(prestamoDto.getInteresDto());
                    nvoPrestamo.setCuota(
                        (nvoPrestamo.getMonto()*nvoPrestamo.getInteres()/12)/(1-Math.pow((1+nvoPrestamo.getInteres()/12), nvoPrestamo.getPlazo()*12)));
                    
                    prestamos.add(nvoPrestamo);
                    prestamoRepository.save(nvoPrestamo);

                    
                    nvoPrestamo.setEntidadCuota(null);
                }
                save.setPrestamo(prestamos);
            }
        }

        return null;
    }




}

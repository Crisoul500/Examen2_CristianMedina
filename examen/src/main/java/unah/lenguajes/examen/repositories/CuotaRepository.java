package unah.lenguajes.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import unah.lenguajes.examen.entities.Cuota;

@Repository
public interface CuotaRepository extends CrudRepository<Cuota, Integer>{
    
}

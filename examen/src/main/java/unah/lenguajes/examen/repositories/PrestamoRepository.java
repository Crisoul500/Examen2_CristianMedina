package unah.lenguajes.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import unah.lenguajes.examen.entities.Prestamo;

@Repository
public interface PrestamoRepository extends CrudRepository<Prestamo, Integer>{
    
}

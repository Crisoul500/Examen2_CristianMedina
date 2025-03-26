package unah.lenguajes.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import unah.lenguajes.examen.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String>{
    
}

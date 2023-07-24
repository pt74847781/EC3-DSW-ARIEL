package com.example.EC3dsw;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "instrumento", path = "instrumento ")
public interface instrumentoRepository extends PagingAndSortingRepository<instrumento, Integer>,CrudRepository<instrumento, Integer> {
    
    List<instrumento> findByNombre(@Param("nombre") String nombre);

}
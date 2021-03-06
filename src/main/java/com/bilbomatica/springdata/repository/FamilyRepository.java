package com.bilbomatica.springdata.repository;


import com.bilbomatica.springdata.pojo.Family;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * path hace referencia a la uri para las peticiones rest
 */
@RepositoryRestResource(collectionResourceRel = "familias", path = "familias")
public interface FamilyRepository extends MongoRepository<Family, String> {
}

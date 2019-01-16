package com.bilbomatica.springdata.repository;

import com.bilbomatica.springdata.pojo.Persons;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * path hace referencia a la uri para las peticiones rest
 */
@RepositoryRestResource(collectionResourceRel = "personas", path = "personas")
public interface PersonRepository  extends MongoRepository<Persons, String> {

}

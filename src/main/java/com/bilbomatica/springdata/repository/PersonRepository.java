package com.bilbomatica.springdata.repository;

import com.bilbomatica.springdata.pojo.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonRepository  extends MongoRepository<Person, String> {

}
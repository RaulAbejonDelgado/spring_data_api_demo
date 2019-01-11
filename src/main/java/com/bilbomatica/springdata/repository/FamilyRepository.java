package com.bilbomatica.springdata.repository;


import com.bilbomatica.springdata.pojo.Family;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "familias", path = "familias")
public interface FamilyRepository extends MongoRepository<Family, String> {
}

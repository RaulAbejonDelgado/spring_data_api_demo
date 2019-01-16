package com.bilbomatica.springdata.repository;

import com.bilbomatica.springdata.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * path hace referencia a la uri para las peticiones rest
 */
@RepositoryRestResource(collectionResourceRel = "comentarios", path = "comentarios")
public interface CommentRepository extends MongoRepository<Comment, String> {
}

package tech.gregori.web_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.gregori.web_backend.data.ToDo;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
}

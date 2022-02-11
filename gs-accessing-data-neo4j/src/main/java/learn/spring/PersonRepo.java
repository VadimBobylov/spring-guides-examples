package learn.spring;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PersonRepo extends Neo4jRepository<Person,Long> {
    Person findByName(String name);
}

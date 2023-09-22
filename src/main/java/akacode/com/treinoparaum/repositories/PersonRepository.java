package akacode.com.treinoparaum.repositories;

import akacode.com.treinoparaum.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

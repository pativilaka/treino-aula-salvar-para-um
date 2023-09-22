package akacode.com.treinoparaum.repositories;

import akacode.com.treinoparaum.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //Department getDepartamentById(Long dptId);

}

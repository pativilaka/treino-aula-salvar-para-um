package akacode.com.treinoparaum.services;

import akacode.com.treinoparaum.dto.PersonDepartmentDTO;
import akacode.com.treinoparaum.entities.Department;
import akacode.com.treinoparaum.entities.Person;
import akacode.com.treinoparaum.repositories.DepartmentRepository;
import akacode.com.treinoparaum.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    @Autowired
    DepartmentRepository deptRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        /*Department dept = new Department();
        dept.setId(dto.getDepartment().getId());*/

        Department dept = deptRepository.getReferenceById(dto.getDepartment().getId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDepartmentDTO(entity);
    }
}

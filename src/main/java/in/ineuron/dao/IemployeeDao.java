package in.ineuron.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ineuron.model.Employee;

@Repository
public interface IemployeeDao extends JpaRepository<Employee, Integer>{

}
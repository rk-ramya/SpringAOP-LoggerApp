package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IemployeeDao;
import in.ineuron.model.Employee;

@Service
public class ServiceImp implements IAOPService{

	@Autowired
	IemployeeDao repo;
	
	@Override
	public void saveEmployee(Employee e) {
		repo.save(e);
		System.out.println("Employee Object is saved...");
		
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
		
	}
	
	}
	


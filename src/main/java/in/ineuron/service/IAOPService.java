package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Employee;

public interface IAOPService {
	public List<Employee> getAllEmployees();
	void saveEmployee(Employee e);
}

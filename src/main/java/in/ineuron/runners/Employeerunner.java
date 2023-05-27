package in.ineuron.runners;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ineuron.model.Employee;
import in.ineuron.service.IAOPService;

@Component
public class Employeerunner implements CommandLineRunner {

	@Autowired
	private IAOPService service;
	@Override // main----> run() -----> continue with buisness logic
	public void run(String... args) throws Exception {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter details of the new employee");
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		System.out.println("Enter the employee name");
		String name=sc.next();
		System.out.println("Enter the employee address");
		String add = sc.next();
		
		service.saveEmployee(new Employee(id,name,add));
		
		System.out.println("fetching all employees from database ");
		List<Employee> result = service.getAllEmployees();
		result.forEach(System.out::println);

	}

}

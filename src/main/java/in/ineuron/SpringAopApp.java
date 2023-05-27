package in.ineuron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ineuron.aspects.TransactionManagement;

@SpringBootApplication
public class SpringAopApp {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApp.class, args);
		
		
	}
}

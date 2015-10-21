package apples.ibm.ctp.bluemix.mongdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootMongDbLocalApplication {

    @Autowired
    public EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongDbLocalApplication.class, args);
    }

    @PostConstruct
    public void init()
    {
        employeeRepository.save(new Employee("1", "pas", "apicella"));
        employeeRepository.save(new Employee("2", "lucia", "apicella"));
        employeeRepository.save(new Employee("3", "lucas", "apicella"));
        employeeRepository.save(new Employee("4", "siena", "apicella"));
    }
}

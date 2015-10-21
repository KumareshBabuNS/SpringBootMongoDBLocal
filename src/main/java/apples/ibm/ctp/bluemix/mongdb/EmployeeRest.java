package apples.ibm.ctp.bluemix.mongdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRest
{
    @Autowired
    public EmployeeRepository employeeRepository;

    @RequestMapping("/allemps")
    public List<Employee> getAll ()
    {
        return employeeRepository.findAll();
    }
}

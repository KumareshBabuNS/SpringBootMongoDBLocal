package apples.ibm.ctp.bluemix.mongdb;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pasapicella on 16/10/15.
 */
public interface EmployeeRepository extends MongoRepository<Employee, String>
{
}

package in.com.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.com.sms.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}

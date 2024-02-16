package in.com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.com.sms.entity.Student;
import in.com.sms.repo.StudentRepo;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{
@Autowired
	private  StudentRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

}

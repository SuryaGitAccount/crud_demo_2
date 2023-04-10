package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Student;
import com.demo.repositories.StudentRepository;

@SpringBootTest
class CrudDemo2ApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Test
	void saveOneStudentInformation() {
		Student s = new Student();
		s.setName("smith");
		s.setCourse("devops");
		s.setFee(7500);
		studentRepo.save(s);
	}
	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(2L);
	}

}

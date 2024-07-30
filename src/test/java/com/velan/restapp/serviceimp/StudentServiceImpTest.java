package com.velan.restapp.serviceimp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.velan.restapp.model.Attendance;
import com.velan.restapp.model.Student;
import com.velan.restapp.service.StudentService;

@SpringBootTest
class StudentServiceImpTest {
	
	@Autowired
	private StudentService service;
	
	@Test
	void testAddSuccess() {
	Attendance att=new Attendance(1,"18-07-2024","Thursday","Present");
	Student stud=new Student(1,"Velan","CSE","D",att);
	assertEquals("success",service.addStudent(stud));
	}
	
	@Test
	void testAddFailure() {
		Student stud = null;
		assertEquals("failure",service.addStudent(stud) );
	}
	
	@Test
	void testGetSuccess() {
		assertNotNull(service.getStudent(2));
	}
	
	@Test
	void testGetFailure() {
		assertNull(service.getStudent(200));
	}
 
	@Test
	void testGetAllStudent() {
		assertNotNull(service.getAllStudent());
	}
 
	@Test
	void testUpdateSuccess() {
		Attendance att=new Attendance(8,"18-07-2024","Thursday","Present");
		Student stud = new Student(4,"Aravind","AIDS","A",att);
		assertEquals("success", service.updateStudent(stud));
	}
 
	@Test
	void testUpdateFailure() {
		Student stud = null;
		assertEquals("failure", service.updateStudent(stud));
	}
 
	@Test
	void testDeleteSuccess() {
		assertEquals("success",  service.deleteStudent(5));
	}
	
	@Test
	void testDeleteFailure() {
		assertEquals("failure",  service.deleteStudent(10));
	}
}

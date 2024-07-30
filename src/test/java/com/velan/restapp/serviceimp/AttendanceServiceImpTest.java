package com.velan.restapp.serviceimp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.velan.restapp.model.Attendance;
import com.velan.restapp.service.AttendenceService;

@SpringBootTest
class AttendanceServiceImpTest {
	
	@Autowired
	private AttendenceService service;

	@Test
	void testAddSuccess() {
	Attendance att=new Attendance(1,"18-07-2024","Thursday","Absent");
	assertEquals("success",service.addAttendance(att));
	}
	
	@Test
	void testAddFailure() {
		Attendance att = null;
		assertEquals("failure",service.addAttendance(att) );
	}
	
	@Test
	void testGetSuccess() {
		assertNotNull(service.getAttendance(2));
	}
	
	@Test
	void testGetFailure() {
		assertNull(service.getAttendance(200));
	}
 
	@Test
	void testGetAllAttendance() {
		assertNotNull(service.getAllAttendance());
	}
 
	@Test
	void testUpdateSuccess() {
		Attendance att=new Attendance(10,"17-07-2024","Wednesday","Present");
		assertEquals("success", service.updateAttendance(att));
	}
 
	@Test
	void testUpdateFailure() {
		Attendance att = null;
		assertEquals("failure", service.updateAttendance(att));
	}
	
	@Test
	void testDeleteFailure() {
		assertEquals("failure",  service.deleteAttendance(20));
	}

}

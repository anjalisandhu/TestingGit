package com.secureapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.secureapp.repository.StudentRepository;



@RestController
public class StudentController {
	@Autowired
	StudentRepository studentrepo;
	
	
	//first type

	/*
	 * @PostMapping("/savedata")
	 * 
	 * @ResponseBody public String saveStudent(@RequestBody Student student) {
	 * 
	 * System.out.println("Received Student: " + student); List<Address> addlst =
	 * new ArrayList<Address>(); Address address = new Address();
	 * address.setAddress("sonipat"); address.setStudent(student); Address address1
	 * = new Address(); address1.setAddress("karnal"); address1.setStudent(student);
	 * addlst.add(address); addlst.add(address1); student.setAddresss(addlst);
	 * studentrepo.save(student);
	 * 
	 * return "student with multiple address save successully";
	 * 
	 * }
	 */

	
	//second type
	
	/*
	 * @PostMapping("/savedata") public Student
	 * saveStudentWithAddresses(@RequestBody Student student) { // Ensure the
	 * bidirectional relationship is properly set if (student.getAddresss() != null)
	 * { for (Address address : student.getAddresss()) {
	 * address.setStudent(student);
	 * 
	 * } } System.out.println("student with address is : "+student); return
	 * studentrepo.save(student); }
	 */
	
	//third type
	
	/*
	 * @PostMapping("/savedata") public Student
	 * saveStudentWithAddresses(@RequestBody Student student) { // The student
	 * entity already contains the addresses, so simply save it
	 * System.out.println("Student with addresses is: " + student); return
	 * studentrepo.save(student); }
	 */
	
	
	
	
}

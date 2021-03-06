package com.dummy.studentmicroservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dummy.studentmicroservice.dto.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	 private static Map<String, List<Student>> schooDB = new HashMap<>();
	 
	    static {
	        schooDB = new HashMap<>();
	 
	        List<Student> lst = new ArrayList<>();
	        Student std = new Student("Sajal", "Class IV");
	        lst.add(std);
	        std = new Student("Lokesh", "Class V");
	        lst.add(std);
	 
	        schooDB.put("abcschool", lst);
	 
	        lst = new ArrayList<>();
	        std = new Student("Kajal", "Class III");
	        lst.add(std);
	        std = new Student("Sukesh", "Class VI");
	        lst.add(std);
	 
	        schooDB.put("xyzschool", lst);
	 
	    }
	 
	    @GetMapping(value = "/getStudentDetailsForSchool/{schoolname}")
	    public List<Student> getStudents(@PathVariable String schoolname) {
	        System.out.println("Getting Student details for " + schoolname);
	 
	        List<Student> studentList = schooDB.get(schoolname);
	        if (studentList == null) {
	            studentList = new ArrayList<>();
	            Student std = new Student("Not Found", "N/A");
	            studentList.add(std);
	        }
	        return studentList;
	    }
}

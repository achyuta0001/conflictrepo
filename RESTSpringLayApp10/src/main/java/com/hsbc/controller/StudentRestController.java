package com.hsbc.controller;

import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(path = "students")
public class StudentRestController {
    @Autowired
    private StudentService service;

    //http://localhost:9091/students/
    @GetMapping(path = "")
    public List<Student> getAllStudents()
    {
        return service.findAllStudent();
    }
    //http://localhost:9091/students/
    @PostMapping(path="")
    public ResponseEntity<String> addStudent(@RequestBody Student student)
    {
        ResponseEntity<String> response=null;
        boolean res= service.addStudent(student);
        if(res)
        {
            response=new ResponseEntity<>("student added", HttpStatus.CREATED);
        }
        else {
            response=new ResponseEntity<>("student cannot be added",HttpStatus.BAD_REQUEST);
        }
        return response;
    }

    @GetMapping(path = "{studentId}")
    public Student getStudentbyId(@PathVariable("studentId") int studentId)
    {
        return service.findStudentById(studentId);
    }

    @DeleteMapping(path = "{studentId}")
    public ResponseEntity<String> deleteStudentById(@PathVariable("studentId") int studentId)
    {
        ResponseEntity<String> response=null;
        boolean res=service.removeStudent(studentId);
        if (res)
        {
            response=new ResponseEntity<>("Student  "+studentId+"is deleted",HttpStatus.OK);
        }
        return response;
    }
}

package com.hsbc.service;

import com.hsbc.exceptions.DuplicateStudentException;
import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

import java.util.List;

public interface StudentService {
    public boolean addStudent(Student student) ;
    public Student findStudentById(int studentId) ;
    public List<Student> findAllStudent();
    public boolean removeStudent(int studentId);
    public boolean changeStudent(int id,String name);
}

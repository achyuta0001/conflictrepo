package com.hsbc.dao;

import com.hsbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public class StudentDaoImpl implements StudentDao{
    @Autowired
    private List<Student> studentDB =null;

    @Override
    public boolean createStudent(Student student) {

        return studentDB.add(student);
    }

    @Override
    public Student readStudentById(int studentId) {
        Student stud=null;
        Optional<Student> op= studentDB.stream().filter(stu->stu.getStudentId()==studentId).findFirst();
        if(op.isPresent())
        {
            stud=op.get();
        }
        return stud;
    }

    @Override
    public List<Student> readAllStudent() {
        return studentDB;
    }

    @Override
    public boolean updateStudent(int id, String name) {
        return false;
    }



    @Override
    public boolean deleteStudent(int studentId) {
        return false;
    }


    public void setStudentDB(List<Student> studentDB) {
        this.studentDB = studentDB;
    }
}

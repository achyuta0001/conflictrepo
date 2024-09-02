package com.hsbc.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import java.util.List;
import java.util.Scanner;
@SpringBootApplication
@ComponentScan(basePackages = {"com.hsbc"})

public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class);
    }

}


//        Scanner scanner=new Scanner(System.in);
//        Student student=context.getBean(Student.class);
//        Student student1=context.getBean(Student.class);
//        student.setStudentId(110);
//        student.setStudentName("Gd");
//        student.setStudentScore(90);
//        student.getDept().setDeptId(10);
//        student.getDept().setDeptName("IT");
//
//        student1.setStudentId(111);
//        student1.setStudentName("Nirmal");
//        student1.setStudentScore(80);
//        student1.getDept().setDeptId(10);
//        student1.getDept().setDeptName("IT");
//
//        //StudentService service=context.getBean(StudentService.class);//gives issues when there are multiple student service classes
//        StudentService service=(StudentService) context.getBean("service");

//        List<Student> listofstuds=service.findAllStudent();
//        listofstuds.stream().forEach(s-> System.out.println(s.getStudentName()));

//        Student student2=service.findStudentById(101);
//        System.out.println(student2);
//        System.out.println(student2.getStudentName());

//
//        service.addStudent(student1);
//        System.out.println();
//        System.out.println("student added");

//        List<Student> list=service.findAllStudent();
//        list.stream().filter(s->s.getStudentName()!=null).forEach(s-> System.out.println(s.getStudentName()));
//        System.out.println(list.size());
//        if(res && res1)
//        {
//            System.out.println("student added");
//        }


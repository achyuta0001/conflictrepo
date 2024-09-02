package com.hsbc.ui;




import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


import java.util.List;
import java.util.Scanner;
@SpringBootApplication
@ComponentScan(basePackages = {"com.hsbc"})

public class MainUD {
    public static void main(String[] args) {
        boolean flag = true;
        ApplicationContext context = SpringApplication.run(Main.class);
    }
}
//        Scanner scanner = new Scanner(System.in);
//        Student student = context.getBean(Student.class);
//        Student student1 = context.getBean(Student.class);
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
//        StudentService service = (StudentService) context.getBean("service");
////        boolean result=service.removeStudent(1006);
////        if(result)
////        {
////            System.out.println("deleted");
////        }
//
//        boolean res= service.changeStudent(101,"adi");
//        if(res)
//        {
//            System.out.println("changed");
//        }
//    }
//}
package com.training.database;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("databaseContext.xml");
        StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("--CREATE RECORD----");
        //studentJDBCTemplate.create(101, "Eshan", 23);
        
        List<Student> student = studentJDBCTemplate.listStudents();
        for (Student student2 : student) {
            System.out.print("\nID :- "+student2.getId());
            System.out.print("NAME:- "+student2.getName());
            System.out.print("AGE:- "+student2.getAge());
        }
    }

}



package com.practice.springboot.thymeleafdemo.controller;

import com.practice.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String studentForm(Model theModel){

        Student theStudent = new Student();

        theModel.addAttribute("student",theStudent);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student")Student theStudent){

        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName()
                + " " + theStudent.getLastName());

        return "student-confirmation";
    }
}

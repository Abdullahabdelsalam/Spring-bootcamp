package com.intraineeship.student.dao;

import com.intraineeship.student.entity.Student;

import java.util.List;

public interface StudentDAO {

   void save(Student theStudent);

   Student findById(Integer id);

   List<Student> findAll();

   List<Student> findByName();

   List<Student> findByFirstORLast();

   List<Student> findByEmailLIKE();

   List<Student> findByNameParameter(String thefirstName);

   void update(Student thestudent);

   void updateAll();

   void deleteById(Integer id);

   void deleteCondition();

   void deleteAll();
}

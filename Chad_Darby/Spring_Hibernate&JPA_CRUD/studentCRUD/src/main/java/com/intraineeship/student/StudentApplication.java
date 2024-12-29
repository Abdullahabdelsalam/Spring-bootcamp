package com.intraineeship.student;

import com.intraineeship.student.dao.StudentDAO;
import com.intraineeship.student.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			System.out.println("Hello World");
//			createStudent(studentDAO);
//			createMultipleStudent(studentDAO);
//			readStudent(studentDAO);
			queryForStudents(studentDAO);
			//queryByNameStudent(studentDAO);
			//queryByFirstORLast(studentDAO);
			//queryByEmailLIKE(studentDAO);
			//queryByNameParameter(studentDAO);
			//updateStudent(studentDAO);
			//updateAllStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteConditionName(studentDAO);
			//deleteAllStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		studentDAO.deleteAll();
	}

	private void deleteConditionName(StudentDAO studentDAO) {
		studentDAO.deleteCondition();
	}

	private void deleteStudent(StudentDAO studentDAO) {
		studentDAO.deleteById(4);
	}

	private void updateAllStudent(StudentDAO studentDAO) {
		studentDAO.updateAll();
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student theStudent = studentDAO.findById(4);
		theStudent.setFirstName("Khald");
		studentDAO.update(theStudent);
	}

	private void queryByNameParameter(StudentDAO studentDAO) {
		//get list of student
		List<Student> theStudents = studentDAO.findByNameParameter("abdallah");
		//display list of student
		for (Student temStydent : theStudents){
			System.out.println(temStydent);
		}
	}

	private void queryByEmailLIKE(StudentDAO studentDAO) {
		//get list of student
		List<Student> theStudents = studentDAO.findByEmailLIKE();
		//display list of student
		for (Student temStydent : theStudents){
			System.out.println(temStydent);
		}
	}

	private void queryByFirstORLast(StudentDAO studentDAO) {
		//get list of student
		List<Student> theStudents = studentDAO.findByFirstORLast();
		//display list of student
		for (Student temStydent : theStudents){
			System.out.println(temStydent);
		}
	}

	private void queryByNameStudent(StudentDAO studentDAO) {
		//get list of student
		List<Student> theStudents = studentDAO.findByName();
		//display list of student
		for (Student temStydent : theStudents){
			System.out.println(temStydent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		//get list of student
		List<Student> theStudents = studentDAO.findAll();
		//display list of student
		for (Student temStydent : theStudents){
			System.out.println(temStydent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		// create student object
		System.out.println("Create multiple new student object ...");
		Student stZeyad = new Student("Zeyad","Alam","zeyadA204@gmail.com");
		//save the student object
		System.out.println("Save multiple the Student ...");
		studentDAO.save(stZeyad);
		//display id the save student
		System.out.println("Save student. Generated id : " + stZeyad.getId());
		Integer zeyadId = stZeyad.getId();
		//retrieve student
		System.out.println("\nRetrieve student with id : " + zeyadId );
		Student myStudent = studentDAO.findById(zeyadId);
		System.out.println("Found the student : " + myStudent);

	}

	private void createMultipleStudent(StudentDAO studentDAO) {

		// create multiple student
		System.out.println("Create multiple new student object ...");
		Student stOmer = new Student
				("Omer","Nasser","omerN204@gmail.com");
		Student stNader = new Student
				("Nader","Mohammed","naderM204@gmail.com");
		Student stMohammed = new Student
				("Mohammed","Saad","mohamedS204@gmail.com");
		Student stHany = new Student
				("Hany","shams","hanyS204@gmail.com");

		//save multiple the student object
		System.out.println("Save multiple the Student ...");
		studentDAO.save(stOmer);
		studentDAO.save(stNader);
		studentDAO.save(stMohammed);
		studentDAO.save(stHany);

	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Create new student object ...");
		Student stAbdallah = new Student
				("Abdallah","shams",
						"abdallah204@gmail.com");

		//save the student object
		System.out.println("Save the Student ...");
		studentDAO.save(stAbdallah);

		//display id the save student
		System.out.println("Save student. Generated id : "
				+ stAbdallah.getId());
	}

}

package com.intraineeship.student.implDAO;

import com.intraineeship.student.dao.StudentDAO;
import com.intraineeship.student.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    //define field for entityManager
    private EntityManager entityManager;

    //inject entityManager used constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //Implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    // Implement findById method
    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }
    // Implement findAll method
    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student",Student.class);
        return theQuery.getResultList();
    }
    // Implement findByName method
    @Override
    public List<Student> findByName() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE firstName='Abdallah'",Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByFirstORLast() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE firstName='Abdallah' OR lastName='shams'",Student.class);
        return theQuery.getResultList();

    }

    @Override
    public List<Student> findByEmailLIKE() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE email LIKE '%gmail.com' ",Student.class);
        return theQuery.getResultList();

    }

    @Override
    public List<Student> findByNameParameter(String thefirstName) {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE firstName=:theData ",Student.class);
        theQuery.setParameter("theData",thefirstName);
        return theQuery.getResultList();

    }

    @Override
    @Transactional
    public void update(Student thestudent) {
        entityManager.merge(thestudent);
    }

    @Override
    @Transactional
    public void updateAll() {
        int numRowsUpdate = entityManager.createQuery("UPDATE Student SET lastName='shams'").executeUpdate();
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        Student theStudent = entityManager.find(Student.class,id);
        entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public void deleteCondition() {
        entityManager.createQuery("DELETE FROM Student WHERE firstName='abdallah'").executeUpdate();
    }

    @Override
    @Transactional
    public void deleteAll() {
        entityManager.createQuery("DELETE FROM Student").executeUpdate();
    }


}

package com.learning.app.service;

import com.learning.app.model.Student;

import java.util.List;

public interface IStudentService {

    public Student addStudent(Student student);

    public List<Student> getStudents();

    public Student updateStudent(Student student, Long id);

    public Student getStudentById(Long id);

    public void deleteStudent(Long id);

}

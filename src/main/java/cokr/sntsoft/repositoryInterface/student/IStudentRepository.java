package cokr.sntsoft.repositoryInterface.student;

import java.util.Collection;




public interface IStudentRepository {
    
    Collection<Student> getAllStudents();

    Student findStudent(int id);

    Student addStudent(Student student);

    Student delStudent(int id);

    Student ediStudent(Student student);
    
}

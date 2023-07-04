package cokr.sntsoft.repositoryInterface.student;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    private IStudentRepository repository;

    public StudentService(@Qualifier("csvQualifier") IStudentRepository repository){
        this.repository = repository;
    }

    public Collection<Student> getAllStudents(){
        return repository.getAllStudents();
    }

    public Student findStudent(int id){
        return repository.findStudent(id);
    }

    public Student addStudent(Student student){

        return repository.addStudent(student);
    }

    public Student delStudent(int id){
        return repository.delStudent(id);
    }

    public Student editStudent(Student student){
        return repository.ediStudent(student);
    }

}

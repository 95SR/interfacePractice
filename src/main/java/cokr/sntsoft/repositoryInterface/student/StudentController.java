package cokr.sntsoft.repositoryInterface.student;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service){
        this.service=service;
    }

    @GetMapping("/students")
    public StudentsResponse getAllStudents(){
        Collection<Student> students = service.getAllStudents();
        StudentsResponse response = new StudentsResponse();

        if(students.isEmpty()){
            response.setStatus(204);
            response.setData(null);
        } else{
            response.setData(students);
        }

        return response;
    }

    @GetMapping("/student/{id}")
    public StudentResponse findStudent(@PathVariable int id){
        Student student = service.findStudent(id);
        StudentResponse response = new StudentResponse();
        response.setData(student);
        if(student == null){
            response.setStatus(204);
        }

        return response;
    }

    @PostMapping("/students")
    public StudentResponse addStudent(@RequestBody Student student){
        return null;
    }

    @DeleteMapping("/student/{id}")
    public BoolResponse delStudent(@PathVariable int id){
        return null;
    }

    @PutMapping("/student/{id}")
    public StudentResponse editStudent(@RequestBody Student student){
        return null;
    }

    
}

package cokr.sntsoft.repositoryInterface.student;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("csvQualifier")
public class CsvRepository implements IStudentRepository{
    private HashMap<Integer,Student> myData ;

    public CsvRepository(){
        myData=CsvReader.studentData();
    }

    @Override
    public Collection<Student> getAllStudents() {
        return myData.values();
    }

    @Override
    public Student findStudent(int id) {
        return myData.get(id);
    }

    @Override
    public Student addStudent(Student student) {
        if(myData.containsKey(student.getId())) {return null;}

        myData.put(student.getId(), student);

        return student;
    }

    @Override
    public Student delStudent(int id) {
        
        
        return myData.remove(id);
    }

    @Override
    public Student ediStudent(Student student) {
        //in case nothing got replaced -> null
         
        return myData.replace(student.getId(), student);
    }
    
}

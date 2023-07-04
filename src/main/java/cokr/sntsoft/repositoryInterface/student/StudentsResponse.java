package cokr.sntsoft.repositoryInterface.student;


import java.util.Collection;

public class StudentsResponse extends Response {
    private Collection<Student> data;
    
    public Collection<Student> getData() {
        return data;
    }

    public void setData(Collection<Student> studentList) {
        this.data = studentList;
    }
}

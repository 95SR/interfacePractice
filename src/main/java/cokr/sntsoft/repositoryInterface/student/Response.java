package cokr.sntsoft.repositoryInterface.student;

import java.util.ArrayList;

public class Response {
    private String error;
    public String getError() {
        return error;
    }


    public void setError(String error) {
        this.error = error;
    }
    private int status;

     public Response(){
        error = "";
        status = 200;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    
    
}
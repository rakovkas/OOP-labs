package week11;

import java.util.List;

public class EmptyStudentListException extends RuntimeException{
    //UNCHECKED exception bcs it extends RuntimeException
    public EmptyStudentListException (String message){
        super(message);
    }
}

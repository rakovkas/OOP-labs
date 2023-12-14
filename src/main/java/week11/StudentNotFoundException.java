package week11;

public class StudentNotFoundException extends Exception{
    //CHECKED EXCEPTION  because it extends Exception
    public StudentNotFoundException (String message){
        super(message);
    }
}

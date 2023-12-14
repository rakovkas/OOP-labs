package week11;

import java.util.Optional;

public class Main {
    public static void main (String[] args) throws StudentNotFoundException {
        StudentSystem studentSystem = new StudentSystem("students.csv");

        for (Student student : studentSystem.students){
            student.toString();
        }

        Optional<Student> s = studentSystem.getStudentById(10);

        if (s.isEmpty()){
            throw new StudentNotFoundException("Student could not be found.");
        } else
            System.out.println(s);
    }
}

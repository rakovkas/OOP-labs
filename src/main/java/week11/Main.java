package week11;

import java.util.Optional;

public class Main {
    public static void main (String[] args) throws StudentNotFoundException {
        StudentSystem studentSystem = new StudentSystem("students.csv");

        for (Student student : studentSystem.students){
            System.out.println(student);
        }

        try {
            Optional<Student> student = studentSystem.getStudentById(10);
            System.out.println(student.orElseThrow(
                    () ->new StudentNotFoundException("Student not found.")));
        }catch (StudentNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Student with the highest GPA: " + studentSystem.getHighestGPAStudent());
        System.out.println("Student with the longest name:" + studentSystem.getLongestNameStudent());
    }

}

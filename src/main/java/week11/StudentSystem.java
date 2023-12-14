package week11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {
    List<Student> students;
    public StudentSystem (String filename){
        try {
            students = readStudents(filename);
        } catch (IOException e){
            System.out.println("Unable to read a file.");
        }
    }

    public static List<Student> readStudents (String filename) throws IOException {
        List<Student> students = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<String> lines = reader.lines().collect(Collectors.toList());

        for (String line : lines){
            String[] parsedLine = line.split(",");
            Student temp = new Student(
                    parsedLine[0] == "" ? 0 : Integer.parseInt(parsedLine[0]),
                    parsedLine[1],
                    parsedLine[2],
                    parsedLine[3],
                    parsedLine[4] == "" ? 0 : Double.parseDouble(parsedLine[4]));

            students.add(temp);
        }

        reader.close(); //try-with-resources statement
        // (the best case is to always put this into finally statement, after try, catch)
        return students;
    }

    public Optional<Student> getStudentById (int ID) {
        for (Student student : this.students){
            if (student.getID() == ID){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }


}

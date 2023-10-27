package week4.people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int credits = 0;
    private int student_id;
    private List<Integer> grades;

    public Student (String name, String address){
        super(name, address);
    }

    public void study (){
        credits += 1;
    }

    public String toString(){
        return this.getName() + " \n" + this.getAddress()
                + "\n credits " + this.credits;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public int getCredits() {

        return credits;
    }

    public void setCredits(int credits) {

        this.credits = credits;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }


}

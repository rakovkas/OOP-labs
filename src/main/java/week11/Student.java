package week11;

public class Student {
    private int ID;
    private String name;
    private String university;
    private String department;
    private double GPA;

    public Student (int ID, String name, String university, String department, double GPA){
        this.ID = ID;
        this.name = name;
        this.university = university;
        this.department = department;
        this.GPA = GPA;
    }

    public String toString (){
        return this.ID + ", " + this.name + ", " + this.university + ", " + this.department + ", " + this.GPA;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public double getGPA() {
        return GPA;
    }
}
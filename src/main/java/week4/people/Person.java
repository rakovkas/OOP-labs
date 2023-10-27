package week4.people;

public class Person {
    private String name;
    private String address;
    private int age;
    private String country;

    public Person (String newName, String newAddress){
        this.name = newName;
        this.address = newAddress;
    }

    public String toString(){
        return this.name + " \n" + this.address;
    }

    public String getName() {

        return name;
    }

    public String getAddress() {

        return address;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

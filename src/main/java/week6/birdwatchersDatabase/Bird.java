package week6.birdwatchersDatabase;

import java.util.ArrayList;

public class Bird {
    private String name;
    private String latinName;
    private int numOfObservation;


    public Bird (String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.numOfObservation = 0;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.numOfObservation + " observations";
    }



    //getters and setters
    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getNumOfObservation() {
        return numOfObservation;
    }

    public void setNumOfObservation() {
        this.numOfObservation ++;
    }
}

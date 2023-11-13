package week6.birdwatchersDatabase;

import java.util.ArrayList;

public class Birdwatchers {
    private ArrayList<Bird> birds = new ArrayList<>();


    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void addObservation (String birdName){
        int counter = 0;
        for (Bird bird : birds){
            if (bird.getName().equals(birdName)){
                bird.setNumOfObservation();
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("It is not a bird!");
        }
    }

    //print all birds
    public void statistics() {
        for (Bird bird: birds){
            System.out.println(bird);
        }
    }

    //print one bird
    public void show (String birdName){
        for (Bird bird : birds){
            if (bird.getName().equals(birdName)){
                System.out.println(bird);
            }
        }
    }


}

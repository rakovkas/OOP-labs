package week5.service;

public class CivilService implements NationalService {
    private int daysLeft;
    CivilService (){
        this.daysLeft = 360;
    }

    public int getDaysLeft(){
        return this.daysLeft;
    }

    public void work(){
        if (this.daysLeft>0){
            this.daysLeft--;
        }
    }

}

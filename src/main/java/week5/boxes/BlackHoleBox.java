package week5.boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box{
    private List<Thing> box;
    public BlackHoleBox(){
        this.box = new ArrayList<Thing>();
    }

    public void add(Thing thing){
        box.add(thing);
    }

    public boolean isInTheBox (Thing thing){
        return false;
    }
}

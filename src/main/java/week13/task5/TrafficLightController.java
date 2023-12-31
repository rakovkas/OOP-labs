package week13.task5;

public class TrafficLightController {
    public static void main(String[] args){
        TrafficLightContext context = new TrafficLightContext();

        context.transitionToRed();
        context.transitionToYellow();
        context.transitionToGreen();
        context.transitionToYellow();
    }
}

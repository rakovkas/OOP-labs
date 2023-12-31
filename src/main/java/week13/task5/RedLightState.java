package week13.task5;

public class RedLightState  implements TrafficLightState{

    @Override
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Already in RED state.");
    }

    @Override
    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Switch to Green Light");
        context.setState(new GreenLightState());
    }

    @Override
    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Switch to Yellow state");
        context.setState(new YellowLIghtState());
    }
}

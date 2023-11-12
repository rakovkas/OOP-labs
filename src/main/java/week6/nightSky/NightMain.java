package week6.nightSky;

public class NightMain {
    public static void main(String[] args){
        NightSky nightSky = new NightSky(0.1,40,10);
        nightSky.printLine();

        System.out.println("Number of stars: " + nightSky.starsInLastPrint());

        nightSky.printLine();
        System.out.println("Number of starts: " + nightSky.starsInLastPrint());
    }
}

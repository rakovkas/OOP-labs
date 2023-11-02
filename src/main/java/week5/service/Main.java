package week5.service;

public class Main {
    public static void main (String [] args){
        CivilService cs = new CivilService();
        System.out.println(cs.getDaysLeft());
        cs.work();
        System.out.println(cs.getDaysLeft());

        MilitaryService ms = new MilitaryService(60);
        System.out.println(ms.getDaysLeft());
        ms.work();
        System.out.println(ms.getDaysLeft());
    }
}

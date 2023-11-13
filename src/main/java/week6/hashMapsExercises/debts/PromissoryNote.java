package week6.hashMapsExercises.debts;

import java.util.HashMap;

public class PromissoryNote {
    private double loan;
    private String name;

    HashMap<String, Double> debts = new HashMap<>();

    public PromissoryNote(){
    }

    public void setLoan (String toWhom, double  value){
        this.name = toWhom;
        this.loan = value;
        debts.put(this.name, this.loan);
    }

    public double howMuchIsTheDebt (String whose){
        if (!debts.containsKey(whose)){
            return 0;
        }

        return debts.get(whose);
    }

}

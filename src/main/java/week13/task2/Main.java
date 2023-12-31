package week13.task2;

public class Main {
    public static void main(String[] args){
        //CC payment with CCPFactory
        PaymentFactory CCPFactory = new CreditCardPaymentFactory();
        Payment CCPayment = CCPFactory.createPayment();
        CCPayment.processPayment();

        //PP payment using PPPFactory
        PaymentFactory PPPFactory = new PayPalPaymentFactory();
        Payment PPPayment = PPPFactory.createPayment();
        PPPayment.processPayment();
    }
}

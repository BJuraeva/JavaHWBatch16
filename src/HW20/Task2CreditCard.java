package HW20;
/*
Create a class CreditCard and define variable balance and interest.
Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
You do not have permission to send messages in this channel.
 */

public class Task2CreditCard {
    double balance;
    double interest;

    public void calculateInterest(){
        System.out.println((interest/12)*balance);

    }

}
class Visa extends Task2CreditCard{

}
class AX extends Task2CreditCard{
    public void calculateInterest(){
        System.out.println((interest/24)*balance);

    }

}
class CreditCardTester{
    public static void main(String[] args) {

        Task2CreditCard cc = new Task2CreditCard();
        cc.balance=500.5;
        cc.interest=0.065;
        cc.calculateInterest();

        Visa v = new Visa();
        v.balance=500.89;
        v.interest=0.11;
        v.calculateInterest();

        AX a= new AX();
        a.balance=500.5;
        a.interest=0.05;
        a.calculateInterest();
    }
}
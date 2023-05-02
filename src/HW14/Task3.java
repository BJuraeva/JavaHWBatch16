package HW14;

public class Task3 {
    /*
    Write a method to return whether given number is prime or not?
    ---------------------------------
    return type - boolean
    method name - primeNumber
    parameter - int number
    body - for loop
    return - isPrime
     */
    boolean primeNumber(int number){
        boolean isPrime= true;
        for (int i = 2; i < number;  i++) {
            if(number % i == 0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int num = 7;
        Task3 obj = new Task3();
        boolean result = obj.primeNumber(num);
        System.out.println(result);
    }
}
package HW13;

import java.util.Scanner;

public class Task2 {
    /*
    How would you check if String is palindrome or not?
    aba=> true
    Abbc =>false
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below

        String reverse="";
        boolean palindrome=true;
        boolean notPalindrome=false;
        for(int i=givenString.length()-1; i>=0; i--){
            reverse+=givenString.charAt(i);
        }
        if (reverse.equals(givenString)){
            System.out.println(palindrome);
        }else{
            System.out.println(notPalindrome);
        }
    }
}

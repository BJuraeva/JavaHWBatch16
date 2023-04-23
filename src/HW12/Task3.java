package HW12;

import java.util.Scanner;

public class Task3 {
    /*
    Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl - MAIEL
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Mom’s first name?");
        String momNames= scan.nextLine();

        System.out.println("Dad's first name?");
        String dadName=scan.nextLine();

        System.out.println("What are you expecting, boy or girl?");
        String gender=scan.nextLine();

        if(gender.equals("boy")){
            System.out.println("Daniel");
        }else {
            System.out.println("Maiel");
        }


    }

}

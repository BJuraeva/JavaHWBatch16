package HW19;
/*
   Create a class named 'Programming'. While creating an object of the class,
   if nothing is passed to it, then the message "I love programming languages" should be printed.
   If some String is passed to it, then in place of "programming languages" the value variable should be printed.
   Example, if we pass "Java", then "I love Java" should be printed.
 */

public class Task2Programming {
    void printEmpty(){
        System.out.println("I love programming languages.");
    }
    void printNotEmpty(String language){
        System.out.println(language+" is programming language.");
    }

    public static void main(String[] args) {
        Task2Programming empty = new Task2Programming();
        empty.printEmpty();

        Task2Programming notEmpty= new Task2Programming();
        notEmpty.printNotEmpty("Java");

    }
}

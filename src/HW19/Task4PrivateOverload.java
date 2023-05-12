package HW19;
/*
   Create 1 class with a private method that has 3 overloaded forms.
   Then call each overloaded method with specific arguments and observe result.
 */

public class Task4PrivateOverload {
    private static void name(String n1, String n2){
        System.out.println(n1+" "+n2);
    }
    private static void name(String n1, int n2){
        System.out.println(n1+" "+n2);
    }
    private static void name(double n1, int n2){
        System.out.println(n1+" "+n2);
    }

    public static void main(String[] args) {
        name("Jame", "Smith");
        name("Jame", 19);
        name(12.5, 19);
    }

}

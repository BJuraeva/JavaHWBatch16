package HW19;
/*
   Create 1 class with a static method that has 3 overloaded forms.
   Then call each overloaded method with specific arguments and observe result.
 */

public class Task3StaticOverload {
     static void multiply(int n1, int n2){
         System.out.println(n1*n2);
     }
     static void multiply(int n1, byte n2){
         System.out.println(n1*n2);
     }
     static void multiply(double n1, double n2){
         System.out.println(n1*n2);
     }

    public static void main(String[] args) {
         multiply(15,15);
         multiply(15,2);
         multiply(12.5,2.5);

    }
}

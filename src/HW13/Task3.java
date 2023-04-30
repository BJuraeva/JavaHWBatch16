package HW13;

public class Task3 {
    /*
    How would you swap  2 strings without a temporary variable?
     */
    public static void main(String[] args) {

        String a="Class";
        String b="Method";
        System.out.println("Before a: "+a+" b: "+b);

        a=a+b;
        b=a.substring(0,a.length() - b.length());
        a=a.substring(b.length());
        System.out.println("After a: "+a+" b: "+b);

    }

}

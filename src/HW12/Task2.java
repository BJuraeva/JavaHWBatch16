package HW12;

public class Task2 {
    /*
    Create a String and print it in reverse order (Sunday → yadnuS).
     */
    public static void main(String[] args) {
        String day = "Sunday";
        System.out.println(day);

        String rev = "";
        char ch;
        for (int i = 0; i <= 5; i++) {
            ch=day.charAt(i);
            rev = ch +rev;
        }
        System.out.println(rev);

        System.out.println("================================");

        String name = "Barno";
        System.out.println(name);

        int a=0;
        for (int j =4; j >=0; j--) {
            System.out.print(name.charAt(j));

        }



    }
}

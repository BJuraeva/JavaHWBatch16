package HW16;
/*
Create a method that will take a String as a parameter/input and returns reversed String.
Method should be available to all classes within your project and accessible by class name.
 */

public class Reversed {
   public String a (String word) {

        String reversedStr = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + word.charAt(i);
        }
        return reversedStr;
    }


    public static void main(String[] args) {
        Reversed obj=new Reversed();
        String result = obj.a("Methods in java is not easy!");
        System.out.println(result);


    }


}

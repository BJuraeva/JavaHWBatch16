package HW16;
/*
Create a method that will accept a String as a parameter and return a new String
   that consist only of vowels. Method should be available inside the class only where
   it was declared and executed by calling it is name
 */

public class Vowels {
    private String a (String word){
       return word.replaceAll("[^aeiouAEIOU]","");
    }

    public static void main(String[] args) {
        Vowels obj = new Vowels();
        String result = obj.a("Access level denied");
        System.out.println(result);
    }

}

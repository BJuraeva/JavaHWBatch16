package HW12;

public class Task1 {
    /*
    Create a String and if the String is not empty perform the following:
    if the String has an odd number of characters and has 3 or more characters, print the character
    in the middle of the String.
    For Example String str=hello =>l
     */
    public static void main(String[] args) {
        // String name=new String("Mirjahongir");
        String name = "Mirjahongir";

        if(!name.isBlank()&& name.length()%2!=0 && name.length()>=5){
            int middleIndex = name.length()/2;
            char middleChar =name.charAt(middleIndex);
            System.out.println(middleChar);
        }

        System.out.println("=================");


    }

}

package HW13;

public class Task1 {
    /*
    How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
     */
    public static void main(String[] args){
        String sentence ="This is sentence i want to reverse";

        for (int i = sentence.length()-1; i >=0 ; i--) {
            System.out.print(sentence.charAt(i));

        }
    }
}

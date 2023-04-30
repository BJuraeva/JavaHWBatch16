package HW14;

public class Task4 {
    /*
   Create  class Student that will have a method getGrade.
   Your method should accept the score of a student and return a grade:
   score > 90 - A
   score >80 - B
   score >70 - C
   score > 50 - D
   anything else - F
   -----------------------------------------
   return type - String
    name (of the method) - getGrade
    parameters - int score
    body of the method - {
    if -  score > 90 - A
          score >80 - B
          score >70 - C
          score > 50 - D
          anything else - F
    }
    return  grade
     */

    String getGrade(int score){
        if(score > 90){
            return "A";
        } else if (score > 80) {
            return "B";
        }else if (score >70){
            return "C";
        }else if (score > 50){
            return "D";
        }else{
            return "F";
        }
    }

    public static void main(String[] args) {
        int score = 86;
        Task4 obj = new Task4();
        String result = obj.getGrade(score);
        System.out.println(result);
    }


}

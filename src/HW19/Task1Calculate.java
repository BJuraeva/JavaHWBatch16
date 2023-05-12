package HW19;
/*
Create 1 class in which create a methods that will calculate
   the area of Method name must be called calculateArea
   Rectangle
   Square
   Use separate class to test your code
 */

public class Task1Calculate {
    int a;
    int w;
    int l;
    Task1Calculate(int w, int l ){
        this.w=w;
        this.l=l;
        System.out.println(w*l);
    }
    Task1Calculate(int a ){
        this.a=a;
        System.out.println(a*a);
    }

}
class Task1CalculateTester{
    public static void main(String[] args) {

        Task1Calculate rectangle= new Task1Calculate(5,2);

        Task1Calculate square = new Task1Calculate(4);

    }
}

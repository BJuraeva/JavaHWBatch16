package HW18;
/*
Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher .
Test all 4 classes
 */

public class Teacher {
    static String animal = "Giraffe";
    String name = "Lucky";
    int age;

    void live(){
        System.out.println("They live in Africa.");
    }
//===========================================================

}
class MathTeacher extends Teacher{
    String name = "Myph";
    void printName(){
        String name = "Lucy";
        System.out.println(name);
        System.out.println(this.name);
    }
//===========================================================
}
class ChemistryTeacher extends MathTeacher {
void printName2(){
    System.out.println(this.name);

}
}
//==================================================================
class PianoTeacher extends ChemistryTeacher {
    void printAnimal(){
        System.out.println(animal);
        System.out.println(super.name);
    }

}
// ==========================================================================
class Tester{
    public static void main(String[] args) {

        MathTeacher math = new MathTeacher();
        System.out.println(math.name);
        System.out.println(math.age = 10);
        math.live();

        ChemistryTeacher chem = new ChemistryTeacher();
        chem.printName();

        PianoTeacher piano= new PianoTeacher();
        piano.printAnimal();





    }

}


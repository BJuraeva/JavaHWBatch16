package HW21;
/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
      Define common behavior within and some fields in parent class
      and override some of the methods in child classes
      Define some methods specific to child classes
      Create objects of child classes and store them into array.
      Loop through each object and execute available methods.
 */

public class Computer {
    String name;
    int size;
    Computer(String name, int size){
        this.name=name;
        this.size=size;
    }
    void printInfo(){
        System.out.println(name +" "+size);
    }
    void search(){
        System.out.println("We can search anything using browser");
    }
    void type (){
        System.out.println("We can type anything");
    }


}
class Apple extends Computer{

    Apple(String name, int size) {
        super(name, size);
    }
    @Override
    void search(){
        System.out.println("We can use Safari to search information in Apple devices");
    }
    @Override
    void type (){
        System.out.println("We can use Note to type in Apple");
    }
}
class Lenovo extends Computer{

    Lenovo(String name, int size) {
        super(name, size);
    }
    @Override
    void search(){
        System.out.println("We can use EdgeBrowser to search information in Lenovo");
    }
    @Override
    void type (){
        System.out.println("We can use Word to type in Lenovo");
    }
}
class HP extends Computer{

    HP(String name, int size) {
        super(name, size);
    }
    @Override
    void search(){
        System.out.println("We can use Google Chrome to search information in HP");
    }
    @Override
    void type (){
        System.out.println("We can use Word doc to type in HP");
    }
}
class Dell extends Computer{

    Dell(String name, int size) {
        super(name, size);
    }
    @Override
    void search(){
        System.out.println("We can use Google Chrome to search information in Dell");
    }
    @Override
    void type (){
        System.out.println("We can use Word doc to type in Dell");
    }
}

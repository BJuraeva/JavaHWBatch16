package HW17;
/*
   Write a java class that have 4 constructors with 4 different access levels of constructors
   (private, public, default, protected) and create 4 objects of this class:
   1 - inside same class;
   2 - from outside the class;
   3 - from different class inside different package  and observe result.
 */
public class Task2 {
    String name;
    String state;
    protected int ID=12352;
    int age;

    Task2(){

    }
    public Task2(String state){
        this.state=state;
        System.out.println(state+" - public");
    }
    private Task2(int age){
        this.age=age;
        System.out.println(age+" - private");
    }


    public static void main(String[] args) {

        Task2 name=new Task2("Slava");
        System.out.println(name.name);

        Task2 state= new Task2("New York");

        Task2 age = new Task2 (25);



    }



}

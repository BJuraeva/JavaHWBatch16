package HW21;

public class ComputerTester {
    public static void main(String[] args) {

        Computer [] computers={new Apple("Apple",16),new Lenovo("Lenovo",8),new HP("HP",32), new Dell("Dell",16)};
        for(Computer comp:computers){
            comp.printInfo();
            comp.search();
            comp.type();
        }

    }
}

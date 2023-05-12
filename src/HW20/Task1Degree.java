package HW20;
/*
Create a class 'Degree' having a method 'getPrerequisite' that prints
"To get a degree you need high school diploma"
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
 */

public class Task1Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }

}

class Bachelor extends Task1Degree {

}

class Master extends Task1Degree {
    @Override
    public void getPrerequisite() {
        System.out.println("To get a Master degree you need have Bachelor degree");
    }

}

class DegreeTester {
    public static void main(String[] args) {
        Task1Degree degree = new Task1Degree();
        degree.getPrerequisite();

        Bachelor bachelor = new Bachelor();
        bachelor.getPrerequisite();

        Master master = new Master();
        master.getPrerequisite();
    }
}

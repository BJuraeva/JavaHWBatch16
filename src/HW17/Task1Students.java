package HW17;

import HW15.Students;

public class Task1Students {
    String name;
    int grade1;
    int grade2;
    int grade3;

    public Task1Students(String name, int grade1, int grade2, int grade3) {

        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public void printInfo(){
        int average = (grade1 + grade2 + grade3) / 3;
        System.out.println(name + ": the average is " + average);
    }

    public static void main(String[] args) {
        Task1Students student1 = new Task1Students("Aliya", 93, 95, 98);
        student1.printInfo();
        Task1Students student2 = new Task1Students("Mir", 85, 79, 82);
        student2.printInfo();
        Task1Students student3 = new Task1Students("Layla", 74, 82, 56);
        student3.printInfo();
        Task1Students student4 = new Task1Students("Senya", 78, 92, 63);
        student4.printInfo();
        Task1Students student5 = new Task1Students("John", 65, 75, 76);
        student5.printInfo();
    }
}

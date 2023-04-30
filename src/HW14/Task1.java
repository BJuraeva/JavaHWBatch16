package HW14;

public class Task1 {
    /*
    Create a method that will say Hello in different language based on the country
    that will passed when method is executed.
    --------------------------------------------
    return type - void
    name (of the method) - sayHello
    parameters - (String Country)
    body of the method - { switch (country)
    }
    return country
     */
    String sayHello(String country){
        switch (country){
            case "USA":
                System.out.println("Hello!");
                break;
            case "Tajikistan":
                System.out.println("Salam");
                break;
            case "Russia":
                System.out.println("Privet");
                break;
            default:
                System.out.println("Unknown language");
        }
        return country;
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        String country="Tajikistan";
        obj.sayHello(country);
    }

}

package HW14;

public class Task2 {
    /*
     Create a method createEmail(). Based on values of users firstName,
     lastName and email type, your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     -----------------------------------------------
     return type - void
     name of method - createEmail()
     parameter - (String firstName, String lastName, String email)
     body method -
     return -completeEmailAddress
     */
    String createEmail(String firstName, String lastName, String emailType){
        String completeEmailAddress=firstName+lastName+"@"+emailType+".com";
        return completeEmailAddress;
    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        String firstName="john";
        String lastName="snow";
        String emailType="gmail";
        String completeEmailAddress= obj.createEmail(firstName, lastName, emailType);
        System.out.println(completeEmailAddress);
    }

}

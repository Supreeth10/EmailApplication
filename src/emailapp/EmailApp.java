package emailapp;

public class EmailApp {
    public static void main(String[] args) {
    Email em1 = new Email("John","Doe");
    System.out.println("Before using setters and getters");
    System.out.println(em1.showInfo());

    em1.setMailboxCapacity(5000);
    em1.setAlternateEmail("john@doe.com");
    em1.changePassword("IcanSeeYou@247");
    System.out.println("After using setters and getters");
    System.out.println(em1.showInfo());



    }
}

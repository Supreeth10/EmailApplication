package emailapp;
import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // constructor to set firstname and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // call a function to ask for the department and set it
        this.department = setDepartment();

        //call a method that returns random password
        this.password = randomPassword(this.defaultPasswordLength);

        //combine all the details to create the password
        this.email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+companySuffix;
    }

    //Ask for the department
    private String setDepartment() {
        System.out.println("Enter the department  \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
        Scanner In = new Scanner(System.in);
        int depChoice = In.nextInt();
        if (depChoice == 1) {
            this.department = "sales";
        }
        else if (depChoice == 2) {
            this.department = "dev";
        }
        else if (depChoice == 3) {
            this.department = "acct";
        }
        else {return "";}
        return department;
    }

    //Generate a random password
    public String randomPassword(int length){
        final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    //Change the password
    public void changePassword(String password){
            this.password = password;
    }

    public int getMailboxCapacity(){
        return this.mailboxCapacity;
    }

    public String getAlternateEmail(){
        return this.alternateEmail;
    }
    public String getPassword(){
        return this.password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "\nEMAIL: " + email + "\nMailbox Capacity: " +mailboxCapacity ;

    }


}


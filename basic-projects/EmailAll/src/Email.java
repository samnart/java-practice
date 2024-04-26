import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private int defaultPasswordLength = 15;
    private String password;
    private int mailboxCapacity = 100;
    private String department;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Full name: " + this.firstName + " " + this.lastName);

        // enter department
        this.department = setDepartment();
        System.out.println("Your Department is: " + this.department);

        // generate a random password
        this.password = setRandomPassword(defaultPasswordLength);
        System.out.println("Your new password: " + this.password);

        // generate email
        System.out.println("Your email is: " + this.firstName+"."+this.lastName+"@"+this.department+".company.com");

    }

    public String setDepartment(){
        System.out.print("Enter your department code:\n1 for Sales\n2 for Accounting\n3 for Business\nYour department code is: ");
        Scanner scanner = new Scanner(System.in);
        int dept = scanner.nextInt();
        if (dept == 1) return "Sales";
        else if (dept == 2) return "Accounting";
        else if (dept == 3) return "Business";
        else return "";
    }

    public String setRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890£$%&@#~";
        char[] randomPassword = new char[length];
        for (int i = 0; i < length; i++) {
            int randNum = (int) (Math.random() * passwordSet.length());
            randomPassword[i] = passwordSet.charAt(randNum);
        }
        return new String(randomPassword);
    }

    // set new mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity){
        this.mailboxCapacity = mailboxCapacity;
    }

    // set alternate email
    public void setAlternateEmail(String Alt){
        this.alternateEmail = Alt;
    }

    public void changePassword(String passwordddd){
        this.password = passwordddd;
    }
}

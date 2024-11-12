import java.util.Scanner;
    public class Bank_Account{
        double accountNo;
        String username;
        String email;
        String accountType;
        double accountBalance;
        
  public void getAccountDetails() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Account Number: ");
    this.accountNo = sc.nextDouble();

    System.out.print("Enter User Name: ");
    this.username = sc.nextLine();

    System.out.print("Enter Email: ");
    this.email = sc.nextLine();

    System.out.print("Enter Account Type: ");
    this.accountType = sc.nextLine();

    System.out.print("Enter Initial Account Balance: ");
    this.accountBalance = sc.nextDouble();
}
public void displayAccountDetails() {
    System.out.println("\nAccount Details:");
    System.out.println("Account Number: " + accountNo);
    System.out.println("User Name: " + username);
    System.out.println("Email: " + email);
    System.out.println("Account Type: " + accountType);
    System.out.println("Account Balance: " + accountBalance);
}
public static void main(String[] args) {
    Bank_Account mine = new Bank_Account();
    mine.getAccountDetails();
    mine.displayAccountDetails();
}
}
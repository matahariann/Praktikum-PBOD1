import java.util.Scanner;

public class UserRegistration {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    UserInputValidator.validateUsername(username);

    System.out.print("Enter email address: ");
    String email = scanner.nextLine();
    UserInputValidator.validateEmail(email);

    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    UserInputValidator.validateAge(age);

    System.out.println("User registration successful!");
  }
}

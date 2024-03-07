public class UserInputValidator {
    
    public static void validateUsername(String username) {
        assert username.length() >= 5 : "Username must be at least 5 characters long.";
        assert username.length() <= 20 : "Username must be at most 20 characters long.";
        assert username.matches("[a-zA-Z][a-zA-Z0-9_]+") : "Invalid username.";
    }
  
    public static void validateEmail(String email) {
        assert email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") : "Invalid email.";
    }
  
    public static void validateAge(int age) {
        assert (age < 100 && age > 16) : "Age must be between 17 and 99"; 
    }
}
  
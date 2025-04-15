import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        System.out.print("Enter your first name: ");

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            String firstName = scanner.next();
            if (firstName.isEmpty() || firstName.length() > 20) {
                System.out.println("Invalid input. Please enter a valid name.");
                return;
            }
           
            System.out.println("Name: " + firstName);
           
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input. Please enter the correct data type.");
        } catch (Exception ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}
import java.util.Scanner;

public class Username implements ResponseValidator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the username to be validated");
        String username = s.nextLine();
        Username user = new Username();
        System.out.println(user.isValid(username)); //this error will go away when you successfully complete the
        // required methods
    }

    public boolean isValid(String s) {
        if (ResponseValidator.responseLength(s) == 8 &&
                (ResponseValidator.hasLowerCase(s) || ResponseValidator.hasUpperCase(s)) &&
                !ResponseValidator.hasSpecialCharacters(s))
            return true;
        else
            return false;
    }
}

import java.util.Scanner;

public class Password implements ResponseValidator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the password to be validated:");
        String pw = s.nextLine();
        Password pass = new Password();
        System.out.println(pass.isValid(pw)); //this error will go away when you successfully complete the
        // required methods
    }

    public boolean isValid(String s) {
        if ((ResponseValidator.responseLength(s) <= 20 && ResponseValidator.responseLength(s) >= 8) &&
                ResponseValidator.hasLowerCase(s) && ResponseValidator.hasUpperCase(s) &&
                ResponseValidator.hasSpecialCharacters(s))
            return true;
        else
            return false;
    }
}

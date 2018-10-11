public interface ResponseValidator {

    boolean isValid(String s);

    public static boolean hasUpperCase(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 90 && s.charAt(i) >= 65)
                return true;
        }
        return false;
    }

    public static boolean hasLowerCase(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 122 && s.charAt(i) >= 97)
                return true;
        }
        return false;
    }

    public static boolean hasSpecialCharacters(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) <= 122 && s.charAt(i) >= 97) && !(s.charAt(i) <= 90 && s.charAt(i) >= 65) &&
                    !(s.charAt(i) <= 57 && s.charAt(i) >= 48))
                return true;
        }
        return false;
    }

    public static int responseLength(String s) {
        return s.length();
    }

}

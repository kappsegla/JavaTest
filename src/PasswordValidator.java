public class PasswordValidator {
    public static boolean validatePassword(String s) {
        if( s == null)
        {
            throw new IllegalArgumentException();
        }
        if( s.length() > 5 ) {
            if( !onlyLetters(s) )
               return true;
        }
            return false;
    }

    private static boolean onlyLetters(String s)
    {
        for( int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if( !Character.isLetter(c) )
                return false;
        }
        return true;
    }



}

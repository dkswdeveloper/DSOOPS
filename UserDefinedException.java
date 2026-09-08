class ShortPasswordException extends Exception {
    @Override
    public String getMessage() {
        return "Password lenght should be more than 6";
    }
}
public class UserDefinedException {
    public static void main(String[] args) // throws ShortPasswordException
    {    try {
            String pwd = "hello";
            if (pwd.length() < 6) {
                throw new ShortPasswordException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 0106, Mansi 
import java.util.Scanner;
class MyException extends Exception {
    int errorCode = 0;

    public MyException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
public class PowerString {
    public static double power(int n, int p) throws MyException {
        if (n < 0)
            throw new MyException(-1, "n is zero");
        return Math.pow(n, p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 4^3 = 64
        // -2 ^-2 error
        // 0^0 error
    }
}

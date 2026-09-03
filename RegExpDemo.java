public class RegExpDemo {
    public static void main(String[] args) {
        String string = "23454";
        System.out.println(string.matches("\\d+"));

        System.out.println(string.matches("[0-9]{5}"));
        System.out.println(string.matches("[0-9]+")); // + : one or more
        // "345435".matches("[0-9]+") true 
        System.out.println("abbbbb".matches("ab+"));
        String regex = "ab?"; // a , ab : ? : 0 or one 
        regex = "ab*"; // * : 0 or more a ab abb abbbbb abc 
        regex = "ab{0,}"; // * : 0 or more a ab abb abbbbb abc 
        regex = "[A-Z]{5}[0-9]{4}[A-Z]";
        regex= "A[0-9]{4,10}"; // A0234
        regex = "[A-Z0-9]{3,}@.+\\..+";
        // DINESH@==.COM


        // check if the string contains only digits
        // String pan = "ABCDE1234R";
        // for(int i = 0; i<5; i++) { albhabets ch >= 'A' && ch <= 'Z'}
        // for(int i = 5; i<9; i++) { albhabets ch >= '0' && ch <= '9'}
        // last one is albhabet 


















        String regEx = "\\d+"; // \\d digit [0-9]+
        boolean flag = string.matches(regEx);
        System.out.println(flag);
        regEx = "[a-zA-Z0-9]{3,}@.{1,}\\..{1,}";
        System.out.println("abcde@hello.com".matches(regEx));
        System.out.println("a@hello.com".matches(regEx));
        System.out.println("abchello.com".matches(regEx));
        System.out.println("abc@=.com".matches(regEx));
        String roll= "253445544";
        System.out.println(roll.matches("25\\d+"));
        System.out.println(roll.startsWith("25"));

    }
}

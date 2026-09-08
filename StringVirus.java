public class StringVirus {
    public static void main(String[] args) {
        String str = "absldkfjowieurlskdjffxaycyxxalkjyy";
        boolean foundX = false, foundY = false;
        int posx = -1, posy = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                foundX = true;
                posx = i;
            }
            if (str.charAt(i) == 'y') {
                foundY = true;
                posy = i;
            }
            if (foundX && foundY)
                break;
        }
        if (foundX && foundY) {
            if (posx - posy == 3 || posx - posy == -3)
                System.out.println("strong");
            else
                System.out.println("not strong");
        } else
            System.out.println("Not strong");
    }
}

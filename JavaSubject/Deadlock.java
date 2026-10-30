class Fastag {
}
class Mobile {
}
class MobileRegistration extends Thread {
    Mobile mobile;
    Fastag fastag;

    public MobileRegistration(Mobile mobile, Fastag fastag) {
        this.mobile = mobile;
        this.fastag = fastag;
    }

    public void run() {
        // 2 objects : mobile and fastag
        System.out.println("Mobile Registration started Fastag First ");
        synchronized (fastag) {
            System.out.println("Locked fastag");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            synchronized (mobile) {
                System.out.println("Trying to lock mobile");
                System.out.println("Both locked : registration success");
            }
        }
    }
}
class FastagRegistration extends Thread {
    Mobile mobile;
    Fastag fastag;

    public FastagRegistration(Mobile mobile, Fastag fastag) {
        this.mobile = mobile;
        this.fastag = fastag;
    }

    public void run() {
        // 2 objects : mobile and fastag
        System.out.println("Fastag Registration started Mobile First ");
        synchronized (mobile) {
            System.out.println("Locked mobile");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            synchronized (fastag) {
                System.out.println("Trying to lock fastag");
                System.out.println("Both locked : registration success");
            }
        }
    }
}
public class Deadlock {
    public static void main(String[] args) {
        Fastag fastag = new Fastag();
        Mobile mobile = new Mobile();
        MobileRegistration mobReg = new MobileRegistration(mobile, fastag);
        FastagRegistration fastReg = new FastagRegistration(mobile, fastag);
        mobReg.start();
        fastReg.start();
    }
}

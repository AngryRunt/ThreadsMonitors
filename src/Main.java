public class Main {
    public static void main(String[] args) {
        SecondTH objSec = new SecondTH();
        ThirdTH objTh = new ThirdTH();
        objTh.start();
        objSec.start();
        synchronized (monitor1){
            monitor1.notifyAll();
        }


    }
    final static Object monitor1 = new Object();
}

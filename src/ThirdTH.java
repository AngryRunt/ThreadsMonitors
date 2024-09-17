public class ThirdTH extends Thread {
    @Override
    public void run() {
        for(int i = 0; i <20; i++){
            synchronized (Main.monitor1){
                try {
                    Main.monitor1.wait(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("ThirdTH");
            synchronized (Main.monitor1){
                Main.monitor1.notify();
            }
        }
    }
}

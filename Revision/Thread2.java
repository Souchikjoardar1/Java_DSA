public class Thread2 extends Thread1 {
    @Override
    public void run() {
        while (true)
            try {
                System.out.println("RUNNING");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 t = new Thread1();
        Thread2 t1 = new Thread2();
        t.start();
        t1.start();
        Thread.sleep(100);
        t.join();
        System.out.println(t.getState());
    }
}

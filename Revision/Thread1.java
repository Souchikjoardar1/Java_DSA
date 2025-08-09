public class Thread1 extends Thread {
    @Override
    public void run() {
        while (true)
            try {
                System.out.println(Thread.currentThread().getName() + Thread.currentThread().getState());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

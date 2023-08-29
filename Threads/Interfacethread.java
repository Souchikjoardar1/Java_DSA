package Threads;

//threads using the Runnable interface
class Test implements Runnable {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("hello" + i);
            i++;
        }
    }
}

public class Interfacethread {
    public static void main(String[] args) {
        Test t = new Test();// not a thread but a class implementing the Runnable interface
        Thread th = new Thread(t);// passing the object of the class implementing the Runnable to the thread type
                                  // of object will make it into a thread
        th.start();
        int i = 0;
        while (true) {
            System.out.println("world" + i);
            i++;
        }
    }
}
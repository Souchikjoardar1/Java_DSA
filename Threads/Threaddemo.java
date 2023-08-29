package Threads;

//threads by extending (inheriting) threads class 
class T extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("hello" + i);
            i++;
        }
    }
}

// both hello... and world... will be printed simmultaneously
public class Threaddemo {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        int i = 0;
        while (true) {
            System.out.println("world" + i);
            i++;
        }
    }
}

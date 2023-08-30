package Threads;

//achieving multithreading by using monitors
//in case of monitors in java the objects perform the lock,unlock,wait,notify operations it's a built-in feature
//so we'll make the display which is shared by both thread 1 and 2 as synchronized 
//by making the display() synchronized the method will first execute the ops of one thread then after completing the ops it will notify the other thread that the first thread as executed now it's available for implementing the mutual execution
//even if we have used sleep() in any of the threads still the execution of one thread won't be interrupted during it's sleep time first that thread will be executed completely then only the other threads will get CPU time    
class Mydata {
    synchronized public void display(String str) {// split the characters of a string
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            ;
        }
    }
}

class Mythread1 extends Thread {
    Mydata d;// to access the variables/methods of Mydata class we'll use a reference of that
             // class

    Mythread1(Mydata d) {
        this.d = d;
    }

    public void run() {// overriding the run() method of thread class which will be executed by start()
                       // in the main()
        d.display("welcome");
    }
}

class Mythread2 extends Thread {
    Mydata d;// to access the variables/methods of Mydata class we'll use a reference of that
             // class

    Mythread2(Mydata d) {
        this.d = d;
    }

    public void run() {
        d.display("Hello world");
    }
}

public class Monitors {
    public static void main(String[] args) {
        Mydata d = new Mydata();
        // thread1 will share the same resources with thread2 i.e Mydata d object
        Mythread1 t1 = new Mythread1(d);// the constructor of Mythread() contains a reference to the Mydata class object
        Mythread2 t2 = new Mythread2(d);// the constructor of Mythread() contains a reference to the Mydata class object
        t1.start();// starts the run() present in thread1
        t2.start();// starts the run() present in thread2
    }

}

public class Threads1 {
    public static void main(String[] args) {
        System.out.println("Before_____");
        Thread t = Thread.currentThread();// since currentthread() returns Threads class type so it can stored inside a
                                          // reference of Thread type
        String str = Thread.currentThread().getName();// to display the name of the currentthread() this returns a
                                                      // string type
        int p = Thread.currentThread().getPriority();// get priority returns an integer value from the currentThread()
        System.out.println("the thread for execution of this code is: " + t);
        System.out.println("the name of the thread is: " + str);
        System.out.println("the priority of the thread is: " + p);
        System.out.println("After_______");
        Thread t1 = Thread.currentThread();
        t1.setPriority(10);
        t1.setName("Souchik");
        System.out.println(str);
        System.out.println(p);
    }

}

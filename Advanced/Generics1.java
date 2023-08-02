import java.util.*;

class gen<T> { // my generics class T denotes a type of data
    T obj;

    gen(T obj) {
        this.obj = obj;// 10 as an Integer object is passed
    }

    T getobj() {// getter method
        return obj;
    }

    void display() {
        System.out.println("the java class is " + obj.getClass().getName());
    }
}

public class Generics1 {
    public static void main(String[] args) {
        // create a generic class of my own more concepts implementation
        List<Integer> l = new ArrayList<Integer>();
        // since list and collection are the parent classes of ArrayList
        Collection<Integer> c = new ArrayList<Integer>();
        ArrayList<Object> a = new ArrayList<Object>();
        gen<Integer> g = new gen<Integer>(10);
        g.display();
        System.out.println(g.getobj());// the tostring() method doesnot have an inbuilt printing capability
    }
}

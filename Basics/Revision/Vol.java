class Rectangle {
    int length;
    int breadth;
    int x;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        x = this.length * this.breadth;
    }
}

class Cuboid extends Rectangle {
    int height;

    Cuboid(int length, int breadth, int h) {
        super(length, breadth);
        this.height = h;
        x = super.x * this.height;
    }

    void display() {
        System.out.println("the value of x is=" + super.x);
        System.out.println("the value of x is=" + this.x);
    }

}

public class Vol {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(50, 40);
        Cuboid c = new Cuboid(10, 20, 30);
        c.display();
        System.out.println(
                "value of area in rectangle class is=" + r.x + " " + "the value of volumn in cuboid class is=" + c.x);
    }
}

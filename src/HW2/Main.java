package HW2;

/**
 * Created by Konstantin on 02.04.2018.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Task  №3");
        Point p1 = new Point(1,1);
        Point p2 = new Point(3,3);
        Point p3 = new Point(2,4);

        Shape cr1 = new Circle(p1,p2);
        System.out.println("Circle perimeter: "+cr1.getPerimetr());
        System.out.println("Circle area: "+cr1.getArea());

        System.out.println();


        Shape rect1 = new Rectangle(p1, p2, p3);
        System.out.println("Rectangle perimeter: "+rect1.getPerimetr());
        System.out.println("Rectangle area: "+rect1.getArea());

        System.out.println();

        Shape trngl1 = new Triangle(p1, p2, p3);
        System.out.println("Triangle perimeter: "+trngl1.getPerimetr());
        System.out.println("Triangle area: "+trngl1.getArea());

        System.out.println("\nTask  №4");
        VirtualBoard vb = new VirtualBoard();
        vb.addShape(rect1, 1);
        vb.addShape(cr1, 2);
        vb.dellShape(rect1, 1);
        vb.addShape(trngl1, 3);
        vb.infoShape();

        System.out.println("\nAdd new figure!");
        vb.addShape(rect1, 1);
        vb.infoShape();
    }

}

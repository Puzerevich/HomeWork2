package HW2;

/**
 * Created by Konstantin on 02.04.2018.
 */
public class Circle extends Shape{

    private Point px = new Point();
    private Point py = new Point();

    public Circle() {
    }

    public Circle(Point px, Point py) {
        this.px = px;
        this.py = py;
    }

    public Point getPx() {
        return px;
    }

    public void setPx(Point px) {
        this.px = px;
    }

    public Point getPy() {
        return py;
    }

    public void setPy(Point py) {
        this.py = py;
    }

    @Override
    double getPerimetr() {
        return 2*Math.PI*(py.distPoint(px, py));
    }

    @Override
    double getArea() {
        return Math.PI*(py.distPoint(px,py)*py.distPoint(px, py));
    }
}

package HW2;

/**
 * Created by Konstantin on 02.04.2018.
 */
public class Rectangle extends Shape{

    private Point px = new Point();
    private Point py = new Point();
    private Point pz = new Point();

    public Rectangle() {
    }

    public Rectangle(Point px, Point py, Point pz) {
        this.px = px;
        this.py = py;
        this.pz = pz;
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

    public Point getPz() {
        return pz;
    }

    public void setPz(Point pz) {
        this.pz = pz;
    }

    @Override
    double getPerimetr() {
        return ((getPx().distPoint(px, py) + getPy().distPoint(px, pz))*2);
    }

    @Override
    double getArea() {
        return (getPx().distPoint(px, py)*getPx().distPoint(px, pz));
    }
}
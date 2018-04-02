package HW2;

/**
 * Created by Konstantin on 02.04.2018.
 */
public class Triangle extends Shape {

    private Point px = new Point();
    private Point py = new Point();
    private Point pz = new Point();

    public Triangle() {
    }

    public Triangle(Point px, Point py, Point pz) {
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
        return (getPx().distPoint(px, py) + getPy().distPoint(py, pz) + getPz().distPoint(pz,px));

    }

    @Override
    double getArea() {
        double  halfPerimetr = (getPx().distPoint(px, py) + getPy().distPoint(py, pz) + getPz().distPoint(pz,px))/2;
        return Math.sqrt(halfPerimetr*(halfPerimetr-getPx().distPoint(px, py))*(halfPerimetr-getPy().distPoint(py, pz))*(halfPerimetr-getPz().distPoint(pz, px)));
    }
}

package HW2;

/**
 * Created by Konstantin on 02.04.2018.
 */
public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distPoint(Point point1, Point point2) {
        return Math.sqrt((((point2.getX() - point1.getX()) * (point2.getX() - point1.getX()))
                        + ((point2.getY() - point1.getY()) * (point2.getY() - point1.getY()))));
    }


}

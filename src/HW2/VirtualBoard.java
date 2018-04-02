package HW2;

import java.util.Arrays;

/**
 * Created by Konstantin on 02.04.2018.
 */
public class VirtualBoard {

    private Shape[] shapes = new Shape[4];

    public VirtualBoard() {
    }

    public VirtualBoard(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString() {
        return "VirtualBoard{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }

    public void addShape(Shape shape, int place) {
        if (place>=0 && place<shapes.length) {
            shapes[place] = shape;
        }
        else {
            System.out.println("There is no place on the board");
        }
    }

    public void dellShape(Shape shape, int place) {
        if (place>=0 && place<shapes.length) {
            shapes[place] = null;
        }
        else {
            System.out.println("The figure was deleted");
        }
    }

    public double infoShape() {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                System.out.println(shapes[i].getClass().getSimpleName()+" perimetr: " +shapes[i].getPerimetr()+" and area: "+shapes[i].getArea());
                sum = sum + shapes[i].getArea();
            }
        }
        System.out.println("Summa areas=" + sum);
        return sum;
    }
}

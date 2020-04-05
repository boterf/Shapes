public class Trapezoid extends Shapes{



    double upperSide;
    double downSide;
    double height;

    public Trapezoid(double upperSide, double downSide, double height, String color) {
        super("Трапеция",(upperSide + downSide) * height, color);
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }
    void draw() {
        System.out.println(" Фигура: " + getName() + ", площадь: " + getSquare() + " кв. ед."
                + ", верхняя сторона: " + getUpperSide() + "м."
                + ", нижняя сторона: " + getDownSide() + "м,"
                + " высота " + getHeight() + " ед.,"
                + " цвет: " + getColor());
    }


    public double getUpperSide() {
        return upperSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public double getHeight() {
        return height;
    }

}

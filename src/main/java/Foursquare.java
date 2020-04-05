public class Foursquare extends Shapes {
    private double sideLengt;


    public Foursquare (double Square,String color) {
        super("Квадрат", Square, color);
        this.sideLengt = getSideLength();
    }


    void draw() {
        System.out.println(" Фигура: " + getName() + ", площадь: " + getSquare() + " кв. ед., длина стороны: " +
                getSideLength() + " ед., цвет: " + getColor());
    }

    public double getSideLength() {
        return Math.sqrt(getSquare());
    }
}

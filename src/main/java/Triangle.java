public class Triangle extends Shapes {
    private double hypotenuseLength;
    private double hypotenuse;
    public Triangle(double hypotenuseLength, double hypotenuse, String color) {
        super("Триугольник", hypotenuse * hypotenuseLength * 0.5 , color);
        this.hypotenuseLength = hypotenuseLength;
        this.hypotenuse = hypotenuse;
    }

    void draw() {
        System.out.println(" Фигура: " + getName() + ", площадь: " + getSquare()
                + " кв. ед., гипотенуза: " + getHypotenuse() + " ед., длина гипотенузы: "
                + getHypotenuseLength() + " ед., цвет: " + getColor());
    }

    public double getHypotenuseLength() {
        return hypotenuseLength;
    }
    public double getHypotenuse() {
        return hypotenuseLength;
    }
}

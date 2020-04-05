public class Circle extends Shapes{
    double radius;
    double circumference;

    public Circle (double circumference, String color) {
        super("Круг", Math.PI * Math.pow(circumference / 2 * Math.PI,2), color);
        this.circumference = circumference;
        this.radius = circumference / 2 * Math.PI;


    }

    void draw() {
        System.out.println(" Фигура: " + getName() + ", площадь: " + getSquare() + " кв. ед., радиус: " +
                getRadius() + "м, длина гипотенузы: " + getCircumference() + " ед., цвет: " + getColor());
    }

    public  double getCircumference() {
        return  circumference;
    }
    public double getRadius() {
        return radius;

    }

}

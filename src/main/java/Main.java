public class Main {
    public static void main(String[] args) {
        String [] colors = {
                "Зеленый", "Синий", "Белый",
                "Желтый", "Красный", "Оранжевый"
        };
        int figureNumber = (int) (Math.random() * 10);
        while (figureNumber > 0) {
            int colorNumber = (int) (Math.random() * 6);
            int classNumber = (int) (Math.random() * 5);
            switch (classNumber) {
                case 0:
                    Foursquare foursquare = new Foursquare(5, colors[colorNumber]);
                    foursquare.draw();
                    break;
                case 1:
                    Triangle triangle = new Triangle(5, 2, colors[colorNumber]);
                    triangle.draw();
                    break;
                case 2:
                    Circle circle = new Circle(5, colors[colorNumber]);
                    circle.draw();
                    break;
                case 3:
                    Trapezoid trapezoid = new Trapezoid(5, 2, 3, colors[colorNumber]);
                    trapezoid.draw();
                    break;
            }
            figureNumber--;
        }


    }
}

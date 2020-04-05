    abstract class  Shapes {
    private String color;
    private double Square;
    private String name;
    abstract void draw();

    Shapes (String name, double Square, String color){
        this.color = color;
        this.Square = Square;
        this.name = name;
    }

    public String getColor() {
            return color;
    }

    public double getSquare() {
            return Square;
    }

    public String getName() {
            return name;
    }
}

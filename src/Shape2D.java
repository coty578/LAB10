public abstract class Shape2D {
    protected final double PI = Math.PI;
    protected double height;
    protected double radius;
    protected double width;

    public Shape2D(double height,double width){
        this.height = height;
        this.width = width;
    }
    public Shape2D(double radius){
        this.radius = radius;
    }
    abstract double getArea();
    public abstract String toString(); 
}

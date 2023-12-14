public class Circle extends Shape2D {
    public Circle(double radius){
        super(radius);
        this.radius = radius;
    }
    @Override
   double getArea() {
       return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return " Circle[radius : "+ radius + "]";
    }
}
public class Cone extends Shape3D {
    public Cone(double depth,double radius){
        super(depth, radius);
    }

    @Override
    double getVolume() {
        return (1.0 / 3) * (Math.PI * Math.pow(radius,2) * depth);
    }

    @Override
    double getArea() {
        double baseArea = Math.PI * Math.pow(radius,2);
        double sideArea = Math.PI * radius * Math.sqrt(Math.pow(radius,2) * Math.pow(depth,2));
        return baseArea + sideArea;
    }

    @Override
    public String toString() {
        return " Cone[depth: "+ depth + " radius: "+ radius +"]";
    }

    
}

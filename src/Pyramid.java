public class Pyramid extends Shape3D {
    public Pyramid(int depth,int height,int width){
        super(depth, height, width);
    }

    @Override
    double getVolume() {
       return (1.0 / 3.0) * (width * depth * height);
    }

    @Override
    double getArea() {
        double baseArea = width * depth;
        double sideArea = width * Math.sqrt((depth / 2.0) * (depth / 2.0 ) + Math.pow(height,2));
        return baseArea + sideArea;
    }

    @Override
    public String toString() {
        return "Pyramid[depth: "+ depth + " height: "+ height + " width: "+ width + "]";
    }
}

public class Sphere extends Shape3D {
   

    public Sphere(int depth,double radius){
        super(depth,radius);
    }

    @Override
    double getVolume() {
      return (4 / 3) * (Math.PI * Math.pow(radius, 3));
    }

    @Override
    double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Sphere[depth: "+ depth + " radius: "+ radius + "]";
    }
    
}

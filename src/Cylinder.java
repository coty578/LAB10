public class Cylinder extends Shape3D{

   public Cylinder(double height ,double radius){
    super( height, radius);
   }

@Override
double getVolume() {
    return Math.PI * Math.pow(radius, 2) * depth;
}

@Override
double getArea() {
    return 2 * Math.PI * radius * (radius + depth);
}

@Override
public String toString() {
    return "Cylinder[radius: "+ radius + " depth: "+ depth + "]";
}

}

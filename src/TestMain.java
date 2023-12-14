import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
public class TestMain {
    public static void main(String[] args) {
        // Create a DecimalFormatSymbols object
       DecimalFormatSymbols symbols = new DecimalFormatSymbols();
       // Set a different decimal separator
       symbols.setDecimalSeparator('.');
       //Create a DecimalFormatSymbols object and apply the custom symbols
       DecimalFormat customFormat = new DecimalFormat("#.##",symbols);
        
        Shape2D s1 = new Circle(2);
        Shape2D s2 = new Square(3);
        Shape2D s3 = new Rectangle(2, 4);

        Shape2D[] shape2ds = new Shape2D[]{s1,s2,s3};
        for(Shape2D shape2d :shape2ds){
            System.out.println(shape2d.toString());
            // Format a number using the custom DecimatFormat to reduse the decimal part
            System.out.println(" area :"+ customFormat.format(shape2d.getArea()));
        }

        Shape3D sh1 = new Cylinder(2, 5);
        Shape3D sh2 = new Sphere(2, 2);
        Shape3D sh3 = new Pyramid(6, 5, 4);
        Shape3D sh4 = new Cone(2,5);

        Shape3D[] shape3ds = new Shape3D[]{sh1,sh2,sh3,sh4};
        for(Shape3D shape3d : shape3ds){
            System.out.println(shape3d.toString());
            // Format a number using the custom DecimatFormat to reduse the decimal part
            System.out.println(" volume:"+ customFormat.format(shape3d.getVolume()));// 
            System.out.println(" area:"+ customFormat.format(shape3d.getArea()));
        }
    }
}

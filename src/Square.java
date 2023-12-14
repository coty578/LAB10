public class Square extends Shape2D {
    public Square( double width){
        super(width,width);
    }

    @Override
    double getArea() {
       return width * width;
    }

    @Override
    public String toString() {
        return "Square[width: "+ width + "]";
    }
}

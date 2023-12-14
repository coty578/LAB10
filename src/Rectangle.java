public class Rectangle extends Shape2D{
    public Rectangle(double height,double width){
        super(height, width);
    }

    @Override
    double getArea() {
      return height * width;
    }

    @Override
    public String toString() {
      return "Rectangle[height: "+ height + " width: "+ width + "]";
    }   
}

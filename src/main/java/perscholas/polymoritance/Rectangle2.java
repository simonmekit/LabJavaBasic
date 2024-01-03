package perscholas.polymoritance;

public class Rectangle2 extends AbstractShape{
    public Rectangle2(String color) {
        super.color = color;
    }

    public Rectangle2() {
    }
    public Rectangle2(String color, double width, double height) {
        super.height = height;
        super.width = width;
        super.color = color;
    }
    @Override
    public double getArea() {
        return super.width *  super.height;
    }
    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a Rectangle"  );
    }
    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
    }

}

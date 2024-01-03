package perscholas.polymoritance;

public class Circle3 extends Shape3 implements Movable{
    protected double radius;
    private int x, y;
    private final double PI = Math.PI;

    public Circle3(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle3(double radius){
        this.radius = radius;
    }
    public Circle3(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double getArea(){
        double area = PI * Math.pow(this.radius, 2);
        return area;
    }
    @Override
    public void displayshapeName(){
        System.out.println("Drawing a circle of radiue " + this.radius);
    }
    @Override
    public String toString(){
        return "Circle [radius = " + radius + super.toString() + "]";
    }
    public String getCoordinate(){
        return "(" + x + "," + y + ")";
    }
    @Override
    public void moveUp(){
        y++;
    }
    @Override
    public void moveDown(){
        y--;
    }
    @Override
    public void moveLeft(){
        x--;
    }
    @Override
    public void moveRight(){
        x++;
    }
}

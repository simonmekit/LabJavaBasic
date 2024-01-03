package perscholas.polymoritance;

public class Triangle2 extends AbstractShape{
    public Triangle2(){}

    public Triangle2(String color) {
        super.color = color;
    }
    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public double getArea() {
        return 0.5*super.base * super.height;
    }
    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a TriAngle"  );
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Triangle[base=" + super.base + ",height=" + super.height + "," + super.toString() + "]";
    }

}

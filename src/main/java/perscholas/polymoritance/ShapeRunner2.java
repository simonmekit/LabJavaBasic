package perscholas.polymoritance;

public class ShapeRunner2 {
    public static void main(String[] args) {

        Circle2 c = new Circle2(100);
        System.out.println("Area of Circle " + c.getArea());

        // Shape sObj = new Shape(); // This will give Error, we can not instantiate Abstract class

        // object creation of the Circle class
        System.out.println("+++++++++++++++++");
        // it’s fine because a Circle is a Shape by inheritance
        AbstractShape shapeCircleObj = new Circle2(100);  // UpCasting
        shapeCircleObj.displayshapName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);  // Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Circle2); // true

        System.out.println("+++++++++++++++++");
        AbstractShape shapeRectangleObj = new Rectangle2("Red"); //UpCasting
        shapeRectangleObj.displayshapName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(4);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeRectangleObj instanceof Rectangle2); // true

        System.out.println("--------------------");
        AbstractShape shapeTriangleObj = new Triangle2("Blue"); //UpCasting
        shapeTriangleObj.displayshapName();
        shapeTriangleObj.setHeight(10);
        shapeTriangleObj.setBase(15);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);  // Run Triangle's toString()
    }

}

package training.Lesson2;

/**
 * Created by Gaya on 12/13/14.
 */
public class ShapeExample {
    public static void main(String[] args){
        Shape square =  new Square(2);
        Shape triangle =  new Triangle(6, 4);
        Shape circle =  new Circle(2);
        System.out.println("Area of square: " + square.area() + ", sides: " +square.getSides());
        System.out.println("Area of Triangle: " + triangle.area() + ", sides: " +triangle.getSides());
        System.out.println("Area of Circle: " + circle.area() + ", sides: " +circle.getSides());
        //System.out.println("Square specific: " + square.Display());
    }
}



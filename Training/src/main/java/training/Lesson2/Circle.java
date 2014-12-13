package training.Lesson2;

/**
 * Created by Gaya on 12/13/14.
 */
public class Circle extends Shape{
    private int radius;

    Circle(int radius){
        super(0);
        this.radius = radius;
    }

    double area(){
        return 3.14 * radius * radius;
    }
}

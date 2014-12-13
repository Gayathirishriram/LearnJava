package training.Lesson2;

/**
 * Created by Gaya on 12/13/14.
 */
public class Triangle extends Shape {
    private int base;
    private int height;

    Triangle(int base, int height){
        super(3);
        this.base = base;
        this.height = height;
    }

    double area(){
        return 0.5 * base * height;
    }
}

package training.Lesson2;

/**
 * Created by Gaya on 12/13/14.
 */
public class Square extends Shape {
    private int length;

    Square (int length){
        super(4);
        this.length = length;
    }

    double area(){
        return length * length;
    }

    public String Display(){
       return "I'm specific to square. No one has me";
    }
}

package training.Lesson2;

/**
 * Created by Gaya on 12/13/14.
 */
// Parent class
abstract class Shape {
    private int sides;

    // constructor
    Shape (int sides) {
        this.sides = sides;
    }

    int getSides(){
        return this.sides;
    }

    abstract double area();
}

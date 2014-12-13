package training.Lesson1;

public class Car {
    private String colour;
    private int door;
    private int speed;

    // Constructor
    Car (String color, int door)
    {
        this.colour = color;
        this.door = door;
    }

    // Getter methods - Encapsulation
    public String getColor(){
        return this.colour;
    }

    //Setter Method
    public void setColor(String color){
        this.colour = color;
    }


    public int getDoor() {
        return this.door;
    }

    public void accelerate(){
        // Car is driving
    }

    public void stop(){
        // Car is driving
    }
}
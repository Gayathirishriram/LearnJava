package training.Lesson1;

/**
 * Created by Gaya on 12/13/14.
 */
public class CarExample {
    public static void main(String[] args){
        Car gayaCar = new Car("pink", 2);
        Car balaCar = new Car ("black", 4);
        System.out.println ("Gaya car: Color:" + gayaCar.getColor() + ", Door: " + gayaCar.getDoor());
        System.out.println ("Bala car: Color:" + balaCar.getColor() + ", Door: " + balaCar.getDoor());
    }
}

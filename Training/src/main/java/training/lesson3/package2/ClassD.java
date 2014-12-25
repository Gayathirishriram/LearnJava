package training.lesson3.package2;

import training.lesson3.package1.ClassC;
import training.lesson3.package1.ClassF;

/**
 * Created by Gaya on 12/24/14.
 */
class ClassD extends ClassF{
    ClassC C = new ClassC();

    @Override
    public String display() {
        return "display";
    }
}


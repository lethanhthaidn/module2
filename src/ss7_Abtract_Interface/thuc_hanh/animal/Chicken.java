package ss7_Abtract_Interface.thuc_hanh.animal;

import ss7_Abtract_Interface.thuc_hanh.interface1.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }
}

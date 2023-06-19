package ra.animals;

import ra.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String howtoEat() {
        return "chicken kethua";
    }

    @Override
    public String makeSound() {
        return "Day la chicken";
    }
}

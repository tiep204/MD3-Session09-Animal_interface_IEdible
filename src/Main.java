import ra.animals.Animal;
import ra.animals.Chicken;
import ra.animals.Tiger;
import ra.edible.Edible;
import ra.fruit.Apple;
import ra.fruit.Fruit;
import ra.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal a : animals) {
            System.out.println(a.makeSound());
            if (a instanceof Chicken) {
                Edible edible = (Chicken) a;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit f : fruits) {
            System.out.println(f.howtoEat());
        }
    }
}
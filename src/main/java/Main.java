import doughnut.Doughnut;
import doughnut.DoughnutTypes;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DoughnutFactory factory = new DoughnutFactory();

        Doughnut cherry = factory.getDoughnut(DoughnutTypes.CHERRY);
        Doughnut chocolate = factory.getDoughnut(DoughnutTypes.CHOCOLATE);
        Doughnut almond = factory.getDoughnut(DoughnutTypes.ALMOND);

        cherry.eat();
        chocolate.eat();
        almond.eat();
        for (int i = 0; i < 100; i++) {
            eatRandomDoughnut(factory);
        }
        factory.printCount();

    }

    public static Doughnut getRandomDoughnut(DoughnutFactory factory) {
        Random random = new Random();
        DoughnutTypes type = DoughnutTypes.values()[random.nextInt(DoughnutTypes.values().length)];
        return factory.getDoughnut(type);
    }

    public static void eatRandomDoughnut(DoughnutFactory factory) {
        Doughnut randomDoughnut = getRandomDoughnut(factory);
        System.out.println("Сюрприз!");
        randomDoughnut.eat();
    }

}

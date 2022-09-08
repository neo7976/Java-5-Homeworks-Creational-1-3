import doughnut.*;

public class DoughnutFactory {
    private int cherryDoughnutCount = 0;
    private int almondDoughnutCount = 0;
    private int chocolateDoughnutCount = 0;

    public Doughnut getDoughnut(DoughnutTypes type) {
        Doughnut toReturn = null;
        switch (type) {
            case ALMOND -> {
                toReturn = new AlmondDoughnut();
                almondDoughnutCount++;
            }
            case CHERRY -> {
                toReturn = new CherryDoughnut();
                cherryDoughnutCount++;
            }
            case CHOCOLATE -> {
                toReturn = new ChocolateDoughnut();
                chocolateDoughnutCount++;
            }
            default -> throw new IllegalArgumentException("Ошибочный ввод доната: " + type);
        }
        return toReturn;
    }

    public void printCount() {
        System.out.println("Посчитаем съеденные пончики?");
        System.out.printf("Мы съели пончик с начинкой {%s} в количестве: %10s %3d шт.\n", DoughnutTypes.ALMOND, "", almondDoughnutCount);
        System.out.printf("Мы съели пончик с начинкой {%s} в количестве: %10s %3d шт.\n", DoughnutTypes.CHERRY, "", cherryDoughnutCount);
        System.out.printf("Мы съели пончик с начинкой {%s} в количестве: %7s %3d шт.\n", DoughnutTypes.CHOCOLATE, "", chocolateDoughnutCount);
        System.out.printf("Всего было съедено пончиков: %30s %4d шт.\n", "", almondDoughnutCount + cherryDoughnutCount + chocolateDoughnutCount);
    }
}

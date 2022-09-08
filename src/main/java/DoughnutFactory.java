import doughnut.*;

public class DoughnutFactory {
    public Doughnut getDoughnut(DoughnutTypes type) {
        Doughnut toReturn = null;
        switch (type) {
            case ALMOND -> {
                toReturn = new AlmondDoughnut();
                break;
            }
            case CHERRY -> {
                toReturn = new CherryDoughnut();
                break;
            }
            case CHOCOLATE -> {
                toReturn = new ChocolateDoughnut();
                break;
            }
            default -> throw new IllegalArgumentException("Ошибочный ввод доната: " + type);
        }
        return toReturn;
    }
}

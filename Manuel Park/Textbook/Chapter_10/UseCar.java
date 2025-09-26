package Chapter_10;

public class UseCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.goForward();
        car.goBackward();

        PremiumCar pCar = new PremiumCar();
        pCar.goForward();
        pCar.goBackward();
    }
}

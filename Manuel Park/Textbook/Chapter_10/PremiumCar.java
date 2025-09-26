package Chapter_10;

public class PremiumCar extends Car {
    public String owner = "영희";

    public void goForward() {
        System.out.println("네비게이션 작동");
        super.goForward();
    }

    public void goBackward() {
        System.out.println("후방 모니터 작동");
        super.goBackward();
    }
}
package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
//      상속을 받았기 때문에 부모 클래스의 메소드를 사용할 수 있다.
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
//        electricCar.charge();
//        electricCar.openDoor();
//
        GasCar gasCar = new GasCar();
        gasCar.move();
//        gasCar.fillUp();
//        gasCar.openDoor();
//
//        HydrogenCar hydrogenCar = new HydrogenCar();
//        hydrogenCar.move();
//        hydrogenCar.fillHydrogen();
//        hydrogenCar.openDoor();
    }
}

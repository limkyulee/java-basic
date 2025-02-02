package extends1.ex2;

//   클래스는 하나의 자식이 여러 부모를 상속 받을 수는 없다. > 다중상속이 안됨.
public class GasCar extends Car{

    public void fillUp() {
        System.out.println("GasCar fillUp");
    }
}

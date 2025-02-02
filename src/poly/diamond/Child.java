package poly.diamond;

// 인터페이스 다중 구현 할 수 있다.
public class Child implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        System.out.println("Child methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child methodB");
    }

//    같은 메서드가 있을 경우, 하나만 구현하면 됨.
    @Override
    public void methodCommon() {
        System.out.println("Child methodCommon");
    }
}

package poly.ex6;

// 상속은 하나만 할 수 있고 인터페이스는 무한정 상속받을 수 있어서 상속을 먼저 해야함.
public class Bird extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("Bird sound");
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}

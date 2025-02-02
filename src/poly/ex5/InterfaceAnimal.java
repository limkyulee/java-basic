package poly.ex5;

public interface InterfaceAnimal {
//    인터페이스의 접근제어자는 왜 public 인가? > 여러곳에서 사용할 목적으로 만드는 것이기 떄문이다.
//    인터페이스는 상속이라고 표현하지 않고, 구현이라고 표현함.
    void sound(); // public abstract
    void move(); // public abstract
}

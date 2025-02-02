package poly.ex3;

// 추상 클래스는 직접 인스턴스를 생성하지 못하는 제약이 있다.
public abstract class AbstractAnimal1 {
//    추상 메서드는 작동하지않는 추상적인 메서드 > 실체가 존재하지않고 메서드 바디가 없음.
//    자식 클래스가 반드시 오버라이딩 해야하는 메서드. > 바디 부분을 만들 수 없다.
    public abstract void sound();

//    추상메서드 아님 > 자식에서 상속을 해도되고 안해도됨.
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

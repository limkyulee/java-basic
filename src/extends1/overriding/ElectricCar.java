package extends1.overriding;

public class ElectricCar extends Car {
//  오버라이딩 > 부모의 기능을 자식 클래스에서 재정의
//  > 애노테이션(프로그램이 읽을 수 있는 주석과 같음)을 달아주어야한다.
//  > 없어도됨(하지만 대체로 컴파일 오류를 잡기 위해 무조건 씀)
//   메서드 이름, 파라미터, 반환타입이 같아야한다.
    @Override
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("ElectricCar charge");
    }
}

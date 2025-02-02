package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
//        ctrl + alt + v > 인스턴스 생성 자동완성
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 테스트 종료");

        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 테스트 종료");

        System.out.println("동물소리 테스트 시작");
        cow.sound();
        System.out.println("동물소리 테스트 종료");
// 중복되는 코드의 사용
// > 중복을 원하는 인스턴스의 타입이 다르게 떄문에 배열이나 for 문을 사용할 수 없다. > 다형성이 필요.
    }

}

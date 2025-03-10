package poly.ex5;

import poly.ex2.Animal;

public class InterfaceMan {
    public static void main(String[] args) {
//        인터페이스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal()

        Cat cat = new Cat();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(dog);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

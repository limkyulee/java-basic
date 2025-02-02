package poly.ex6;

import poly.ex2.Animal;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        soundAnimal(dog);
        soundAnimal(bird);

        flyAnimal(bird);
//        flyAnimal(dog); Fly 타입을 찹조하고있지않아 호출할 수 없다.
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly flyl) {
        System.out.println("날기 테스트 시작");
        flyl.fly();
        System.out.println("날기 테스트 종료");
    }
}

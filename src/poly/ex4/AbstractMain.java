package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);
        moveAnimal(dog);
        moveAnimal(cat);
    }

    private static void soundAnimal(AbstractAnimal1 animal){
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal1 animal){
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}


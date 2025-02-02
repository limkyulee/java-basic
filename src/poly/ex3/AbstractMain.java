package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {

//        추상 클래스는 생성을 할 수 없다는 제약이 있다. (아래 코드 불가)
//        AbstractAnimal1 abstractAnimal1 = new AbstractAnimal1();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        soundAnimal(dog);
        soundAnimal(cat);
    }

    private static void soundAnimal(AbstractAnimal1 animal){
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}

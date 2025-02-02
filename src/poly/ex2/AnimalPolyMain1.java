package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        // 다형적 참조를 통한 클래스의 타입을 맞춤.
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

//        Animal dog = new Dog();
//        Animal cat = new Cat();
//        Animal cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound(); // 메소드 오버라이딩이 되어 클래스에서 재정의한 메소드를 실행.
        System.out.println("동물소리 테스트 종료");
    }
}

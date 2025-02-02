package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
//      변경사항이 있을 때 변경 범위를 최소화 할 수 있다.
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

//    ctrl + alt + m > 자동 메소드 추출
    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}

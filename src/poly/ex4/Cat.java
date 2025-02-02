package poly.ex4;

public class Cat extends AbstractAnimal1 {

    @Override
    public void sound(){
        System.out.println("cat sound");
    }

    @Override
    public void move() {
        System.out.println("cat move");
    }
}

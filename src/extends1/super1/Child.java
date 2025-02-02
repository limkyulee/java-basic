package extends1.super1;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this.value >" + value); // 현재 타입에서 찾음
        System.out.println("super.value >" + super.value); // 부모 타입에서 찾읍
    }
}

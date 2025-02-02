package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
//        super(); 매개변수가 없는 기본 생성자의 경우에는 부모 생성자 선언 생략 가능. (자동생성)
        System.out.println("ClassB constructor" + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본생성자 생략 가능.
//      super 는 자식 생성장 안에서 언젠가는 한번은 호출되어야한다.
        System.out.println("ClassB constructor a=" + a + "b=" + b);
    }
}

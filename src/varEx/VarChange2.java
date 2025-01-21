package varEx;

class Data2 {
    int value;
}
// 자바의 [대원칙] : 항상 변수의 값을 복사해서 대입한다. > 메서드 호출에서도 동작한다.
// 메서드를 호출할 떄 사용하는 매개변수(파라미터) 도 결국 변수이기 때문에, 매개변수에 값을 전달하는 것도 값을 복사해서 전달한다.
public class VarChange2 {

    // 여기서 기본형 변수의 값을 파라미터로 전달 받았을 경우에는 변수의 값만 복사되었기 때문에 main 에서 선언한 변수의 값은 영항을 받지않는다.
    // 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달 > 메서드 내부에서 매개변수의 값을 변경해도, 호출자의 변수값에는 영향이 없다.
    public static  void changePrimitive (int a){
        a = 40;
    }

    // 여기서 참조형 변수 > Data2 obj = a 와 동일하다고 보면 됨.
    // 메서드로 참조형 데이터를 전달하면, 찹조갑싱 복사되어 전달 > 메서드 내부에서 매개변수로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
    public static  void changeReference (Data2 obj){
        obj.value = 40;
    }

    public static void main(String[] args) {
        int a = 10; // 호출자
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a);

        Data2 obj = new Data2(); // 호출자
        obj.value = 10;
        System.out.println("오브젝트 메서드 호출 전 :" + obj.value);
        changeReference(obj);
        System.out.println("오브젝트 메서드 호출 후 :" + obj.value);
    }
}

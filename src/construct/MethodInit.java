package construct;

class MInit {
    String name;
    int age;
    int grade;
    String className;

//    void createM (String name, int age, int grade, String cName) {
//        System.out.println("Creating " + name + " " + age + " " + grade);
//        this.name = name;
//        this.age = age;
//        this.grade = grade;
//        className = cName; // 매개변수의 이름과 멤버 변수의 이름이 서로 다름 -> this 가 없어도 멤버 변수에 접근가능.
//    };

//  이렇게 생성자를 직접 만들어 하나라도 있으면, 기본 생성자가 제공되지 않는다.
//  매개변수의 이름과 맴버 변수의 이름이 같은 경우 this 를 사용해서 둘을 명확하게 구분해야한다.
    MInit(String name, int age, int grade, String cName) {
        this.name = name; // this 를 없앨 경우
        this.age = age;
        this.grade = grade;
        className = cName; // 매개변수의 이름과 멤버 변수의 이름이 서로 다름 -> this 가 없어도 멤버 변수에 접근가능.
    }
}
public class MethodInit {
    public static void main(String[] args) {
        //  생성자 등장 전
        //  MInit mInit2 = new MInit();
        //  mInit2.createM("임규리2", 23,3);

        // 생성자 등장 후 (생성자 덕분에 객체를 생성하면서 동시에 생성 직후에 필요한 작업을 한번에 처리할 수 있게 됨.)
        MInit mInit = new MInit("임규리", 21, 1, "휘닉스"); // new 생성자이름 or new 클래스이름
        // (생성자이름이 클래스 이름이기 떄문에 둘 다 맞는 표현)
        MInit mInit1 = new MInit("임규리1", 22, 2, "비발디"); // 직접 정의한 생성자를 필수로 호출해야한다.

        MInit[] mInits = {mInit, mInit1};

        for (MInit c : mInits) {
            System.out.println(c.name + " " + c.age + " " + c.grade + " " + c.className);
        }

    }
}

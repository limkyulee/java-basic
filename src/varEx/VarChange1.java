package varEx;

class Data {
    int value;
}

public class VarChange1 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        dataA.value = 20;
        dataB.value = 30;

        // dataA 와 dataB 는 같은 참조값을 가지게 되고 같은 객체 인스턴스를 참조하고 있다.
        System.out.println("DataA >>>" + dataA.toString());
        System.out.printf("DataB >>>%s\n", dataB.toString());

        // 마지막으로 대입한 변수의 값을 출력함.
        System.out.println("dataA >>>" + dataA.value);
        System.out.println("dataB >>>" + dataB.value);
    }
}

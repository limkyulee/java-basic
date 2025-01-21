package varEx;

class Student {
    int age;
    String name;
}
public class Method1 {
    public static void main(String[] args) {
        Student s1 = initStudent(10, "임규리");
        System.out.println(s1.name + " " + s1.age);

        Student s2 = initStudent(20, "규리규리");
        System.out.println(s2.name + " " + s2.age);
    }

    // 참조값을 메서드 밖으로 반환.
    static Student initStudent(int age, String name){
        Student s = new Student();
        s.age = age;
        s.name = name;

        return s;
    }
}

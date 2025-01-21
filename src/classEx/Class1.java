package classEx;

class Student {
    String name;
    int age;
    int grade;
}

public class Class1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        Student[] students = {student1, student2};
        for (int i = 0; i < students.length; i++) {
            students[i].age = 10 + i;
            students[i].name = "임규리";
            students[i].grade = 90 + i;

            System.out.println("Student >>" + students[i].toString()); // classEx.Student@30f39991 -> @앞은 클래스 정보 @뒤는 16진수 참조값. (각 객체마다 16진수 참조값이 다름)
            System.out.println("Student >>" + students[i].name + "<<" + students[i].grade + "<<" + students[i].age); // >>임규리<<90<<10, >>임규리<<91<<11

        }
    }
}

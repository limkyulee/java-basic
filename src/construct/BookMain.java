package construct;

class Book {
    String title;
    String author;
    int page;

//    생성자는 객체 생성 직후 객체를 초기화 하기 위한 특별한 메서드로 생각할 수 있다.
//    두가지 방식으로 생성자 정의 가능
//    Book() {
//        title = "";
//        author = "";
//        page = 0;
//    }

    Book(){
        this("", "", 0);
    }

    Book(String title, String author){
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.printf("제목: %s, 저자: %s, 페이지: %d%n", title, author, page);
    }
}

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "Kim", 700);
        book3.displayInfo();
    }
}

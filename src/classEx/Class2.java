package classEx;

class MovieReview {
    String title;
    String review;

    // 생성자
    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }
}

// 기본형과 참조형을 쉽게 구분하는 Tip : 기본형은 소문자로 시작하고 클래스(참조형)은 대문자로 시작한다.
// [대원칙] 자바는 항상 변수의 값을 복사해서 사용한다.
// 기본형 변수는 실제 사용하는 값이 변수에 들어있음 -> 해당 값만 복사해서 대입 (a 자체를 b에 대입하는 것이 아님.)
// 참조형 변수는 실제 사용하는 객체가 아니라 해당 객체의 위치를 가리키는 참조값이 복사 -> 객체를 찾아갈 수 있는 변수가 하나 더 생긴것.
public class Class2 {
    public static void main(String[] args) {
//        MovieReview[] movieReviews = new MovieReview[2];
//        MovieReview movieReview = new MovieReview();
//        movieReview.title = "인셉션";
//        movieReview.review = "good";
//        movieReviews[0] = movieReview;
//
//        MovieReview movieReview2 = new MovieReview();
//        movieReview2.title = "어바웃타임";
//        movieReview2.review = "bad";
//        movieReviews[1] = movieReview2;

        // 참조형 : 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입.
        MovieReview[] movieReviews = {
            new MovieReview("인셉션", "좋아요"),
            new MovieReview("어바웃타임", "별로에용")
        };

        for (MovieReview movieReview1 : movieReviews) {
            System.out.println("영화 제목 : " + movieReview1.title + ", 리뷰 : " + movieReview1.review);
        }
    }
}

package exam_class_constructor;

public class Book {
    private String title;
    private String author;

    Book() {
        this("", "");
        // 각 필드의 값이 null이 아닌 빈 문자열
    }

    Book(String title) {
        this(title, "작자미상");
        // 생성자가 다른 생성자를 호출할 때 사용
        System.out.print("매개변수가 하나인 생성자\n");
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.print("매개변수가 2개인 생성자\n");
    }

    public String toString() {
        return "책제목: " + title + ", 작가: " + author;
    }
}

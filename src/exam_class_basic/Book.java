package exam_class_basic;

public class Book {
    String bookNumber;
    String bookName;
    String bookPublisher;
    int bookPrice;

    void bookData(String number, String name, String publisher, int price) {
        bookNumber = number;
        bookName = name;
        bookPublisher = publisher;
        bookPrice = price;
    }

    public String toString() {
        return String.format("책번호: %s, 책이름: %s, 출판사명: %s, 가격: %,d원", bookNumber, bookName, bookPublisher, bookPrice);
    }
}

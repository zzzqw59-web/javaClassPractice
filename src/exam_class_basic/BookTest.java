package exam_class_basic;

public class BookTest {
    static void main(String[] args) {
        Book book1 = new Book();
//        book1.bookNumber = "S000000781116";
//        book1.bookName = "작별하지 않는다.";
//        book1.bookPublisher = "문학동네";
//        book1.bookPrice = 16800;
        book1.bookData("S000000781116", "작별하지 않는다.", "문학동네", 16800);

        String printData = """
                책번호: %s
                책이름: %s
                출판사명: %s
                가격: %d
                """.formatted(book1.bookNumber, book1.bookName, book1.bookPublisher, book1.bookPrice);
        System.out.println(printData);

        Book book2 = new Book();
        book2.bookNumber = "S000000610612";
        book2.bookName = "소년이 온다";
        book2.bookPublisher = "창비";
        book2.bookPrice = 15000;

        System.out.println(book2.toString());
    }
}

package exam_mutator_accessor;

public class BookTest {
    static void main(String[] args) {
        Book book1 = new Book("날개", "이상", 15000);

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPrice());

        book1.setTitle("신곡");
        book1.setAuthor("단테");
        book1.setPrice(20000);

        System.out.println(book1.toString());
    }
}

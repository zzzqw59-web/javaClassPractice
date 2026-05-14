package exam_class_array;

import java.util.Scanner;

public class BookTest {
    public static Scanner input = new Scanner(System.in);
    static void main(String[] args) {
        Book book1 = new Book("날개", 13000);
        System.out.println("책 제목: " + book1.getTitle());
        System.out.println("책 가격: " + book1.getPrice());
        inputData(book1);

    }

    public static void inputData(Book book) {
        System.out.println("책 이름을 입력하시오.");
        String title = input.nextLine();
        System.out.println("책 가격을 입력하시오.");
        int price = input.nextInt();
        input.nextLine();
        System.out.println("책 이름: " + title + ", 책 가격: " + price);
    }
}

package exam_class_array2;

import java.util.Scanner;

public class BookOjbectArray {
    static void main(String[] args) {
        Book[] books = new Book[2];

        // 입력처리
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < books.length; i++) {
            System.out.print("제목 >>");
            String title = input.nextLine();
            System.out.print("저자 >>");
            String author = input.nextLine();

            // 배열 원소 객체 생성
            books[i] = new Book(title, author);
        }

        // 출력처리
//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i].toString());
//        }

        for (Book book : books) {
            System.out.println(book.toString());
        }
        input.close();
    }
}

package exam_class_constructor;

public class BookTest {
    static void main(String[] args) {
        Book littlePrince = new Book("어린 왕자", "생텍쥐페리");
        System.out.println(littlePrince.toString());
        System.out.println();

        Book loveStory = new Book("장화홍련전");
        System.out.println(loveStory.toString());

//        Book test = new Book();
//        System.out.println(test.toString());
    }
}

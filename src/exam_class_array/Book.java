package exam_class_array;

public class Book {
    private String title;
    private int price;

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return String.format("책제목: %s 책가격: %,d원\n", title, price);
    }
}

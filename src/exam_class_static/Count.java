package exam_class_static;

public class Count {
    private static int totalCount;
    private int count;

    // 생성자
    Count() {
        totalCount++;
        count++;
    }

    void display() {
        System.out.println("count: " + count);
        System.out.println("totalCount: " + totalCount);

        System.out.println();
    }
}
package exam_class_array;

public class ArrayMethodExample {
    static void main(String[] args) {
        int[] array;
        array = getData(); // {10 20 30 40 50}
        printData(array);
    }

    private static int[] getData() {
        int[] testData = new int[]{10, 20, 30, 40, 50};
        return testData; // 주소값
    }

    private static void printData(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}

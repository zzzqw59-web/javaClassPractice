package exam_method;

public class CallByValueExample {
    static void main(String[] args) {
        CallByValue cv = new CallByValue();

        int x = 10;
        int y = 20;
        System.out.println("\n호출 전 Main x = " + x + ", y = " + y);

        cv.change(x , y);
        System.out.println("\n호출 후 Main x = " + x + ", y = " + y);
    }
}

class CallByValue {
    public void change(int x, int y) {
        System.out.println("\nBefore Change x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Change x = " + x + ", y = "  + y);
    }
}
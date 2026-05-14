package exam_method;

public class ReferenceValueChangeExample {
    static void main(String[] args) {
        ReferenceValueChagne rv = new ReferenceValueChagne();
        rv.x = 10;
        System.out.println("Main Before Calling x = " + rv.x);

        rv.change(rv);
        System.out.println("\nMain After Calling x = " + rv.x);
    }
}


class ReferenceValueChagne {
    public int x;

    public void change (ReferenceValueChagne rs2) {
        System.out.println("\nBefore change x = " + rs2.x);
        rs2.x = 200;
        System.out.println("\nAfter change x = " + rs2.x);
    }
}
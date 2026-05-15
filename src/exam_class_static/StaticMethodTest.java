package exam_class_static;

import static exam_class_static.StaticMethod.print1;

public class StaticMethodTest {
    static void main(String[] args) {
        StaticMethod.print1();
        print1();

//        StaticMethod.print2();

        StaticMethod method = new StaticMethod();
        method.print2();
    }
}

package exam_class_static;

public class CarStaticMethodTest {
    static void main(String[] args) {
        CarStaticMethod c1 = new CarStaticMethod(90, 1, "blue");
        CarStaticMethod c2 = new CarStaticMethod(50, 0, "while");

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        int number = CarStaticMethod.getNumberOfCars(); // 정적메서드 호출
        System.out.println("지금까지 생성된 차의 수: " + number);
    }
}

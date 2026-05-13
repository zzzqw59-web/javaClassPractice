package exam_class_basic;

public class Car {
    int speed;
    int gear;
    String color;

    void speedUp() {
        speed += 10;
    }

    void speedDown() {
        speed -= 10;
    }

    void printData() {
        // 객체의 상태를 문자열로 출력하는 메서드
        System.out.println("속도: " + speed + ", 기어: " + gear + ", 색상: " + color);
    }

    public String toString() {
        // 객체의 상태를 문자열로 반환하는 메서드
        return "속도: " + speed + ", 기어: " + gear + ", 색상: " + color;
    }
}

package exam_class_basic;

public class CarTest {
    static void main(String[] args) {
        // 클래스명 참조변수 = new 클래스명();
        Car myCar = new Car();

        // 각각의 필드에 값을 설정해주는 방법 - 참조변수명.필드 = 값
//        myCar.speed = 0;
//        myCar.gear = 1;
//        myCar.color = "red";
        myCar.carData(1, 2, "red");

        // 객체의 메서드 호출 - 참조변수명.메서드()
        myCar.speedUp(10);
        myCar.speedDown(10);
        System.out.println(myCar.toString());
        System.out.println();

        Car yourCar = new Car();

        yourCar.speed = 3;
        yourCar.gear = 30;
        yourCar.color = "blue";

        yourCar.speedDown(10);
        yourCar.printData();
        System.out.println(yourCar.toString());
    }
}

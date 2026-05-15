package exam_class_static;

public class StaticMethod {
    private static int num1 = 5; // 정적 변수, 클래스 변수
    private int num2 = 3; // 인스턴스 변수

    // 정적 메서드, 클래스 메서드
    public static void print1() {
        int num3 = num1;
//        int num4 = this.num2; // static 변수는 static 메서드에서만 이용 가능
        System.out.println(num3);
        System.out.println("print1() 호출");
    }
    // 인스턴스 메서드
    public void print2() {
        int num3 = num1;
        int num4 = num2;
        System.out.println(num3 + ", " + num4);
        System.out.println("print2() 호출");
    }

}

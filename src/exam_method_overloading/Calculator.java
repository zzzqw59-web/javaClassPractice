package exam_method_overloading;

public class Calculator {
    /*
    메서드 오버로딩
    - 하나의 클래스 내의 같은 이름의 메서드를 여러개 선언하는 것
    - 하나의 메서드 이름으로 다양한 매개값을 받기 위해 메서드 오버로딩
    - 오버로딩의 조건: 매개변수의 타입, 갯수, 순번 달라야한다.
     */

    public int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    public int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    public int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    public double divine(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }

    public int plus(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    public int plus(int x, int y, int a, int b) {
        int result = x + y + a + b;
        return result;
    }

    public int plus(int x, int y, int a, int b, int c) {
        int result = x + y + a + b + c;
        return result;
    }

    public int plus(int[] numbers) { // int[] numbers = null; (배열의 주솟값)
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int sum(int... values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

}

package exam_class_basic;

public class Employee {
    // 필드 (선언방법: 자료형 변수;)
    String name;
    String phoneNumber;
    int salary;

    // 메서드 (선언 방법: 리턴타입 메서드명 (매개변수...) {...})
    // 필드게 값을 설정하기 위한 메서드
    void employeeData(String eName, String number, int sal) {
        name = eName;
        phoneNumber = number;
        salary = sal;
    }

    // 출력할 문자열 반환 메서드
    public String toString() {
        // return "직원정보 [사원명: " + name + ", 전화번호: " + phoneNumber + ", 급여: = " salary + "]";
        return String.format("직원정보 [사원명: %s, 전화번호: %s, 급여 = %,d]", name, phoneNumber, salary);
    }
}

package exam_class_basic;

public class EmployeeTest {
    static void main(String[] args) {
        Employee employee1 = new Employee();
        // 직접 필드에 값 대입
//        employee.name = "홍길동";
//        employee.phoneNumber = "010 - 2345 - 3476";
//        employee.salary = 1000000;

        // 메서드를 통해 필드에 값 대입
        employee1.employeeData("홍길동", "010 - 2345 - 3476", 1000000);
        System.out.println(employee1.toString());

        Employee employee2 = new Employee();
//        employee2.name = "김철수";
//        employee2.phoneNumber = "010 - 6630 - 2401";
//        employee2.salary = 2000000;

        employee2.employeeData("김철수", "010 - 6630 - 2401", 2000000);
        System.out.println(employee2.toString());


    }
}

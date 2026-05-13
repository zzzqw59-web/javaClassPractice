package exam_class_basic;

public class AddressTest {
    static void main(String[] args) {
        Address address = new Address();
        address.addressData("김철수", "서울", "010-1234-5678");

        address.printData();
        System.out.println(address.toString());
    }
}

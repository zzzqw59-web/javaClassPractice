package exam_class_basic;

public class Address {
    String name;
    String address;
    String phone;

    public void addressData(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void printData() {
        System.out.println("이름: " + name + ", 주소: " + address + ", 연락처: " + phone);
    }

    public String toString() {
        return String.format("이름: %s, 주소: %s, 연락처: %s", name, address, phone);
    }
}

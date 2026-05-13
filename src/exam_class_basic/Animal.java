package exam_class_basic;

public class Animal {
    String name;
    int age;

    Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(String name, int age) {
        return String.format("이름: %s, 나이: %d", name, age);
    }
}

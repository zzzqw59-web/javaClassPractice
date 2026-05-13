package exam_class_basic;

public class Pet {
    String name;
    int age;
    String type;

    Pet (String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    void printPet (String name, int age, String type) {
        System.out.println("이름:" + name + ", 나이: " + age + ", 품종: " + type);
    }

    public String toString (String name, int age, String type) {
        return String.format("이름: %s, 나이: %d, 품종: %s", name, age, type);
    }
}

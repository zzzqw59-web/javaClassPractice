package exam_class;

public class Dog {
    private String name;
    private String breed;
    private int age;

    Dog() {

    }

    Dog(String name, int age) {

    }

    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "나의 반려견[이름: " + name + ", 종류: " + breed + ", 나이: " + age;
    }
}

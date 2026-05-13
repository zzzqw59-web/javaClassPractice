package exam_class_basic;

public class AnimalMain {
    static void main(String[] args) {
        Animal animal = new Animal("팬더", 20);

        System.out.println(animal.toString("팬더", 20));
    }
}

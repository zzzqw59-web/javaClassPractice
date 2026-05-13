package exam_class_basic;

public class PetTest {
    static void main(String[] args) {
        Pet boldog = new Pet("바둑이", 15, "buldog");
        Pet ritriber = new Pet("낑깡이", 20, "ritriber");

        boldog.printPet("바둑이", 15, "buldog");
        ritriber.printPet("낑깡이", 20, "ritriber");

        boldog.toString("바둑이", 15, "buldog");
        ritriber.toString("낑깡이", 20, "ritriber");
    }
}

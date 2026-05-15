package exam_class;

public class DogMain {
    static void main(String[] args) {
        Dog york = new Dog("이쁜이", "요크셔테리어", 1);
        Dog foma = new Dog("잠잠이", "포메라니안", 3);

        System.out.println(york.toString());
        System.out.println(foma.toString());
    }
}

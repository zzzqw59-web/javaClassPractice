package exam_class_basic;
import java.util.Scanner;

public class MovieTest2 {
    public static Scanner input = new Scanner(System.in);
    static void main(String[] args) {
        Movie2 mv2 = new Movie2();
        inputData(mv2);

        Movie2 mv3 = new Movie2();
        inputData(mv3);

        System.out.println("영화 정보는 다음과 같다.");
        System.out.println("====================");
        System.out.println("제목\t\t평점\t\t감독\t\t개봉일");
        System.out.println("====================");
        System.out.println(mv2.toString());
        System.out.println(mv3.toString());

    }

    public static void inputData(Movie2 mv) { // Movie m2 의 참조값
        System.out.print("영화 제목: ");
        mv.title = input.nextLine();

        System.out.print("영화 평점: ");
        mv.rating = input.nextDouble();
        input.nextLine();

        System.out.print("영화 감독: ");
        mv.director = input.nextLine();

        System.out.print("개봉 연도: ");
        mv.releaseYear = input.nextInt();
        input.nextLine();
    }
}

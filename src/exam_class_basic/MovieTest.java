package exam_class_basic;

import java.util.Scanner;

public class MovieTest {
//    static void main(String[] args) {
//        Movie movie1 = new Movie();
//        movie1.title = "폭풍의 언덕";
//        movie1.genre = "로맨스";
//        movie1.movieData("폭풍의 언덕", "로맨스");
//
//        movie1.printMovie("폭풍의 언덕", "로맨스");
//        System.out.println(movie1.toString("폭풍의 언덕", "로맨스"));
//
//        Movie movie2 = new Movie();
//        movie2.movieData("바람과 함께 사라지다", "불륜");
//        movie2.printMovie("바람과 함께 사라지다", "불륜");
//        System.out.println(movie2.toString("바람과 함께 사라지다", "불륜"));
//
//    }
      static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.println("영화 제목과 장르를 입력하시오.");

          Movie movie1 = new Movie();
          movie1.title = input.nextLine();
          movie1.genre = input.nextLine();

          movie1.printMovie(movie1.title, movie1.genre);
      }
}

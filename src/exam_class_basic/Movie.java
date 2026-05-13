package exam_class_basic;

public class Movie {
    String title;
    String genre;

    void movieData(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    void printMovie(String title, String genre) {
        System.out.println("제목: " + title + ", 장르: " + genre);
    }

    public String toString(String title, String genre) {
        return String.format("제목: %s, 장르: %s", title, genre);
    }
}

package exam_class_basic;

public class Movie2 {
    String title;
    double rating;
    String director;
    int releaseYear;

    void moveData(String title, double rating, String director, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return String.format("%s\t %.2f\t %s\t %d", title, rating, director, releaseYear);
    }
}

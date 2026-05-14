package exam_class_basic;

public class ScoreProgram {
    String name;
    int[] subjectScores;

    ScoreProgram (String name, int[] subjectScores) {
        this.name = name;
        this.subjectScores = subjectScores;
    }

    public void printCounter() {
        for (int i = 0 ; i < subjectScores.length; i++) {
            System.out.println(i + 1);
        }
    }

    public int sum () {
        int sum = 0;
        for (int i = 0; i < subjectScores[i]; i++) {
            sum += subjectScores[i];
        }
        return sum;
    }

    public double average () {
        return (double) sum()/ 3;
    }

    public String grade () {
        double avg = average();

        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    public String pass() {
        if (average() >= 60) {
            return "PASS";
        } else {
            return "NOPASS";
        }
    }

}

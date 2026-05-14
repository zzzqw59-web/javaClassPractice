package exam_class_basic;

public class ScoreProgramMain {
    static void main(String[] args) {
        ScoreProgram score1 = new ScoreProgram("홍길동", new int[] {90, 75, 61});
        ScoreProgram score2 = new ScoreProgram("김철수", new int[] {55, 56, 46});
        ScoreProgram score3 = new ScoreProgram("이진희", new int[] {90, 90, 90});

        System.out.println("               성적 프로그램     ");
        System.out.println("============================================");
        System.out.println("번호 이름 국어 영어 수학 총점 평균 학점 재수강 순위");
        System.out.println("============================================");
        score1.printCounter();
        System.out.print(score1.name + score2.name + score3.name);



    }
}

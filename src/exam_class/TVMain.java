package exam_class;

public class TVMain {
    static void main(String[] args) {
        TV samsung = new TV("삼성", 2026, 32);
        TV lg = new TV("LG", 2025, 65);

        samsung.show();
        lg.show();
    }
}

package new_lesson;

public class Main {
    public static void main(String[] args) {
        MercedesBenz mercedesBenz = new MercedesBenz("W140", "black green", 480);
        Bmw bmw = new Bmw("E60","blue", 460);
        mercedesBenz.gas();
        mercedesBenz.brake();
        System.out.println();
        bmw.gas();
        bmw.brake();
    }
}
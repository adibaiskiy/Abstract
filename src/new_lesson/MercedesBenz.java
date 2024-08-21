package new_lesson;

public class MercedesBenz extends Car {
    public MercedesBenz(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("mers  gas");
    }

    @Override
    public void brake() {

        System.out.println("mers brake");
    }

    @Override
    public String toString() {
        return "new_lesson.MercedesBenz{} " + super.toString();
    }
}

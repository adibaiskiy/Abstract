package new_lesson;

public class Bmw extends Car {
    public Bmw(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("bmw gas");
    }

    @Override
    public void brake() {
        System.out.println("bmw brake");
    }

    @Override
    public String toString() {
        return "new_lesson.Bmw{} " + super.toString();
    }
}

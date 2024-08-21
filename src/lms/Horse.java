package lms;

public class Horse extends Animal{
    private String color;


    public Horse(double weight, int age,String color, String gender, String nickName){
        super(weight, age, gender, nickName);
        this.color = color;
    }
}

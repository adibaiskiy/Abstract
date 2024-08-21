package lms;
//Срок сдачи : 21.08.2024 / 18:00

//2 Farm tuzunuz.

//1-Farm: 3 sheep, 5 cows, 2 horses.

//2-Farm 1 sheep, 1 cow, 1 horse bobbler.
public class Main {
    public static void main(String[] args) {




        Cow[] cowsFarm1 ={new Cow(432.4,3,"male", "Xcho"),
                new Cow(124.8,5,"male", "aktosh"),
                new Cow(312.2,2,"female", "laika"),
                new Cow(522.8,4,"male", "nake"),
                new Cow(353.6,7,"male", "Kocho"),
        };
        Horse[] horsesFarm1 = {
                new Horse(850.0, 8, "Brown", "Male", "Spirit"),
                new Horse(750.0, 7, "Black", "Female", "Lenovo")
        };

        Sheep[] sheepFarm1 = {
                new Sheep(70.3, 3, "Female", "Bakabai"),
                new Sheep(65.8, 2, "Female", "fullhd"),
                new Sheep(80.3, 4, "Male", "Ramos")
        };

        Farm farm1 = new Farm("Farm 343 Karakol", cowsFarm1, horsesFarm1, sheepFarm1, "Billbek");


        Cow[] cowsFarm2 = {
                new Cow(490.0, 4, "Female", "Doku")
        };

        Horse[] horsesFarm2 = {
                new Horse(760.0, 6, "White", "Male", "Kashka")
        };

        Sheep[] sheepFarm2 = {
                new Sheep(75.0, 3, "Male", "Google")
        };

        Farm farm2 = new Farm("244 Atakulov Farm", cowsFarm2, horsesFarm2, sheepFarm2, "Januvek Karakulov");

        System.out.println("Farm1 \n" + farm1);
        System.out.println("\nFarm2 \n" + farm2);
    }
}

package student;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<SiViHaui> a = new ArrayList<>();
        SiViHaui siVi1 = new SiViHaui("Khanhs", 20);
        SiViHaui siVi2 = new SiViHaui("An", 19);
        siVi2.gioithieu();

        List<Car> b = new ArrayList<>();
        Car c1 = new Car("CAR01", "30A-12345", "Lamborghini");
        Car c2 = new Car("CAR02", "30A-67890", "Toyota");


    }
}

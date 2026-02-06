package lab3;
import java.util.Arrays;
import java.util.Comparator;

import lab3.Furniture;

public class Main {
    public static void main(String[] args) {
        Furniture[] items = {
            new Furniture("Стіл", "Дуб", 2500.0, 15, "Коричневий"),
            new Furniture("Стілець", "Power and Motivation", 500.0, 3, "Білий"),
            new Furniture("Шафа", "МДФ", 8000.0, 45, "Чорний")
        };

        Arrays.sort(items,Comparator.comparingDouble(Furniture::getPrice));
        linesOut(items);

        System.out.println("Reverse sorted: ");

        Arrays.sort(items,Comparator.comparingDouble(Furniture::getWeight).reversed());
        linesOut(items);
        
    }
    public static void linesOut(Furniture[] items){
        for (Furniture f : items) {
            System.out.println(f);
        }
    }
}

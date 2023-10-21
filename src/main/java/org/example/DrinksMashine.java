package org.example;

import java.util.Objects;
import java.util.Scanner;

public class DrinksMashine {
    public static void main(String[] args) {
        // Создаем разные виды транспортных средств
        HotDrinks car = new Tea("Чай", "250", 100);
        HotDrinks motorcycle = new Coffe("Кофе", "200", 99);

        Scanner in = new Scanner(System.in);
        System.out.print("Введите название напитка: ");
        String nameDrink = in.nextLine();
        in.close();

        if(Objects.equals(nameDrink, "Чай")){
            System.out.println("*Выдает Чай с обьемом " + Tea.volume + " мл и температурой " + Tea.temperature + " градусов* " );
        }
        if(Objects.equals(nameDrink, "Кофе")){
            System.out.println("*Выдает Кофе с обьемом " + Coffe.volume + " мл и температурой " + Coffe.temperature + " градусов* " );
        }
    }
}
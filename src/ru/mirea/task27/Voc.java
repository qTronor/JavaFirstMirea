package ru.mirea.task27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Voc {
    public static void main(String[] args)
    {
        Map<String, String> DATA_BASE = new HashMap<>();

        DATA_BASE.put("Иванов", "Иван");
        DATA_BASE.put("Антонов", "Антон");
        DATA_BASE.put("Кузнецов", "Павел");
        DATA_BASE.put("Волкова", "Виктория");
        DATA_BASE.put("Петров", "Лёня");
        DATA_BASE.put("Попов", "Илья");
        DATA_BASE.put("Макаров", "Лёня");
        DATA_BASE.put("Алексеев", "Павел");
        DATA_BASE.put("Данилов", "Глеб");
        DATA_BASE.put("Николаева", "Алиса");

        System.out.printf("До: %s%n", DATA_BASE);

        HashMap<String, Integer> names = new HashMap<>();
        for (String surname : DATA_BASE.keySet())
        {
            String name = DATA_BASE.get(surname);
            names.put(name, names.getOrDefault(name, 0) + 1);
        }
        Set<String> surnames = new HashSet<String>();
        for (String surname : DATA_BASE.keySet())
            if (names.get(DATA_BASE.get(surname)) > 1)
                surnames.add(surname);
        for (String surname : surnames)
            DATA_BASE.remove(surname);

        System.out.printf("После: %s%n", DATA_BASE);
    }
}

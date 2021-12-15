package ru.mirea.task27;

import java.util.*;

public class City {
    private String town, country;

    public City(String town, String country)
    {
        this.town = town;
        this.country = country;
    }

    public static void main(String[] args)
    {
        City moscow = new City("Moscow", "Russia");
        City newYork = new City("New-York", "USA");
        City london = new City("London", "Great Britain");
        City spb = new City("Saint-Petersburg", "Russia");

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put(moscow.country, new ArrayList<>(Arrays.asList(moscow.town, spb.town)));
        map.put(newYork.country, new ArrayList<>(Collections.singletonList(newYork.town)));
        map.put(london.country, new ArrayList<>(Collections.singletonList(london.town)));

        System.out.println(map);
    }
}

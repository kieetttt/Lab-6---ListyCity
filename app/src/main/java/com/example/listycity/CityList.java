package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects.
 * @author YourName
 * @version 1.0
 */
public class CityList {

    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist.
     * @param city This is a candidate city to add
     * @throws IllegalArgumentException if the city is already in the list
     */
    public void add(City city) {

        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);

    }

    /**
     * This returns a sorted list of cities.
     * @return Return the sorted list
     */
    public List<City> getCities() {

        List<City> list = cities;
        Collections.sort(list);
        return list;

    }

    /**
     * Checks if a city is present in the list.
     * @param city the city to check
     * @return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city) {

        return cities.contains(city);

    }

    /**
     * Deletes a city from the list if it exists.
     * @param city the city to remove
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city) {

        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);

    }

    /**
     * Counts the number of cities currently in the list.
     * @return the total number of cities
     */
    public int countCities() {

        return cities.size();

    }

}
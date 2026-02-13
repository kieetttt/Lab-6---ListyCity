package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 * It keeps track of the city name and the province name.
 * @author YourName
 * @version 1.0
 */
public class City implements Comparable<City> {

    private String city;
    private String province;

    /**
     * Constructs a new City object.
     * @param city The name of the city
     * @param province The name of the province
     */
    City(String city, String province) {

        this.city = city;
        this.province = province;

    }

    /**
     * Gets the name of the city.
     * @return The city name
     */
    String getCityName() {

        return this.city;

    }

    /**
     * Gets the name of the province.
     * @return The province name
     */
    String getProvinceName() {

        return this.province;

    }

    /**
     * Compares this city to another city based on the city name.
     * @param city The other city to compare to
     * @return 0 if equal, a negative integer if this city name comes lexicographically before, or a positive integer if after
     */
    @Override
    public int compareTo(City city) {

        return this.city.compareTo(city.getCityName());

    }

    /**
     * Checks if this city is equal to another object.
     * @param o the object to compare
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);

    }

    /**
     * Generates a hash code for the city.
     * @return the hash code
     */
    @Override
    public int hashCode() {

        return Objects.hash(city, province);

    }

}
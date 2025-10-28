package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City Calgary = new City("Calgary", "AB");
        list.addCity(Calgary);

        assertTrue(list.hasCity(Calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City Calgary = new City("Calgary", "AB");
        list.addCity(Calgary);

        assertTrue(list.hasCity(Calgary));
        list.deleteCity(Calgary);

        assertFalse(list.hasCity(Calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City Calgary = new City("Calgary", "AB");
        list.addCity(Calgary);

        assertEquals(1, list.countCities());

        City Edm = new City("Edmonton", "AB");
        list.addCity(Edm);

        assertEquals(2, list.countCities());

    }
}

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

    public void testDeleteCity() {
        CustomList list = new CustomList();
        City Calgary = new City("Calgary", "AB");
        list.addCity(Calgary);

        assertTrue(list.hasCity(Calgary));
        list.deleteCity(Calgary);

        assertFalse(list.hasCity(Calgary));
    }

}

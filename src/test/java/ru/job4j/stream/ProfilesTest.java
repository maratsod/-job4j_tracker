package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenTestMethodCollect() {
        Address first = new Address("Krasnodar", "Lenina street", 31, 28);
        Address second = new Address("Moscow", "Butyrskaya street", 5, 43);
        Address third = new Address("Moscow", "Butyrskaya street", 5, 43);
        List<Profile> profiles = Arrays.asList(
                new Profile(first),
                new Profile(second),
                new Profile(third)
        );
        List<Address> result = Profiles.collect(profiles);
        List<Address> expected = Arrays.asList(first, second, third);
        assertEquals(expected, result);
    }
}
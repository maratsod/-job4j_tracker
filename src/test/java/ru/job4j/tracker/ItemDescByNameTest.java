package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class ItemDescByNameTest {
    @Test
    public void whenSortByName() {
        List<Item> items = Arrays.asList(
                new Item(4,"Fix bugs"),
                new Item(2,"Impl task"),
                new Item(1, "Reboot server")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(4,"Fix bugs"),
                new Item(2,"Impl task"),
                new Item(1, "Reboot server")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void whenSortDescByName() {
        List<Item> items = Arrays.asList(
                new Item(4,"Fix bugs"),
                new Item(2,"Impl task"),
                new Item(1, "Reboot server")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(1, "Reboot server"),
                new Item(2,"Impl task"),
                new Item(4,"Fix bugs")
        );
        assertThat(items, is(expected));
    }
}
package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    private final ProductManager manager = new ProductManager(new ProductRepository());

    private final Ticket t1 = new Ticket (1, "DME", "LED", 3000, 2);
    private final Ticket t2 = new Ticket (2, "SVO", "EGO", 3500, 3);
    private final Ticket t3 = new Ticket (3, "SVO", "MRN", 3200, 3);
    private final Ticket t4 = new Ticket (3, "SQQ", "SVO", 4000, 4);
    private final Ticket t5 = new Ticket (4, "CSY", "XAS", 3300, 4);
    private final Ticket t6 = new Ticket (5, "SIP", "UEN", 4500, 4);

    @BeforeEach
    void setUp() {
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);
    }
@Test
    public void shouldSortByPrice(){
        Ticket [] expected = new Ticket[] {t1, t3, t5, t2, t4, t6};
        Ticket [] actual = new Ticket[] {t1, t2, t3, t4, t5, t6};
        Arrays.sort (actual);
        assertArrayEquals(expected, actual);
}
    @Test
    public void shouldReturnBy() {
        Ticket[] expected = new Ticket[]{t2, t3, t4};
        Ticket[] actual = manager.searchBy("SVO");
        assertArrayEquals(expected, actual);
    }
}
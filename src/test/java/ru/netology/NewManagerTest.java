package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewManagerTest {
    NewManager manager = new NewManager();

    @Test
    void getAll() {
        Movie movie = new Movie();
        Movie[] actual = manager.getAll();
        Movie[] expexted = new Movie[] {movie};

        assertArrayEquals(expexted, actual);
    }
}





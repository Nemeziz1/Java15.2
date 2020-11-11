package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    void setUp() {
        manager.registered(".pdf", "QA");
        manager.registered(".docx", "Testing");
        manager.registered(".jpg", "Netology");
        manager.registered(".JPG", "Netology");
    }


    @Test
    public void shouldGetName() {
        String expected = "QA";
        String actual = manager.getName(".pdf");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNotLowerCase() {
        String expected = "Netology";
        String actual = manager.getName(".JPG");
        assertEquals(expected, actual);
    }

    @Test
    public void getRegisteredBinding() {
        Collection<String> actual = manager.getRegisteredBinding();
        List<String> expected = Arrays.asList(".docx", ".jpg", ".pdf");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemove() {
        manager.remove(".docx");
        List<String> expected = Arrays.asList(".jpg", ".pdf");
        Collection<String> actual = manager.getRegisteredBinding();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAllBinding() {
        Set<String> actual = manager.getAllBinding();
        Set<String> expected = new HashSet<>();
        expected.add("Netology");
        expected.add("QA");
        expected.add("Testing");
        assertEquals(expected, actual);
    }
}
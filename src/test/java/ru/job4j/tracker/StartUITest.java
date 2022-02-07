package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        Assert.assertEquals(created.getName(), expected.getName());
    }
}
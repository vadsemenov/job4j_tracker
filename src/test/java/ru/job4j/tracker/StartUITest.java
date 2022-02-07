package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction()};
        new StartUI(out).init(in, tracker, actions);
        Assert.assertEquals(out.toString(), "Menu."
                + System.lineSeparator()
                + "0. Exit" + System.lineSeparator());
    }
}
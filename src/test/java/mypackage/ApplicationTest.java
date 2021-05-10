package mypackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTest {



    @Test
    void testToStringWithNull() {
        Application.List<String> stringList = new Application.List<String>();
        Assertions.assertEquals("", stringList.toString());
    }

    @Test
    void testToStringWithOneEl() {
        Application.List<String> stringList = new Application.List<String>();
        stringList.insertAt("11", 0);
        Assertions.assertEquals("11", stringList.toString());
    }


    @Test
    void testInsertTwoElsAtZeroIndex() {
        Application.List<String> stringList = new Application.List<String>();
        stringList.insertAt("11", 0);
        stringList.insertAt("22", 0);
        Assertions.assertEquals("22 11", stringList.toString());
    }

    @Test
    void testInsertIntoMid() {
        Application.List<String> stringList = new Application.List<String>();
        stringList.insertAt("11", 0);
        stringList.insertAt("22", 0);
        stringList.insertAt("x", 1);
        Assertions.assertEquals("22 x 11", stringList.toString());
    }
}
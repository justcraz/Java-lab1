package org.example;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    int[]array = new int[]{-12,3,-47,56};

    public void testMultipl() {
        int expected = 168;
        int actual = Main.Multipl(array);

        assertEquals(expected, actual);
    }

    public void testsumplus() {
        int expected = -56;
        int actual = Main.sumplus(array);
        assertEquals(expected, actual);
    }
}
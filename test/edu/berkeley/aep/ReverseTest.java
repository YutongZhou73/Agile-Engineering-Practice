package edu.berkeley.aep;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReverseTest {
    @Test public void reversedEmptyStringIsAnEmptyString() {
        Reverse inputString = new Reverse("");
        assertEquals(new Reverse(""), inputString.reverse());
    }

    @Test public void reversedOneCharStringIsItself() {
        Reverse inputString = new Reverse("a");
        assertEquals(new Reverse("a"), inputString.reverse());
    }

    @Test public void reversedOneWordStringIsTheReversedWord() {
        Reverse inputString = new Reverse("agile");
        assertEquals(new Reverse("eliga"), inputString.reverse());
    }

    @Test public void reversedSentence() {
        Reverse inputString = new Reverse("agile engineering practice");
        assertEquals(new Reverse("ecitcarp gnireenigne eliga"), inputString.reverse());
    }
}

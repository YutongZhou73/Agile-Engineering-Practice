package edu.berkeley.aep;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class ChanceTest {
    @Test
    public void probabilityOfCoinTossShouldBeEqualToCertainty() {
        Chance coinToss1 = new Chance(0.5);
        Chance certainty1 = new Chance(0.5);
        TestCase.assertEquals(coinToss1, certainty1);
        TestCase.assertFalse(coinToss1.equals(null));
    }

    @Test
    public void probabilityOfCoinTossShouldNotBeEqualToCertainty() {
        Chance coinToss2 = new Chance(0.5);
        Chance certainty2 = new Chance(0.3);
        Assert.assertNotEquals(coinToss2, certainty2);
    }

    @Test
    public void twoChancesWithTheSameValueShouldHaveTheSameHashcode() {
        Chance coinToss1 = new Chance(0.5);
        Chance coinToss2 = new Chance(0.5);
        TestCase.assertEquals(coinToss1.hashCode(), coinToss2.hashCode());
    }

    @Test
    public void testNot() {
        Chance coinToss3 = new Chance(0.4);
        Chance coinToss4 = new Chance(0.6);
        TestCase.assertEquals(coinToss3, coinToss4.not());
    }

    @Test
    public void testAnd() {
        Chance coinToss5 = new Chance(0.4);
        Chance coinToss6 = new Chance(0.3);
        Chance coinToss7 = new Chance(0.12);
        TestCase.assertEquals(coinToss7, coinToss5.and(coinToss6));
    }

    @Test
    public void testOr() {
        Chance coinToss5 = new Chance(0.5);
        Chance coinToss6 = new Chance(0.3);
        Chance coinToss7 = new Chance(0.8 - 0.15);
        TestCase.assertEquals(coinToss7, coinToss5.or(coinToss6));
    }
}

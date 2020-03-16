package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test
    public void twelveInchesShouldEqualOneFoot(){
        assertEquals(new ArithmeticQuantity(1,Unit.FOOT),new ArithmeticQuantity(12,Unit.INCH));
    }

    @Test
    public void threeFeetShouldEqualOneYard(){
        assertEquals(new ArithmeticQuantity(1,Unit.YARD),new ArithmeticQuantity(3,Unit.FOOT));
    }

    @Test
    public void oneYardShouldEqualOneMile(){
        assertEquals(new ArithmeticQuantity(1,Unit.MILE),new ArithmeticQuantity(1760,Unit.YARD));
    }

    // 1 tbsp = 3 tsp, 1oz = 2 tbsp, 8 oz = 1 cup : add 3 tests

    @Test
    public void oneTableSpoonShouldEqualThreeTeaSpoon(){
        assertEquals(new ArithmeticQuantity(3,Unit.TEASPOON),new ArithmeticQuantity(1,Unit.TABLESPOON));
    }

    @Test
    public void oneOzShouldEqualTwoTableSpoon(){
        assertEquals(new ArithmeticQuantity(2,Unit.TABLESPOON),new ArithmeticQuantity(1,Unit.OZ));
    }

    @Test
    public void eightOzShouldEqualOneCup(){
        assertEquals(new ArithmeticQuantity(1,Unit.CUP),new ArithmeticQuantity(8,Unit.OZ));
    }

    // 2 in + 2 in = 4 in; 2 tbsp + 1 oz = 1 tsp
    // add method in Quantity class
    @Test
    public void twoInchAddTwoInchShouldEqualFourInch(){
        assertEquals(new ArithmeticQuantity(4,Unit.INCH),new ArithmeticQuantity(2,Unit.INCH).add(new ArithmeticQuantity(2,Unit.INCH)));
    }

    @Test
    public void twoTableSpoonAddOneOZShouldEqualTwelveTeaSpoon(){
        assertEquals(new ArithmeticQuantity(12,Unit.TEASPOON),new ArithmeticQuantity(2,Unit.TABLESPOON).add(new ArithmeticQuantity(1,Unit.OZ)));
    }

    // catch the same exception thrown in the method
    @Test(expected = IllegalArgumentException.class)
    public void twoTeaSpoonAddOneOZShouldEqualTwelveTeaSpoon(){
        assertEquals(new ArithmeticQuantity(12,Unit.TEASPOON),new ArithmeticQuantity(2,Unit.TABLESPOON).add(new ArithmeticQuantity(1,Unit.INCH)));
    }

    @Test
    public void twoHundredTwelveFahrenheitIsOneHundredCelsius(){
        assertEquals(new ArithmeticQuantity(100, Unit.CELSIUS), new ArithmeticQuantity(212, Unit.FAHRENHEIT));
    }

    @Test
    public void thirtyTwoFahrenheitIsZeroCelsius(){
        assertEquals(new ArithmeticQuantity(0, Unit.CELSIUS), new ArithmeticQuantity(32, Unit.FAHRENHEIT));
    }
}

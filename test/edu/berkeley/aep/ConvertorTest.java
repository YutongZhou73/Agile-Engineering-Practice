package edu.berkeley.aep;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConvertorTest {

    @Test public void check12InchIs1Foot(){
        Convertor inch = new Convertor(12);
        Convertor newVal = new Convertor(1);
        assertEquals(newVal,inch.inchToFoot());
    }

    @Test public void check1FootIs12Inch(){
        Convertor foot = new Convertor(1);
        Convertor newVal = new Convertor(12);
        assertEquals(newVal,foot.footToInch());
    }

    @Test public void check3FeetIs1Yard(){
        Convertor feet = new Convertor(3);
        Convertor newVal = new Convertor(1);
        assertEquals(newVal,feet.footToYard());
    }

    @Test public void check1YardIs3Feet(){
        Convertor yard = new Convertor(1);
        Convertor newVal = new Convertor(3);
        assertEquals(newVal,yard.yardToFoot());
    }

    @Test public void check1760YardIs1Mile(){
        Convertor yard = new Convertor(1760);
        Convertor newVal = new Convertor(1);
        assertEquals(newVal,yard.yardToMile());
    }

    @Test public void check1MileIs1760Yard(){
        Convertor mile = new Convertor(1);
        Convertor newVal = new Convertor(1760);
        assertEquals(newVal,mile.mileToYard());
    }
}

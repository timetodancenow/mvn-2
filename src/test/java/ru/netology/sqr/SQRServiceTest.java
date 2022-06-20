package ru.netology.sqr;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalc () {
        SQRService service = new SQRService ();

        int actual = service.calcSqr ( 200, 300 );

        int expected = 3;

        Assert.assertEquals ( expected, actual );

    }

    @Test
    public void shouldCalculate () {
        SQRService service = new SQRService ();

        int actual = service.calcSqr ( 300, 200 );

        int expected = 0;

        Assert.assertEquals ( expected, actual );

    }

}

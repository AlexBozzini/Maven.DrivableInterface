package Vehicles;

import Driving.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeslaTest {

    Car tesla = new Tesla();

    @Before
    public void setUp() throws Exception {
        this.tesla = new Tesla();
    }

    @Test
    public void needsOilChange() {
        // given
        // when
        Boolean needsOilChange = tesla.needsOilChange();
        // then
        Assert.assertFalse(needsOilChange);
    }

    @Test
    public void checkEngineLight() {
        // given
        // when
        Boolean checkEngineLight = tesla.checkEngineLight();
        // then
        Assert.assertFalse(checkEngineLight);
    }

    @Test
    public void getTopSpeed(){
        // given
        Double expected = 155.0;
        // when
        Double actual = tesla.getTopSpeed();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void transport(){
        // given
        Integer expected = 2 * 60 * 60;
        // when
        Integer actual = tesla.transport(155.0 * 2);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDistanceTraveled(){
        // given
        Double expected = 300.0;
        // when
        tesla.transport(300.0);
        Double actual = tesla.getDistanceTraveled();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDistanceTraveledNewCar(){
        // given
        Double expected = 0.0;
        // when
        Double actual = tesla.getDistanceTraveled();
        // then
        Assert.assertEquals(expected, actual);
    }
}

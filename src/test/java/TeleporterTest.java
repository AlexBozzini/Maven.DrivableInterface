import Driving.Drivable;
import Driving.Teleporter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeleporterTest {

    Drivable teleporter = new Teleporter();

    @Before
    public void setUp() throws Exception {
        this.teleporter = new Teleporter();
    }

    @Test
    public void getTopSpeed() {
        // given
        Double expected = Double.POSITIVE_INFINITY;
        // when
        Double actual = teleporter.getTopSpeed();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void transport() {
        // given
        Integer expected = 0;
        // when
        Integer actual = teleporter.transport(30.0);
        // then
        Assert.assertEquals(expected, actual);
    }
}

package arraysclasses.vehicle;

import com.codingshadows.arraysclasses.vehicle.Bus;
import com.codingshadows.arraysclasses.vehicle.Taxi;
import com.codingshadows.arraysclasses.vehicle.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testDefaultConstructor() {
        Vehicle bus = new Bus();
        assertEquals("Unknown", bus.getColour());
        assertTrue(bus.isFunctional());
    }

    @Test
    public void testParameterizedConstructor() {
        Vehicle taxi = new Taxi("Yellow", true, 3, 10.0);
        assertEquals("Yellow", taxi.getColour());
        assertTrue(taxi.isFunctional());
    }

    @Test
    public void testSettersAndGetters() {
        Vehicle bus = new Bus();
        bus.setColour("Green");
        bus.setFunctional(false);
        assertEquals("Green", bus.getColour());
        assertFalse(bus.isFunctional());
    }

    @Test
    public void testProfitCalculation() {
        Vehicle bus = new Bus("Blue", true, 40, 2.5);
        assertEquals(25.0, bus.profit(), 0.001);

        Vehicle taxi = new Taxi("Yellow", true, 3, 10.0);
        assertEquals(7.5, taxi.profit(), 0.001);
    }

    @Test
    public void testCompareTo() {
        Vehicle bus = new Bus("Blue", true, 40, 2.5);
        Vehicle taxi = new Taxi("Yellow", true, 3, 10.0);
        assertTrue(bus.compareTo(taxi) > 0);
    }
}

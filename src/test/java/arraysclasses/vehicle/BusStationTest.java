package arraysclasses.vehicle;

import com.codingshadows.arraysclasses.vehicle.Bus;
import com.codingshadows.arraysclasses.vehicle.BusStation;
import com.codingshadows.arraysclasses.vehicle.Taxi;
import com.codingshadows.arraysclasses.vehicle.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BusStationTest {

    @Test
    public void testAddVehicle() {
        BusStation station = new BusStation(2);
        Vehicle bus = new Bus("Red", true, 40, 2.5);
        station.addVehicle(bus);
        assertEquals(1, station.getCount());

        Vehicle taxi = new Taxi("Yellow", true, 3, 10.0);
        station.addVehicle(taxi);
        assertEquals(2, station.getCount());

        // Adding vehicle to a full station
        Vehicle anotherBus = new Bus("Blue", true, 30, 3.0);
        station.addVehicle(anotherBus);
        assertEquals(2, station.getCount()); // Count should still be 2
    }

    @Test
    public void testShowTotalProfit() {
        BusStation station = new BusStation(2);
        Vehicle bus = new Bus("Red", true, 40, 2.5);
        Vehicle taxi = new Taxi("Yellow", true, 3, 10.0);

        station.addVehicle(bus);
        station.addVehicle(taxi);

        assertEquals(32.5, station.showTotalProfit(), 0.001);
    }

    @Test
    public void testSortVehicles() {
        BusStation station = new BusStation(2);
        Vehicle bus = new Bus("Red", true, 40, 2.5);
        Vehicle taxi = new Taxi("Yellow", true, 3, 10.0);

        station.addVehicle(bus);
        station.addVehicle(taxi);

        station.sortVehicles();

        Vehicle[] sortedVehicles = station.getVehicles();
        assertEquals(taxi, sortedVehicles[0]);
        assertEquals(bus, sortedVehicles[1]);
    }
}

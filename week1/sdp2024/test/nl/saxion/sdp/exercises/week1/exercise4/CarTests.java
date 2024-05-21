package nl.saxion.sdp.exercises.week1.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTests {
    @Test
    public void NewCar_AfterConstruction_GettersGiveCorrectValues() {
        Car test = new Car("Mercedes", "00-XX-01", 16, 50);
        assertEquals("Mercedes", test.getBrand());
        assertEquals("00-XX-01", test.getNumberPlate());
        assertEquals(16, test.getFuelConsumption());
        assertEquals(50, test.getTankSizeInLitres());
        assertEquals(50, test.getCurrentFuel());
        assertEquals(0, test.getKilometersDriven());
    }

    @Test
    public void createNewCarWithValidLicencePlateGivesNoException() {
        new Car("Mercedes", "00-XX-01", 16, 50);
    }

    @Test
    public void newCarHasFullTank() {
        Car test = new Car("Mercedes", "00-XX-01", 16, 50);
        assertEquals(50, test.getCurrentFuel());
    }

    @Test
    public void carWhenDriving50kmConsumes5LiterOfFuel() {
        Car test = new Car("Mercedes", "00-XX-01", 16, 10);
        test.drive(50);
        assertEquals(45, test.getCurrentFuel());
    }

    @Test
    public void carWithEmptyTankCannotDrive() {
        Car test = new Car("Mercedes", "00-XX-01", 16, 10);
        test.drive(50);
        test.drive(50);
        assertEquals(0, test.getCurrentFuel());
        assertEquals(50, test.getKilometersDriven());
    }
}

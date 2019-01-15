package builderpattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarBuilderTest {
    @Test
    public void testBuilderPattern() {
        Car car = new CarBuilder()
                .setTransmissionType("Automatic")
                .setBrand("Ferrari")
                .createCar();

        assertEquals(car.getSpeed(), "200KM/H");
        assertEquals(car.getTransmissionType(), "Automatic");
        assertEquals(car.getBrand(), "Ferrari");

    }

}
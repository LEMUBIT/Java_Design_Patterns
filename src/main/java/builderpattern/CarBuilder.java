package builderpattern;

public class CarBuilder implements CarBuilderInterface {
    private String speed = "200KM/H";
    private String name = "Toyota";
    private String brand = "Corolla";
    private int cylinderNumber = 4;
    private String numberPlateNumber = "sD#34";
    private String transmissionType = "Manual";

    @Override
    public CarBuilder setSpeed(String speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder setCylinderNumber(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
        return this;
    }

    @Override
    public CarBuilder setNumberPlateNumber(String numberPlateNumber) {
        this.numberPlateNumber = numberPlateNumber;
        return this;
    }

    @Override
    public CarBuilder setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public Car createCar() {
        return new Car(speed, name, brand, cylinderNumber, numberPlateNumber, transmissionType);
    }
}
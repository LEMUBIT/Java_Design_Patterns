package builderpattern;

public interface CarBuilderInterface {
    CarBuilderInterface setSpeed(String speed);

    CarBuilderInterface setName(String name);

    CarBuilderInterface setBrand(String brand);

    CarBuilderInterface setCylinderNumber(int cylinderNumber);

    CarBuilderInterface setNumberPlateNumber(String numberPlateNumber);

    CarBuilderInterface setTransmissionType(String transmissionType);
}

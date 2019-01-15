package builderpattern;

class Car {
    private String speed;
    private String name;
    private String brand;
    private int cylinderNumber;
    private String numberPlateNumber;
    private String transmissionType;

    public Car(String speed, String name, String brand, int cylinderNumber, String numberPlateNumber, String transmissionType) {
        this.speed = speed;
        this.name = name;
        this.brand = brand;
        this.cylinderNumber = cylinderNumber;
        this.numberPlateNumber = numberPlateNumber;
        this.transmissionType = transmissionType;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCylinderNumber() {
        return cylinderNumber;
    }

    public void setCylinderNumber(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
    }

    public String getNumberPlateNumber() {
        return numberPlateNumber;
    }

    public void setNumberPlateNumber(String numberPlateNumber) {
        this.numberPlateNumber = numberPlateNumber;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
}

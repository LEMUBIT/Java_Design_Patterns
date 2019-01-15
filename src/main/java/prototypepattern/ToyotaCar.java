package prototypepattern;

/**
 * Prototype aims at making exact copies of a particular object
 */
public class ToyotaCar implements Cloneable {
    private int year;
    private Brand brand;
    public ToyotaCar() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return (ToyotaCar) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }

    public enum Brand {
        CORROLA,
        AVENSIS,
        AVENU,
        DIABLO
    }
}

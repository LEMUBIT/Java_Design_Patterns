package prototypepattern;

import org.junit.Test;

public class ToyotaCarTest {
    @Test
    public void testClone() throws CloneNotSupportedException {
        ToyotaCar toyotaCar = new ToyotaCar();
        toyotaCar.setBrand(ToyotaCar.Brand.AVENSIS);
        toyotaCar.setYear(2019);

        ToyotaCar toyotaCarCopy = (ToyotaCar) toyotaCar.clone();

        System.out.println("Original car = " + toyotaCar.getYear());
        System.out.println("Clone Car =" + toyotaCarCopy.getYear());
    }

}
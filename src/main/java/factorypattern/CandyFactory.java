package factorypattern;

import java.util.ArrayList;

public class CandyFactory {
    public static Candy getCandy(String type) {
        switch (type) {
            case "chocolate":
                return new Chocolate();
            default:
                return null;
        }
    }

    public static ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}

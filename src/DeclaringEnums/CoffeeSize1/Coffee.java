package DeclaringEnums.CoffeeSize1;

enum CoffeeSize {
    BIG(8), HIGE(10), OVERWHELMING(16);

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOuncess() {
        return ounces;
    }
}

public class Coffee {
    CoffeeSize size;

    public static void main(String[] args) {
        Coffee drink1 = new Coffee();
        drink1.size = CoffeeSize.BIG;

        Coffee drink2 = new Coffee();
        drink2.size = CoffeeSize.OVERWHELMING;

        System.out.println(drink1.size.getOuncess());
        for (CoffeeSize cs : CoffeeSize.values()) {
            System.out.println(cs + " " + cs.getOuncess());
        }
    }
}

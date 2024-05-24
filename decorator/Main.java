package decorator;

public class Main {


    public static void main(String[] args) {


        IceCream iceCream =
                new VanillaScoop(
                    new ChocolateCone(
                        new VanillaScoop(
                            new ChocolateScoop(
                                new OrangeCone()
        ))));

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDesc());

    }
}

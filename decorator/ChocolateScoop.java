package decorator;

public class ChocolateScoop implements IceCream {

    private final IceCream iceCream;

    public ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " Chocolote Scoop";
    }
}

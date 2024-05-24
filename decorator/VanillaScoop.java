package decorator;

public class VanillaScoop implements IceCream{


    private final IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " Vanilla Scoop";
    }
}

package decorator;

public class OrangeCone implements IceCream{

    private final IceCream base;
    // Since it can be base, allow empty initialisation.
    public OrangeCone() {
        base = null;
    }

    // Since it can be an add-on as well.
    public OrangeCone(IceCream iceCream) {
        this.base = iceCream;
    }

    @Override
    public int getCost() {
        int coneCost = 10;
        coneCost += base == null ? 0 : base.getCost();
        return coneCost;
    }

    @Override
    public String getDesc() {
        return base == null ? "Orange Cone" : base.getDesc() + " Orange Cone";
    }
}

package decorator;

public class ChocolateCone implements IceCream{
    private final IceCream base;

    public ChocolateCone(IceCream base) {
        this.base = base;
    }

    public ChocolateCone() {
        base = null;
    }

    @Override
    public int getCost() {
        int coneCost = 15;
        coneCost += base == null ? 0 : base.getCost();
        return coneCost;
    }

    @Override
    public String getDesc() {
        return base == null ? "Chocolate Cone" : base.getDesc() + " Chocolate Cone";
    }
}
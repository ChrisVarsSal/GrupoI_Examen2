package caso2;


public class Tier1 implements ITier {
    private double price = 0.1;
    @Override
    public double calcDebt(int x) {
        return x*price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}

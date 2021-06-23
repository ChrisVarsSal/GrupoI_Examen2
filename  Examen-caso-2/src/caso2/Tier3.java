package caso2;


public class Tier3 implements ITier {
    private double price = 0.05;
    
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

package GrupoI_Examen2_Caso2;

public class Tier2 implements ITier {
    private double price = 0.07;
    
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

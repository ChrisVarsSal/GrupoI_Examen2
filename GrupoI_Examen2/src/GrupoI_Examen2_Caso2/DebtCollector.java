package GrupoI_Examen2_Caso2;


public class DebtCollector {
    double discount = 0.25;
    double surcharge = 0.05;
    
    public double calcDebt(ITier t,int p){
        //retorna el cantPantalla * precio por dispositivo, que depende de la cantidad de dispositivos
        return t.calcDebt(p);
    }
    
    public String makeBill(Client c){
        double debt;
        String s;
        if(c.devices<=5) 
            debt = 0;
        else if(c.devices<=49)
            debt = calcDebt(new Tier1(),c.devices);
        else if(c.devices<=99)
            debt = calcDebt(new Tier2(),c.devices);
        else 
            debt = calcDebt(new Tier3(),c.devices);
        
        s = "Precio por todas las Pantallas"+"("+c.devices+") : "+debt;
       
        if(c.devices > c.prevDevice){
            s+="\nDescuento : "+debt*this.discount;
            debt -= debt*this.discount;
        }
        else if(c.devices < c.prevDevice){
            s+="\nRecargo: "+debt*this.surcharge;
            debt += debt*this.surcharge;
        }
        
        s+= "\nTotal a Pagar : "+debt;
        
        return s;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }
    
    
}

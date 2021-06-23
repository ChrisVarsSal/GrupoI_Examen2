package caso2;


public class Caso2 {
     public static void main(String[] args) {
         Client cliente = new Client("Juan",5);
         DebtCollector dc = new DebtCollector();
         
         System.out.println(dc.makeBill(cliente));
         System.out.print("\n\n");
         
         cliente.setDevices(28);
         System.out.println(dc.makeBill(cliente));
         System.out.print("\n\n");
         
          cliente.setDevices(90);
         System.out.println(dc.makeBill(cliente));
         System.out.print("\n\n");
         
          cliente.setDevices(101);
         System.out.println(dc.makeBill(cliente));
         System.out.print("\n\n");
         
          cliente.setDevices(93);
         System.out.println(dc.makeBill(cliente));
    }
}

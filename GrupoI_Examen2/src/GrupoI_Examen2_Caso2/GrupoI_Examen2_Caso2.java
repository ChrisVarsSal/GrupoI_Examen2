package GrupoI_Examen2_Caso2;

public class GrupoI_Examen2_Caso2 {

    public static void main(String[] args) {
        /*
        MessageSubscriberOne s1= new MessageSubscriberOne();
        MessageSubscriberTwo s2= new MessageSubscriberTwo();
        MessageSubscriberTree s3= new MessageSubscriberTree();
        
        MessagePublisher p= new MessagePublisher();
        p.addReaders(s1);
        p.addReaders(s2);
        
        p.notifyReaders(new Message(" First Message "));
        p.removeReaders(s1);
     
        p.addReaders(s3);
        p.notifyReaders(new Message(" Second Message "));
        **/
        Tier1 s1 = new Tier1();
        Tier2 s2 = new Tier2();
        IObserver s3 = new SubIncreasedScreens(5);

        Screens p = new Screens();
        p.addSusbcriber(s1);
        p.addSusbcriber(s2);
        p.addSusbcriber(s3);
        Client cli = new Client(7);
        System.out.println("Estado en el primer mes" + "\n");
        p.notifySubscriber(cli);
        System.out.println("Estado en el segundo mes" + "\n");
        s3 = new SubTinyScreens(10);
        p.addSusbcriber(s3);
        cli.setNumPantallas(4);

        p.notifySubscriber(cli);
        System.out.println("Estado en el Tercer mes" + "\n");
        s3 = new Tier1();
        p.addSusbcriber(s3);
        System.out.println("Despues de que el cliente retira el servicio" + "\n");
        cli.setNumPantallas(0);
        p.notifySubscriber(cli);
    }

}

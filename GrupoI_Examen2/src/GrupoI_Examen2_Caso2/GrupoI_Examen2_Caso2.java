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
        subscriptorCostoGratuito s1 = new subscriptorCostoGratuito();
        subscriptorDe_6a49_pantallas s2 = new subscriptorDe_6a49_pantallas();
        IObserver s3 = new subscriptor_pantallas_incrementadas(5);

        PublicadorPantallas p = new PublicadorPantallas();
        p.addSusbcriber(s1);
        p.addSusbcriber(s2);
        p.addSusbcriber(s3);
        Cliente cli = new Cliente(7);
        System.out.println("Estado en el primer mes" + "\n");
        p.notifySubscriber(cli);
        System.out.println("Estado en el segundo mes" + "\n");
        s3 = new subscriptor_pantallas_disminuidas(10);
        p.addSusbcriber(s3);
        cli.setNumPantallas(4);

        p.notifySubscriber(cli);
        System.out.println("Estado en el Tercer mes" + "\n");
        s3 = new subscriptorCostoGratuito();
        p.addSusbcriber(s3);
        System.out.println("Despues de que el cliente retira el servicio" + "\n");
        cli.setNumPantallas(0);
        p.notifySubscriber(cli);
    }

}

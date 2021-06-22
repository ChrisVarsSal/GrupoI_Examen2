package GrupoI_Examen2_Caso2;
/*
Patron escogido: Observer
motivo:
Por que no usar otros patrones????
1-al momento de procesar la cantidad de pantallas se podria pensar en utilizar el patron strategy
sin embargo usarlo implicaria saber *apriori* cuantas pantallas tengo, para escoger INTENCIONALMENTE
una estrategia y este punto de escoger intencionalmete la estrategia es lo que vuelve aparte de compicado
el codigo, poco extensible con lo que matamos su manteniblilidad...
pensemos en lo que tendriamos que hacer al aplicar el patron Strategy...
tendriamos que preguntar PARA CADA ESTRATEGIA cual es la cantidad de pantallas, con lo cual para solo un
cliente necesitariamos n cantidad de sentencias if-else para ejectutar el algoritmo apropiado, siendo n
la cantidad de posibles estrategias para calcular el costo final..
con lo que si deseamos agregar una nueva estrategia debemos agregar una nueva sentencia if else a nuestro codigo
con lo cual estariamos rompiendo el principio abierto cerrado...
y esta logica queda cerrada a valores particulares de numero de pantallas..
por ende si el cliente cambia de numero de pantallas necesitamos una logica especializada para esto
donde los cambios con los algoritmos anteriores serian casi minimos llenando nuestro codigo de lineas innecesarias 
si usamos el patron observador, que publica un cliente y cada observador se encarga de darle un monto final 
a pagar al usuario...
y si en el futuro desearamos incluir un descuento, impuesto etc...
podemos simplemente agregar un observador y subscribirlo
dejando nuestro codigo abierto a la  extension promoviendo una mejor mantenibilidad.
*/
public class GrupoI_Examen2_Caso2{

    /**
     * @param args the command line arguments
     */
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
        subscriptorCostoGratuito s1= new subscriptorCostoGratuito();
        subscriptorDe_6a49_pantallas s2 = new subscriptorDe_6a49_pantallas();
        IObserver s3= new subscriptor_pantallas_incrementadas(5);
        
        PublicadorPantallas p= new PublicadorPantallas();
        p.addSusbcriber(s1);
        p.addSusbcriber(s2);
        p.addSusbcriber(s3);
        Cliente cli=new Cliente(7);
        System.out.println("Estado en el primer mes"+"\n");
        p.notifySubscriber(cli);
        
        System.out.println("Estado en el segundo mes"+"\n");
        //SEGUNDO MES
        s3 = new subscriptor_pantallas_disminuidas(10);
          p.addSusbcriber(s3);
          cli.setNumPantallas(4);
  
        p.notifySubscriber(cli);
        
        
        //
        System.out.println("Estado en el Tercer mes"+"\n");
        //SEGUNDO MES
        s3 = new subscriptorCostoGratuito();
          p.addSusbcriber(s3);
           System.out.println("Despues de que el cliente retira el servicio"+"\n");
          cli.setNumPantallas(0);//Retiro el servicio
        p.notifySubscriber(cli);
    }
    
}

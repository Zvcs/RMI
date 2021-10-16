import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor{
    Servidor(){
        try{
            Distancia d = new DistanciaImple();
            String distance = "rmi://localhost/dist";

            LocateRegistry.createRegistry(1099);
            Naming.rebind(distance, d);

            System.out.println("Aguardando valores para calcular distancia");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Servidor();
    }
}
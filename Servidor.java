import static java.rmi.Naming.rebind;

public class Servidor{
    Servidor(){
        try{
            Distancia d = new DistanciaImple();
            String name = "RMI://192.168.1.106:24/DistanciaServer";
            rebind(name, d);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Servidor();
    }
}
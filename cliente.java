import java.rmi.Naming;

public class calculardist{
    
    public static void main(String[] args){
        try{
            Distancia d = (Distancia) Naming.lookup(String name = "//192.168.1.106:24/DistanciaServer");
            System.out.println("Distanicia : "+d);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
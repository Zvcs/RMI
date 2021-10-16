import java.rmi.Naming;
import java.util.Scanner;

public class cliente{
    
    public static void main(String[] args) throws Exception {
    double x1, x2, y1, y2;
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite as coordenadas do primeiro ponto");
    x1 = scan.nextInt();
    y1 = scan.nextInt();
    System.out.print("Digite as coordenadas do segundo ponto");
    x2 = scan.nextInt();
    y2 = scan.nextInt();
        try{
            DistanciaImple d = (DistanciaImple) Naming.lookup("rmi://localhost:1099/dist");
            System.out.println("A distância entre dois pontos é de: " + d.dist(x1, y1, x2, y2));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

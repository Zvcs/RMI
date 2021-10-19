import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class rmi extends UnicastRemoteObject implements Calculadora{
    public rmi() throws RemoteException{
        super();
    }
    public double dist(int x1, int y1, int x2, int y2) throws RemoteException{
        //Se realiza a conta
        double distance;
        int x, y;
        x = x2 - x1;
        y = y2 - y1;
        distance = Math.sqrt(x*x + y*y);
        return  distance;       
        }
}
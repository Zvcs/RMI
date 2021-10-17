import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DistanciaImple extends UnicastRemoteObject implements Distancia{
    protected DistanciaImple() throws RemoteException {
        super();
    }
    public double dist(double x1, double y1, double x2, double y2) throws RemoteException{
    double distance, x, y;
    x = x2 - x1;
    y = y2 - y1;
    distance = Math.sqrt(x*x + y*y);
    return  distance;       
    }
}
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Distancia extends Remote{
    double dist(double x1, double y1, double x2, double y2) throws RemoteException;
}
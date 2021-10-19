import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote{
    public double dist(int x1, int y1, int x2, int y2) throws RemoteException;
}

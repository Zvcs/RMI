import java.rmi.Remote;
import java.rmi.RemoteException;
import java.math;

public interface Distancia extends Remote{
    public long add(long a, long b) throws RemoteException;
}
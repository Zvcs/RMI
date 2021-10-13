import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DistanciaImple extends UnicastRemoteObject implements Distancia{
    protected DistanciaImple () throws RemoteException {
        super();
    }
    public long add(long a, long b) throws RemoteException{
        return a+b;
    }
}
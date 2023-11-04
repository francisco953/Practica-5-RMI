import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicioCalculadora extends Remote {
    String suma(float n1, float n2) throws RemoteException;
    String resta(float n1, float n2) throws RemoteException;
    String multi(float n1, float n2) throws RemoteException;
    String divi(float n1, float n2) throws RemoteException;
}

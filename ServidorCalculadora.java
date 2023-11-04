import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorCalculadora extends UnicastRemoteObject implements ServicioCalculadora{
    public ServidorCalculadora() throws RemoteException {
        super();
    }

    public String suma(float n1,float n2) throws RemoteException {
        float suma;
        suma=n1+n2;
        return "La suma es: " + suma;
    }

    public String resta(float n1,float n2) throws RemoteException {
        float resta;
        resta=n1-n2;
        return "La resta es: " + resta;
    }

    public String multi(float n1,float n2) throws RemoteException {
        float multi;
        multi=n1*n2;
        return "La multiplicacion es: " + multi;
    }

    public String divi(float n1,float n2) throws RemoteException {
        float divi;
        divi=n1/n2;
        return "La division es: " + divi;
    }
}

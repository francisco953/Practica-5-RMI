import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) {
        float n1=Float.valueOf(args[0]);
        float n2=Float.valueOf(args[1]);
        try {
            ServicioCalculadora servicio = (ServicioCalculadora) Naming.lookup("rmi://localhost/ServicioCalculadora");
            String suma = servicio.suma(n1,n2);
            String resta = servicio.resta(n1,n2);
            String multi = servicio.multi(n1,n2);
            String divi = servicio.divi(n1,n2);
            System.out.println(suma);
            System.out.println(resta);
            System.out.println(multi);
            System.out.println(divi);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

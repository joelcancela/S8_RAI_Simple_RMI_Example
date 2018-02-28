package unice.polytech.si4.jcancela.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            ObjetDistant objetDistant = new ObjetDistant();

            String url = "rmi://localhost/Distant";
            System.out.println("Enregistrement de l'objet avec l'url : " + url);
            Naming.rebind(url, objetDistant);

            System.out.println("Serveur lancé");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

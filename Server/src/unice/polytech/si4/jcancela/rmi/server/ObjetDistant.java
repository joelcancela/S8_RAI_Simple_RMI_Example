package unice.polytech.si4.jcancela.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Class x
 *
 * @author Joël CANCELA VAZ
 */
public class ObjetDistant extends UnicastRemoteObject implements Distant {

	public ObjetDistant() throws RemoteException {
	}

	public void echo() throws RemoteException {
		System.out.println("Bonjour je suis Distant");
	}
}

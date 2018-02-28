package unice.polytech.si4.jcancela.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Class x
 *
 * @author Joël CANCELA VAZ
 */
public interface Distant extends Remote {

	void echo() throws RemoteException;

}

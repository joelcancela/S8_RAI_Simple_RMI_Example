package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Class x
 *
 * @author Joël CANCELA VAZ
 */
public interface RMIInterface extends Remote {
	public String echo() throws RemoteException;
}

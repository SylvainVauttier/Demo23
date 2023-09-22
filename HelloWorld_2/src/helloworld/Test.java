package helloworld;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Test extends Remote {
	
	void test() throws RemoteException;

}

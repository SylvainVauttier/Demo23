package helloworld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello,Test  {

	protected HelloImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("ici !");
		return "Hello world";
	}

	@Override
	public void test() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}

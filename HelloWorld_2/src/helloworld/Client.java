package helloworld;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello myComponent;
		try {
			//example of a RMI URL used to retrieve a remote reference 
			Object remote = Naming.lookup("rmi://localhost:1099/Hello");
			myComponent = (Hello) remote;
			System.out.println(myComponent.sayHello());
			Test test = (Test) myComponent;
			test.test();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

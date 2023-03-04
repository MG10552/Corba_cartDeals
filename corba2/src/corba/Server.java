package corba;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Server {

	public static void main(String [] args) throws IOException, InvalidName, CannotProceed, InterruptedException {
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

		CartCreatorServant iccs = new CartCreatorServant();

		try {
		//s_corba2
		org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
		NamingContext ncRef = NamingContextHelper.narrow(objRef);
		NameComponent nc = new NameComponent("Arytmetyka", "");
		NameComponent path[] = {nc};
		ncRef.rebind(path, iccs);
		//E_corba2
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName | NotFound invalidName){
			invalidName.getMessage();
		}
						
		java.lang.Object sync = new java.lang.Object();
		synchronized (sync) { 
			sync.wait();
		}
	}
}

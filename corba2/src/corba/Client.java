package corba;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Client {
	public static void main(String [] args) throws IOException, InvalidName, NotFound, CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName{
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
		try {
		//S_corba2
		org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
		NamingContext ncRef = NamingContextHelper.narrow(objRef);
		NameComponent nc = new NameComponent("Arytmetyka", "");
		NameComponent path[] = {nc};
		//ncRef.rebind(path,as);
		//E_corba2

		ICartCreator cmaker = ICartCreatorHelper.narrow(ncRef.resolve(path));

		IShoppingCart cart = cmaker.shopcart();
		IShoppingCart cart2 = cmaker.shopcart();
		cart.addToCart(new OrderItem(new Product("bread", new Category("food")), 2));
		cart.addToCart(new OrderItem(new Product("jelly bears", new Category("snack")), 20));
		cart.addToCart(new OrderItem(new Product("soap", new Category("hygene")), 5));
		
		cart2.addToCart(new OrderItem(new Product("bepis", new Category("meme")), 9001));
		cart2.addToCart(new OrderItem(new Product("buns", new Category("food")), 3));
		cart2.addToCart(new OrderItem(new Product("beer", new Category("drink")), 12));
		
		System.out.println("Client#1");
		showCartContent(cart.getItems());
		System.out.println("Client#2");
		showCartContent(cart2.getItems());
		
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName | NotFound invalidName){
			invalidName.getMessage();
		}

	}

	private static void showCartContent(OrderItem[] items) {
		System.out.println("Cart content:");
		for(OrderItem o : items){
			System.out.println(o.toString());
		}
	}
}

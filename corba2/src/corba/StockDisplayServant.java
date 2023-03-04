package corba;

import java.util.ArrayList;
import java.util.List;



public class StockDisplayServant extends _IStockDisplayImplBase {

	@Override
	public Product[] giveItems() {
		// TODO Auto-generated method stub
		return null;
	}
//eventually if static pseudo-base for products in necessary
//	List<OrderItem> stockList = new ArrayList<>();
//	
//	@Override
//	public Product[] giveItems() {
//		Resupply();
//	    Product[] giveItems = new Product[this.stockList.size()];
//	    return stockList.toArray(giveItems);
//	}
//	private void Resupply(){
//		this.stockList.add(new OrderItem(new Product("Breado", new Category("food")), 100));
//		this.stockList.add(new OrderItem(new Product("Nuns", new Category("food")), 500));
//		this.stockList.add(new OrderItem(new Product("Bepis", new Category("drink")), 200));
//		this.stockList.add(new OrderItem(new Product("Beerz", new Category("drink")), 100));
//		this.stockList.add(new OrderItem(new Product("Jelly Bears", new Category("snack")), 101));
//	}

}


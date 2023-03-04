package corba;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCartServant extends _IShoppingCartImplBase{

	List<OrderItem> orderItemList = new ArrayList<>();
	
	@Override
	public void addToCart(OrderItem items) {
		this.orderItemList.add(items);
	}

	@Override
	public OrderItem[] getItems() {
	    OrderItem[] orderItems = new OrderItem[this.orderItemList.size()];
	    return this.orderItemList.toArray(orderItems);
	}

	@Override
	public void order() {
		this.orderItemList.clear();	
	}

}
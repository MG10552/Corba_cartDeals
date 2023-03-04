package corba;

public class CartCreatorServant extends _ICartCreatorImplBase{

	@Override
	public IShoppingCart shopcart() {
		
		return new ShoppingCartServant();
	}

}

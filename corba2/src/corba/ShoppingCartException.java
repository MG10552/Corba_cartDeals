package corba;


/**
* corba/ShoppingCartException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cart.idl
* Saturday, 9 June 2018 13:24:38 o'clock BST
*/

public final class ShoppingCartException extends org.omg.CORBA.UserException
{
  public String message = null;

  public ShoppingCartException ()
  {
    super(ShoppingCartExceptionHelper.id());
  } // ctor

  public ShoppingCartException (String _message)
  {
    super(ShoppingCartExceptionHelper.id());
    message = _message;
  } // ctor


  public ShoppingCartException (String $reason, String _message)
  {
    super(ShoppingCartExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class ShoppingCartException

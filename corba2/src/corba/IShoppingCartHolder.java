package corba;

/**
* corba/IShoppingCartHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cart.idl
* Saturday, 9 June 2018 13:24:38 o'clock BST
*/

public final class IShoppingCartHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.IShoppingCart value = null;

  public IShoppingCartHolder ()
  {
  }

  public IShoppingCartHolder (corba.IShoppingCart initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.IShoppingCartHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.IShoppingCartHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.IShoppingCartHelper.type ();
  }

}

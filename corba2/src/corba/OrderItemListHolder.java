package corba;


/**
* corba/OrderItemListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cart.idl
* Saturday, 9 June 2018 13:24:38 o'clock BST
*/

public final class OrderItemListHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.OrderItem value[] = null;

  public OrderItemListHolder ()
  {
  }

  public OrderItemListHolder (corba.OrderItem[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.OrderItemListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.OrderItemListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.OrderItemListHelper.type ();
  }

}

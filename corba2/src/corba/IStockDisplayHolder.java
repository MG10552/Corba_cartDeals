package corba;

/**
* corba/IStockDisplayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cart.idl
* Saturday, 9 June 2018 13:24:38 o'clock BST
*/

public final class IStockDisplayHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.IStockDisplay value = null;

  public IStockDisplayHolder ()
  {
  }

  public IStockDisplayHolder (corba.IStockDisplay initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.IStockDisplayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.IStockDisplayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.IStockDisplayHelper.type ();
  }

}

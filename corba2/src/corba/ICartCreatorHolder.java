package corba;

/**
* corba/ICartCreatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cart.idl
* Saturday, 9 June 2018 13:24:38 o'clock BST
*/

public final class ICartCreatorHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.ICartCreator value = null;

  public ICartCreatorHolder ()
  {
  }

  public ICartCreatorHolder (corba.ICartCreator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.ICartCreatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.ICartCreatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.ICartCreatorHelper.type ();
  }

}

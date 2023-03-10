package corba;


/**
* corba/ICartCreatorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cart.idl
* Saturday, 9 June 2018 13:24:38 o'clock BST
*/

abstract public class ICartCreatorHelper
{
  private static String  _id = "IDL:corba/ICartCreator:1.0";

  public static void insert (org.omg.CORBA.Any a, corba.ICartCreator that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corba.ICartCreator extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (corba.ICartCreatorHelper.id (), "ICartCreator");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corba.ICartCreator read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ICartCreatorStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corba.ICartCreator value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static corba.ICartCreator narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corba.ICartCreator)
      return (corba.ICartCreator)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corba._ICartCreatorStub stub = new corba._ICartCreatorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static corba.ICartCreator unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corba.ICartCreator)
      return (corba.ICartCreator)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corba._ICartCreatorStub stub = new corba._ICartCreatorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}

package corba;


/**
* corba/_IStockDisplayImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cart.idl
* Saturday, 9 June 2018 13:24:38 o'clock BST
*/

public abstract class _IStockDisplayImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements corba.IStockDisplay, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _IStockDisplayImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("giveItems", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // corba/IStockDisplay/giveItems
       {
         corba.Product $result[] = null;
         $result = this.giveItems ();
         out = $rh.createReply();
         corba.ProductsListHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corba/IStockDisplay:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _IStockDisplayImplBase

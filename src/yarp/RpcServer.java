/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class RpcServer extends Contactable {
  private long swigCPtr;

  protected RpcServer(long cPtr, boolean cMemoryOwn) {
    super(yarpJNI.RpcServer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RpcServer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_RpcServer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean open() {
    return yarpJNI.RpcServer_open__SWIG_0_0(swigCPtr, this);
  }

  public boolean open(Contact contact, boolean registerName) {
    return yarpJNI.RpcServer_open__SWIG_0_1(swigCPtr, this, Contact.getCPtr(contact), contact, registerName);
  }

  public boolean open(Contact contact) {
    return yarpJNI.RpcServer_open__SWIG_0_2(swigCPtr, this, Contact.getCPtr(contact), contact);
  }

  public RpcServer() {
    this(yarpJNI.new_RpcServer(), true);
  }

  public boolean open(String name) {
    return yarpJNI.RpcServer_open__SWIG_1(swigCPtr, this, name);
  }

  public boolean addOutput(String name) {
    return yarpJNI.RpcServer_addOutput__SWIG_0(swigCPtr, this, name);
  }

  public boolean addOutput(String name, String carrier) {
    return yarpJNI.RpcServer_addOutput__SWIG_1(swigCPtr, this, name, carrier);
  }

  public boolean addOutput(Contact contact) {
    return yarpJNI.RpcServer_addOutput__SWIG_2(swigCPtr, this, Contact.getCPtr(contact), contact);
  }

  public void close() {
    yarpJNI.RpcServer_close(swigCPtr, this);
  }

  public void interrupt() {
    yarpJNI.RpcServer_interrupt(swigCPtr, this);
  }

  public void resume() {
    yarpJNI.RpcServer_resume(swigCPtr, this);
  }

  public Contact where() {
    return new Contact(yarpJNI.RpcServer_where(swigCPtr, this), true);
  }

  public ConstString getName() {
    return new ConstString(yarpJNI.RpcServer_getName(swigCPtr, this), true);
  }

  public boolean read(PortReader reader, boolean willReply) {
    return yarpJNI.RpcServer_read(swigCPtr, this, PortReader.getCPtr(reader), reader, willReply);
  }

  public boolean reply(PortWriter writer) {
    return yarpJNI.RpcServer_reply(swigCPtr, this, PortWriter.getCPtr(writer), writer);
  }

  public void setReader(PortReader reader) {
    yarpJNI.RpcServer_setReader(swigCPtr, this, PortReader.getCPtr(reader), reader);
  }

  public void setReaderCreator(PortReaderCreator creator) {
    yarpJNI.RpcServer_setReaderCreator(swigCPtr, this, PortReaderCreator.getCPtr(creator), creator);
  }

  public boolean setEnvelope(PortWriter envelope) {
    return yarpJNI.RpcServer_setEnvelope(swigCPtr, this, PortWriter.getCPtr(envelope), envelope);
  }

  public boolean getEnvelope(PortReader envelope) {
    return yarpJNI.RpcServer_getEnvelope(swigCPtr, this, PortReader.getCPtr(envelope), envelope);
  }

  public int getInputCount() {
    return yarpJNI.RpcServer_getInputCount(swigCPtr, this);
  }

  public int getOutputCount() {
    return yarpJNI.RpcServer_getOutputCount(swigCPtr, this);
  }

  public void getReport(PortReport reporter) {
    yarpJNI.RpcServer_getReport(swigCPtr, this, PortReport.getCPtr(reporter), reporter);
  }

  public void setReporter(PortReport reporter) {
    yarpJNI.RpcServer_setReporter(swigCPtr, this, PortReport.getCPtr(reporter), reporter);
  }

  public boolean isWriting() {
    return yarpJNI.RpcServer_isWriting(swigCPtr, this);
  }

}
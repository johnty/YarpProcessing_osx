/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class CartesianEventVariables {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CartesianEventVariables(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CartesianEventVariables obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_CartesianEventVariables(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(ConstString value) {
    yarpJNI.CartesianEventVariables_type_set(swigCPtr, this, ConstString.getCPtr(value), value);
  }

  public ConstString getType() {
    long cPtr = yarpJNI.CartesianEventVariables_type_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ConstString(cPtr, false);
  }

  public void setTime(double value) {
    yarpJNI.CartesianEventVariables_time_set(swigCPtr, this, value);
  }

  public double getTime() {
    return yarpJNI.CartesianEventVariables_time_get(swigCPtr, this);
  }

  public void setMotionOngoingCheckPoint(double value) {
    yarpJNI.CartesianEventVariables_motionOngoingCheckPoint_set(swigCPtr, this, value);
  }

  public double getMotionOngoingCheckPoint() {
    return yarpJNI.CartesianEventVariables_motionOngoingCheckPoint_get(swigCPtr, this);
  }

  public CartesianEventVariables() {
    this(yarpJNI.new_CartesianEventVariables(), true);
  }

}
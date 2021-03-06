/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class IFrameGrabberRgb {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IFrameGrabberRgb(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IFrameGrabberRgb obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_IFrameGrabberRgb(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean getRgbBuffer(SWIGTYPE_p_unsigned_char buffer) {
    return yarpJNI.IFrameGrabberRgb_getRgbBuffer(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(buffer));
  }

  public int height() {
    return yarpJNI.IFrameGrabberRgb_height(swigCPtr, this);
  }

  public int width() {
    return yarpJNI.IFrameGrabberRgb_width(swigCPtr, this);
  }

}

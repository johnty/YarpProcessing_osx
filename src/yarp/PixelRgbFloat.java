/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class PixelRgbFloat {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PixelRgbFloat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PixelRgbFloat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_PixelRgbFloat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setR(float value) {
    yarpJNI.PixelRgbFloat_r_set(swigCPtr, this, value);
  }

  public float getR() {
    return yarpJNI.PixelRgbFloat_r_get(swigCPtr, this);
  }

  public void setG(float value) {
    yarpJNI.PixelRgbFloat_g_set(swigCPtr, this, value);
  }

  public float getG() {
    return yarpJNI.PixelRgbFloat_g_get(swigCPtr, this);
  }

  public void setB(float value) {
    yarpJNI.PixelRgbFloat_b_set(swigCPtr, this, value);
  }

  public float getB() {
    return yarpJNI.PixelRgbFloat_b_get(swigCPtr, this);
  }

  public PixelRgbFloat() {
    this(yarpJNI.new_PixelRgbFloat__SWIG_0(), true);
  }

  public PixelRgbFloat(float n_r, float n_g, float n_b) {
    this(yarpJNI.new_PixelRgbFloat__SWIG_1(n_r, n_g, n_b), true);
  }

}

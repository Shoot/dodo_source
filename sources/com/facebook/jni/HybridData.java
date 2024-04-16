package com.facebook.jni;

import com.facebook.jni.DestructorThread;
import com.facebook.jni.annotations.DoNotStrip;
@DoNotStrip
/* loaded from: classes2.dex */
public class HybridData {
    @DoNotStrip
    private Destructor mDestructor = new Destructor(this);

    /* loaded from: classes2.dex */
    public static class Destructor extends DestructorThread.Destructor {
        @DoNotStrip
        private volatile long mNativePointer;

        Destructor(Object obj) {
            super(obj);
        }

        static native void deleteNative(long j);

        @Override // com.facebook.jni.DestructorThread.Destructor
        protected final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }

    static {
        ju6.a("fbjni");
    }

    public boolean isValid() {
        if (this.mDestructor.mNativePointer != 0) {
            return true;
        }
        return false;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}

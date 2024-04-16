package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
@DoNotStrip
/* loaded from: classes2.dex */
public class ThreadScopeSupport {
    static {
        ju6.a("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}

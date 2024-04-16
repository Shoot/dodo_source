package defpackage;

import defpackage.tmb;
import java.lang.ref.SoftReference;
/* compiled from: BufferRecyclers.java */
/* renamed from: bh0  reason: default package */
/* loaded from: classes2.dex */
public class bh0 {
    private static final xdb a;
    protected static final ThreadLocal<SoftReference<ah0>> b;

    static {
        xdb xdbVar;
        if (tmb.h.TRUE_JSON_NAME.equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"))) {
            xdbVar = xdb.a();
            a = xdbVar;
            b = new ThreadLocal<>();
        }
        xdbVar = null;
        a = xdbVar;
        b = new ThreadLocal<>();
    }

    public static ah0 a() {
        ah0 ah0Var;
        SoftReference<ah0> softReference;
        ThreadLocal<SoftReference<ah0>> threadLocal = b;
        SoftReference<ah0> softReference2 = threadLocal.get();
        if (softReference2 == null) {
            ah0Var = null;
        } else {
            ah0Var = softReference2.get();
        }
        if (ah0Var == null) {
            ah0Var = new ah0();
            xdb xdbVar = a;
            if (xdbVar != null) {
                softReference = xdbVar.c(ah0Var);
            } else {
                softReference = new SoftReference<>(ah0Var);
            }
            threadLocal.set(softReference);
        }
        return ah0Var;
    }
}

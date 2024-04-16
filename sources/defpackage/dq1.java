package defpackage;
/* compiled from: Configuration.java */
/* renamed from: dq1  reason: default package */
/* loaded from: classes3.dex */
public class dq1 {
    private static ir4 a;

    public static synchronized ir4 a() {
        ir4 ir4Var;
        synchronized (dq1.class) {
            try {
                if (a == null) {
                    a = new lp2();
                }
                ir4Var = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ir4Var;
    }
}

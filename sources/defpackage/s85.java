package defpackage;
/* compiled from: Java7Handlers.java */
/* renamed from: s85  reason: default package */
/* loaded from: classes2.dex */
public abstract class s85 {
    private static final s85 a;

    static {
        s85 s85Var;
        try {
            s85Var = (s85) q81.k(u85.class, false);
        } catch (Throwable unused) {
            s85Var = null;
        }
        a = s85Var;
    }

    public static s85 b() {
        return a;
    }

    public abstract gc5<?> a(Class<?> cls);
}

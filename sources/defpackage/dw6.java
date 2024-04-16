package defpackage;
/* compiled from: NetworkPolicy.java */
/* renamed from: dw6  reason: default package */
/* loaded from: classes3.dex */
public enum dw6 {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int a;

    dw6(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        if ((i & OFFLINE.a) != 0) {
            return true;
        }
        return false;
    }

    public static boolean i(int i) {
        if ((i & NO_CACHE.a) == 0) {
            return true;
        }
        return false;
    }

    public static boolean k(int i) {
        if ((i & NO_STORE.a) == 0) {
            return true;
        }
        return false;
    }
}

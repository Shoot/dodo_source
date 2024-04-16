package defpackage;
/* compiled from: MemoryPolicy.java */
/* renamed from: zc6  reason: default package */
/* loaded from: classes3.dex */
public enum zc6 {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int a;

    zc6(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(int i) {
        if ((i & NO_CACHE.a) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(int i) {
        if ((i & NO_STORE.a) == 0) {
            return true;
        }
        return false;
    }
}

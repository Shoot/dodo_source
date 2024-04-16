package androidx.datastore.preferences.protobuf;
/* compiled from: Android.java */
/* loaded from: classes.dex */
final class d {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b;

    static {
        boolean z;
        if (a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        b = z;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        if (a != null && !b) {
            return true;
        }
        return false;
    }
}

package androidx.datastore.preferences.protobuf;
/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes.dex */
final class m {
    static final Class<?> a = c();

    public static n a() {
        if (a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return n.e;
    }

    private static final n b(String str) throws Exception {
        return (n) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

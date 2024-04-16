package androidx.datastore.preferences.protobuf;
/* compiled from: MapFieldSchemas.java */
/* loaded from: classes.dex */
final class i0 {
    private static final g0 a = c();
    private static final g0 b = new h0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 b() {
        return b;
    }

    private static g0 c() {
        try {
            return (g0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

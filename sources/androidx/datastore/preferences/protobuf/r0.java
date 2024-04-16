package androidx.datastore.preferences.protobuf;
/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes.dex */
final class r0 {
    private static final p0 a = c();
    private static final p0 b = new q0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p0 b() {
        return b;
    }

    private static p0 c() {
        try {
            return (p0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

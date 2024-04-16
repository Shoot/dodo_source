package androidx.datastore.preferences.protobuf;
/* compiled from: ExtensionSchemas.java */
/* loaded from: classes.dex */
final class q {
    private static final o<?> a = new p();
    private static final o<?> b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o<?> a() {
        o<?> oVar = b;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o<?> b() {
        return a;
    }

    private static o<?> c() {
        try {
            return (o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.google.protobuf;
/* compiled from: ExtensionSchemas.java */
/* loaded from: classes.dex */
final class p {
    private static final n<?> a = new o();
    private static final n<?> b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n<?> a() {
        n<?> nVar = b;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n<?> b() {
        return a;
    }

    private static n<?> c() {
        try {
            return (n) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

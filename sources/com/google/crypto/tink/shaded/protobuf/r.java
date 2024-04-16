package com.google.crypto.tink.shaded.protobuf;
/* compiled from: ExtensionSchemas.java */
/* loaded from: classes2.dex */
final class r {
    private static final p<?> a = new q();
    private static final p<?> b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p<?> a() {
        p<?> pVar = b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p<?> b() {
        return a;
    }

    private static p<?> c() {
        try {
            return (p) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

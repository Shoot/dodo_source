package com.google.crypto.tink.shaded.protobuf;
/* compiled from: MapFieldSchemas.java */
/* loaded from: classes2.dex */
final class j0 {
    private static final h0 a = c();
    private static final h0 b = new i0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h0 b() {
        return b;
    }

    private static h0 c() {
        try {
            return (h0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

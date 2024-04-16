package com.google.protobuf;
/* compiled from: MapFieldSchemas.java */
/* loaded from: classes.dex */
final class h0 {
    private static final f0 a = c();
    private static final f0 b = new g0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f0 b() {
        return b;
    }

    private static f0 c() {
        try {
            return (f0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

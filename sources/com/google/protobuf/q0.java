package com.google.protobuf;
/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes.dex */
final class q0 {
    private static final o0 a = c();
    private static final o0 b = new p0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0 b() {
        return b;
    }

    private static o0 c() {
        try {
            return (o0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

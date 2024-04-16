package com.google.crypto.tink.shaded.protobuf;
/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes2.dex */
final class s0 {
    private static final q0 a = c();
    private static final q0 b = new r0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q0 b() {
        return b;
    }

    private static q0 c() {
        try {
            return (q0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

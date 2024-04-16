package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class u1 {
    private static final t1<?> a = new v1();
    private static final t1<?> b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t1<?> a() {
        t1<?> t1Var = b;
        if (t1Var != null) {
            return t1Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t1<?> b() {
        return a;
    }

    private static t1<?> c() {
        try {
            return (t1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

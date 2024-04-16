package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class d3 {
    private static final c3 a = c();
    private static final c3 b = new e3();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c3 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c3 b() {
        return b;
    }

    private static c3 c() {
        try {
            return (c3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

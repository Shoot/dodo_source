package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class x2 {
    private static final v2 a = c();
    private static final v2 b = new u2();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v2 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v2 b() {
        return b;
    }

    private static v2 c() {
        try {
            return (v2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.google.crypto.tink.shaded.protobuf;
/* compiled from: Android.java */
/* loaded from: classes2.dex */
final class d {
    private static boolean a;
    private static final Class<?> b = a("libcore.io.Memory");
    private static final boolean c;

    static {
        boolean z;
        if (!a && a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        c = z;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        if (!a && (b == null || c)) {
            return false;
        }
        return true;
    }
}

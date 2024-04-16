package com.google.crypto.tink.shaded.protobuf;
/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes2.dex */
final class n {
    static final Class<?> a = c();

    public static o a() {
        o b = b("getEmptyRegistry");
        if (b == null) {
            return o.d;
        }
        return b;
    }

    private static final o b(String str) {
        Class<?> cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (o) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

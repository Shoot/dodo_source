package com.google.protobuf;
/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes.dex */
final class l {
    static final Class<?> a = c();

    public static m a() {
        m b = b("getEmptyRegistry");
        if (b == null) {
            return m.d;
        }
        return b;
    }

    private static final m b(String str) {
        Class<?> cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (m) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

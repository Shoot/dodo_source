package com.google.protobuf;
/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes.dex */
class t implements j0 {
    private static final t a = new t();

    private t() {
    }

    public static t c() {
        return a;
    }

    @Override // com.google.protobuf.j0
    public i0 a(Class<?> cls) {
        if (u.class.isAssignableFrom(cls)) {
            try {
                return (i0) u.H(cls.asSubclass(u.class)).w();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // com.google.protobuf.j0
    public boolean b(Class<?> cls) {
        return u.class.isAssignableFrom(cls);
    }
}

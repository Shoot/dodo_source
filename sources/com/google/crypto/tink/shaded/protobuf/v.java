package com.google.crypto.tink.shaded.protobuf;
/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes2.dex */
class v implements l0 {
    private static final v a = new v();

    private v() {
    }

    public static v c() {
        return a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public k0 a(Class<?> cls) {
        if (w.class.isAssignableFrom(cls)) {
            try {
                return (k0) w.w(cls.asSubclass(w.class)).p();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    public boolean b(Class<?> cls) {
        return w.class.isAssignableFrom(cls);
    }
}

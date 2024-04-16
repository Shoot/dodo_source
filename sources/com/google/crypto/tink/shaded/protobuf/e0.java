package com.google.crypto.tink.shaded.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes2.dex */
public final class e0 implements z0 {
    private static final l0 b = new a();
    private final l0 a;

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes2.dex */
    class a implements l0 {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l0
        public k0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes2.dex */
    public static class b implements l0 {
        private l0[] a;

        b(l0... l0VarArr) {
            this.a = l0VarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l0
        public k0 a(Class<?> cls) {
            l0[] l0VarArr;
            for (l0 l0Var : this.a) {
                if (l0Var.b(cls)) {
                    return l0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l0
        public boolean b(Class<?> cls) {
            for (l0 l0Var : this.a) {
                if (l0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public e0() {
        this(b());
    }

    private static l0 b() {
        return new b(v.c(), c());
    }

    private static l0 c() {
        try {
            return (l0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean d(k0 k0Var) {
        if (k0Var.c() == mr8.PROTO2) {
            return true;
        }
        return false;
    }

    private static <T> y0<T> e(Class<T> cls, k0 k0Var) {
        if (w.class.isAssignableFrom(cls)) {
            if (d(k0Var)) {
                return o0.Q(cls, k0Var, s0.b(), c0.b(), a1.M(), r.b(), j0.b());
            }
            return o0.Q(cls, k0Var, s0.b(), c0.b(), a1.M(), null, j0.b());
        } else if (d(k0Var)) {
            return o0.Q(cls, k0Var, s0.a(), c0.a(), a1.H(), r.a(), j0.a());
        } else {
            return o0.Q(cls, k0Var, s0.a(), c0.a(), a1.I(), null, j0.a());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public <T> y0<T> a(Class<T> cls) {
        a1.J(cls);
        k0 a2 = this.a.a(cls);
        if (a2.a()) {
            if (w.class.isAssignableFrom(cls)) {
                return p0.m(a1.M(), r.b(), a2.b());
            }
            return p0.m(a1.H(), r.a(), a2.b());
        }
        return e(cls, a2);
    }

    private e0(l0 l0Var) {
        this.a = (l0) y.b(l0Var, "messageInfoFactory");
    }
}

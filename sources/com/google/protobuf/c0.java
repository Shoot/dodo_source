package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class c0 implements x0 {
    private static final j0 b = new a();
    private final j0 a;

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    class a implements j0 {
        a() {
        }

        @Override // com.google.protobuf.j0
        public i0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.j0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    public static class b implements j0 {
        private j0[] a;

        b(j0... j0VarArr) {
            this.a = j0VarArr;
        }

        @Override // com.google.protobuf.j0
        public i0 a(Class<?> cls) {
            j0[] j0VarArr;
            for (j0 j0Var : this.a) {
                if (j0Var.b(cls)) {
                    return j0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.j0
        public boolean b(Class<?> cls) {
            for (j0 j0Var : this.a) {
                if (j0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public c0() {
        this(b());
    }

    private static j0 b() {
        return new b(t.c(), c());
    }

    private static j0 c() {
        try {
            return (j0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean d(i0 i0Var) {
        if (i0Var.c() == nr8.PROTO2) {
            return true;
        }
        return false;
    }

    private static <T> w0<T> e(Class<T> cls, i0 i0Var) {
        if (u.class.isAssignableFrom(cls)) {
            if (d(i0Var)) {
                return m0.R(cls, i0Var, q0.b(), a0.b(), y0.M(), p.b(), h0.b());
            }
            return m0.R(cls, i0Var, q0.b(), a0.b(), y0.M(), null, h0.b());
        } else if (d(i0Var)) {
            return m0.R(cls, i0Var, q0.a(), a0.a(), y0.H(), p.a(), h0.a());
        } else {
            return m0.R(cls, i0Var, q0.a(), a0.a(), y0.I(), null, h0.a());
        }
    }

    @Override // com.google.protobuf.x0
    public <T> w0<T> a(Class<T> cls) {
        y0.J(cls);
        i0 a2 = this.a.a(cls);
        if (a2.a()) {
            if (u.class.isAssignableFrom(cls)) {
                return n0.l(y0.M(), p.b(), a2.b());
            }
            return n0.l(y0.H(), p.a(), a2.b());
        }
        return e(cls, a2);
    }

    private c0(j0 j0Var) {
        this.a = (j0) w.b(j0Var, "messageInfoFactory");
    }
}

package androidx.datastore.preferences.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class d0 implements y0 {
    private static final k0 b = new a();
    private final k0 a;

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    static class a implements k0 {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.k0
        public j0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.k0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes.dex */
    public static class b implements k0 {
        private k0[] a;

        b(k0... k0VarArr) {
            this.a = k0VarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.k0
        public j0 a(Class<?> cls) {
            k0[] k0VarArr;
            for (k0 k0Var : this.a) {
                if (k0Var.b(cls)) {
                    return k0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.k0
        public boolean b(Class<?> cls) {
            for (k0 k0Var : this.a) {
                if (k0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public d0() {
        this(b());
    }

    private static k0 b() {
        return new b(u.c(), c());
    }

    private static k0 c() {
        try {
            return (k0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean d(j0 j0Var) {
        if (j0Var.c() == or8.PROTO2) {
            return true;
        }
        return false;
    }

    private static <T> x0<T> e(Class<T> cls, j0 j0Var) {
        if (v.class.isAssignableFrom(cls)) {
            if (d(j0Var)) {
                return n0.N(cls, j0Var, r0.b(), b0.b(), z0.M(), q.b(), i0.b());
            }
            return n0.N(cls, j0Var, r0.b(), b0.b(), z0.M(), null, i0.b());
        } else if (d(j0Var)) {
            return n0.N(cls, j0Var, r0.a(), b0.a(), z0.H(), q.a(), i0.a());
        } else {
            return n0.N(cls, j0Var, r0.a(), b0.a(), z0.I(), null, i0.a());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public <T> x0<T> a(Class<T> cls) {
        z0.J(cls);
        j0 a2 = this.a.a(cls);
        if (a2.a()) {
            if (v.class.isAssignableFrom(cls)) {
                return o0.l(z0.M(), q.b(), a2.b());
            }
            return o0.l(z0.H(), q.a(), a2.b());
        }
        return e(cls, a2);
    }

    private d0(k0 k0Var) {
        this.a = (k0) x.b(k0Var, "messageInfoFactory");
    }
}

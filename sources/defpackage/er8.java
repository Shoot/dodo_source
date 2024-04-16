package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;
/* compiled from: PropertySerializerMap.java */
/* renamed from: er8  reason: default package */
/* loaded from: classes2.dex */
public abstract class er8 {
    protected final boolean a;

    /* compiled from: PropertySerializerMap.java */
    /* renamed from: er8$a */
    /* loaded from: classes2.dex */
    private static final class a extends er8 {
        private final Class<?> b;
        private final Class<?> c;
        private final gc5<Object> d;
        private final gc5<Object> e;

        public a(er8 er8Var, Class<?> cls, gc5<Object> gc5Var, Class<?> cls2, gc5<Object> gc5Var2) {
            super(er8Var);
            this.b = cls;
            this.d = gc5Var;
            this.c = cls2;
            this.e = gc5Var2;
        }

        @Override // defpackage.er8
        public er8 i(Class<?> cls, gc5<Object> gc5Var) {
            return new c(this, new f[]{new f(this.b, this.d), new f(this.c, this.e), new f(cls, gc5Var)});
        }

        @Override // defpackage.er8
        public gc5<Object> j(Class<?> cls) {
            if (cls == this.b) {
                return this.d;
            }
            if (cls == this.c) {
                return this.e;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PropertySerializerMap.java */
    /* renamed from: er8$b */
    /* loaded from: classes2.dex */
    public static final class b extends er8 {
        public static final b b = new b(false);
        public static final b c = new b(true);

        protected b(boolean z) {
            super(z);
        }

        @Override // defpackage.er8
        public er8 i(Class<?> cls, gc5<Object> gc5Var) {
            return new e(this, cls, gc5Var);
        }

        @Override // defpackage.er8
        public gc5<Object> j(Class<?> cls) {
            return null;
        }
    }

    /* compiled from: PropertySerializerMap.java */
    /* renamed from: er8$c */
    /* loaded from: classes2.dex */
    private static final class c extends er8 {
        private final f[] b;

        public c(er8 er8Var, f[] fVarArr) {
            super(er8Var);
            this.b = fVarArr;
        }

        @Override // defpackage.er8
        public er8 i(Class<?> cls, gc5<Object> gc5Var) {
            f[] fVarArr = this.b;
            int length = fVarArr.length;
            if (length == 8) {
                if (this.a) {
                    return new e(this, cls, gc5Var);
                }
                return this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, gc5Var);
            return new c(this, fVarArr2);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[ORIG_RETURN, RETURN] */
        @Override // defpackage.er8
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public defpackage.gc5<java.lang.Object> j(java.lang.Class<?> r4) {
            /*
                r3 = this;
                er8$f[] r0 = r3.b
                r1 = 0
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto Lc
                gc5<java.lang.Object> r4 = r1.b
                return r4
            Lc:
                r1 = 1
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L16
                gc5<java.lang.Object> r4 = r1.b
                return r4
            L16:
                r1 = 2
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L20
                gc5<java.lang.Object> r4 = r1.b
                return r4
            L20:
                int r1 = r0.length
                switch(r1) {
                    case 4: goto L4d;
                    case 5: goto L43;
                    case 6: goto L39;
                    case 7: goto L2f;
                    case 8: goto L25;
                    default: goto L24;
                }
            L24:
                goto L57
            L25:
                r1 = 7
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L2f
                gc5<java.lang.Object> r4 = r1.b
                return r4
            L2f:
                r1 = 6
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L39
                gc5<java.lang.Object> r4 = r1.b
                return r4
            L39:
                r1 = 5
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L43
                gc5<java.lang.Object> r4 = r1.b
                return r4
            L43:
                r1 = 4
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L4d
                gc5<java.lang.Object> r4 = r1.b
                return r4
            L4d:
                r1 = 3
                r0 = r0[r1]
                java.lang.Class<?> r1 = r0.a
                if (r1 != r4) goto L57
                gc5<java.lang.Object> r4 = r0.b
                return r4
            L57:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.er8.c.j(java.lang.Class):gc5");
        }
    }

    /* compiled from: PropertySerializerMap.java */
    /* renamed from: er8$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public final gc5<Object> a;
        public final er8 b;

        public d(gc5<Object> gc5Var, er8 er8Var) {
            this.a = gc5Var;
            this.b = er8Var;
        }
    }

    /* compiled from: PropertySerializerMap.java */
    /* renamed from: er8$e */
    /* loaded from: classes2.dex */
    private static final class e extends er8 {
        private final Class<?> b;
        private final gc5<Object> c;

        public e(er8 er8Var, Class<?> cls, gc5<Object> gc5Var) {
            super(er8Var);
            this.b = cls;
            this.c = gc5Var;
        }

        @Override // defpackage.er8
        public er8 i(Class<?> cls, gc5<Object> gc5Var) {
            return new a(this, this.b, this.c, cls, gc5Var);
        }

        @Override // defpackage.er8
        public gc5<Object> j(Class<?> cls) {
            if (cls == this.b) {
                return this.c;
            }
            return null;
        }
    }

    /* compiled from: PropertySerializerMap.java */
    /* renamed from: er8$f */
    /* loaded from: classes2.dex */
    private static final class f {
        public final Class<?> a;
        public final gc5<Object> b;

        public f(Class<?> cls, gc5<Object> gc5Var) {
            this.a = cls;
            this.b = gc5Var;
        }
    }

    protected er8(boolean z) {
        this.a = z;
    }

    public static er8 c() {
        return b.b;
    }

    public final d a(y85 y85Var, gc5<Object> gc5Var) {
        return new d(gc5Var, i(y85Var.u(), gc5Var));
    }

    public final d b(Class<?> cls, gc5<Object> gc5Var) {
        return new d(gc5Var, i(cls, gc5Var));
    }

    public final d d(Class<?> cls, bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> M = bdaVar.M(cls, ia0Var);
        return new d(M, i(cls, M));
    }

    public final d e(y85 y85Var, bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> S = bdaVar.S(y85Var, ia0Var);
        return new d(S, i(y85Var.u(), S));
    }

    public final d f(Class<?> cls, bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> T = bdaVar.T(cls, ia0Var);
        return new d(T, i(cls, T));
    }

    public final d g(y85 y85Var, bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> H = bdaVar.H(y85Var, ia0Var);
        return new d(H, i(y85Var.u(), H));
    }

    public final d h(Class<?> cls, bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        gc5<Object> K = bdaVar.K(cls, ia0Var);
        return new d(K, i(cls, K));
    }

    public abstract er8 i(Class<?> cls, gc5<Object> gc5Var);

    public abstract gc5<Object> j(Class<?> cls);

    protected er8(er8 er8Var) {
        this.a = er8Var.a;
    }
}

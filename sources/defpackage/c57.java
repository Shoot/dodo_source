package defpackage;
/* compiled from: ObjectIdInfo.java */
/* renamed from: c57  reason: default package */
/* loaded from: classes2.dex */
public class c57 {
    private static final c57 f = new c57(vq8.e, Object.class, null, false, null);
    protected final vq8 a;
    protected final Class<? extends y47<?>> b;
    protected final Class<Object> c;
    protected final Class<?> d;
    protected final boolean e;

    public c57(vq8 vq8Var, Class<?> cls, Class<? extends y47<?>> cls2, Class<Object> cls3) {
        this(vq8Var, cls, cls2, false, cls3);
    }

    public static c57 a() {
        return f;
    }

    public boolean b() {
        return this.e;
    }

    public Class<? extends y47<?>> c() {
        return this.b;
    }

    public vq8 d() {
        return this.a;
    }

    public Class<?> e() {
        return this.d;
    }

    public c57 f(boolean z) {
        if (this.e == z) {
            return this;
        }
        return new c57(this.a, this.d, this.b, z, this.c);
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.a + ", scope=" + q81.R(this.d) + ", generatorType=" + q81.R(this.b) + ", alwaysAsId=" + this.e;
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<java.lang.Object>, code=java.lang.Class, for r5v0, types: [java.lang.Class<java.lang.Object>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected c57(defpackage.vq8 r1, java.lang.Class<?> r2, java.lang.Class<? extends defpackage.y47<?>> r3, boolean r4, java.lang.Class r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.d = r2
            r0.b = r3
            r0.e = r4
            if (r5 != 0) goto Lf
            java.lang.Class<nla> r5 = defpackage.nla.class
        Lf:
            r0.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c57.<init>(vq8, java.lang.Class, java.lang.Class, boolean, java.lang.Class):void");
    }
}

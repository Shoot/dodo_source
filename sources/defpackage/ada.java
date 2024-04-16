package defpackage;

import java.io.Serializable;
/* compiled from: SerializerFactoryConfig.java */
/* renamed from: ada  reason: default package */
/* loaded from: classes2.dex */
public final class ada implements Serializable {
    protected static final cda[] d = new cda[0];
    protected static final pa0[] e = new pa0[0];
    protected final cda[] a;
    protected final cda[] b;
    protected final pa0[] c;

    public ada() {
        this(null, null, null);
    }

    public boolean a() {
        if (this.b.length > 0) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (this.c.length > 0) {
            return true;
        }
        return false;
    }

    public Iterable<cda> c() {
        return new ir(this.b);
    }

    public Iterable<pa0> d() {
        return new ir(this.c);
    }

    public Iterable<cda> e() {
        return new ir(this.a);
    }

    protected ada(cda[] cdaVarArr, cda[] cdaVarArr2, pa0[] pa0VarArr) {
        this.a = cdaVarArr == null ? d : cdaVarArr;
        this.b = cdaVarArr2 == null ? d : cdaVarArr2;
        this.c = pa0VarArr == null ? e : pa0VarArr;
    }
}

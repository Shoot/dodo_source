package defpackage;
/* compiled from: MindboxSdkServiceImpl_Factory.java */
/* renamed from: zk6  reason: default package */
/* loaded from: classes4.dex */
public final class zk6 {
    private final as8<uk6> a;
    private final as8<tk6> b;
    private final as8<wk6> c;
    private final as8<mh0> d;

    public zk6(as8<uk6> as8Var, as8<tk6> as8Var2, as8<wk6> as8Var3, as8<mh0> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static zk6 a(as8<uk6> as8Var, as8<tk6> as8Var2, as8<wk6> as8Var3, as8<mh0> as8Var4) {
        return new zk6(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static yk6 c(oj6 oj6Var, String str, String str2, uk6 uk6Var, tk6 tk6Var, wk6 wk6Var, mh0 mh0Var) {
        return new yk6(oj6Var, str, str2, uk6Var, tk6Var, wk6Var, mh0Var);
    }

    public yk6 b(oj6 oj6Var, String str, String str2) {
        return c(oj6Var, str, str2, this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}

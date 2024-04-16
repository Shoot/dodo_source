package defpackage;
/* compiled from: MindboxModule_ProvideMindboxServiceFactory.java */
/* renamed from: jk6  reason: default package */
/* loaded from: classes3.dex */
public final class jk6 implements no3<cl6> {
    private final as8<ay1> a;
    private final as8<dt5> b;
    private final as8<dl6> c;

    public jk6(as8<ay1> as8Var, as8<dt5> as8Var2, as8<dl6> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static jk6 a(as8<ay1> as8Var, as8<dt5> as8Var2, as8<dl6> as8Var3) {
        return new jk6(as8Var, as8Var2, as8Var3);
    }

    public static cl6 c(ay1 ay1Var, dt5 dt5Var, dl6 dl6Var) {
        return (cl6) jh8.e(ik6.a.a(ay1Var, dt5Var, dl6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public cl6 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}

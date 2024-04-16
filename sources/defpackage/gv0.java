package defpackage;
/* compiled from: ChangeLocationLogicFactoryImpl_Factory.java */
/* renamed from: gv0  reason: default package */
/* loaded from: classes4.dex */
public final class gv0 implements no3<fv0> {
    private final as8<jv5> a;

    public gv0(as8<jv5> as8Var) {
        this.a = as8Var;
    }

    public static gv0 a(as8<jv5> as8Var) {
        return new gv0(as8Var);
    }

    public static fv0 c(jv5 jv5Var) {
        return new fv0(jv5Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fv0 get() {
        return c(this.a.get());
    }
}

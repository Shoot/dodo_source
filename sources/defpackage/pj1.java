package defpackage;
/* compiled from: CommonAddressModule_ProvideSaveAddressInteractorFactory.java */
/* renamed from: pj1  reason: default package */
/* loaded from: classes3.dex */
public final class pj1 implements no3<dt9> {
    private final as8<x42> a;

    public pj1(as8<x42> as8Var) {
        this.a = as8Var;
    }

    public static pj1 a(as8<x42> as8Var) {
        return new pj1(as8Var);
    }

    public static dt9 c(x42 x42Var) {
        return (dt9) jh8.e(mj1.a.c(x42Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dt9 get() {
        return c(this.a.get());
    }
}

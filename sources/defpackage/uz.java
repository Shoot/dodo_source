package defpackage;
/* compiled from: AuthorizationAppModule_ProvidePhoneHintFeatureCheckerFactory.java */
/* renamed from: uz  reason: default package */
/* loaded from: classes3.dex */
public final class uz implements no3<r28> {
    private final rz a;
    private final as8<ih4> b;
    private final as8<hq3> c;

    public uz(rz rzVar, as8<ih4> as8Var, as8<hq3> as8Var2) {
        this.a = rzVar;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static uz a(rz rzVar, as8<ih4> as8Var, as8<hq3> as8Var2) {
        return new uz(rzVar, as8Var, as8Var2);
    }

    public static r28 c(rz rzVar, ih4 ih4Var, hq3 hq3Var) {
        return (r28) jh8.e(rzVar.d(ih4Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public r28 get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}

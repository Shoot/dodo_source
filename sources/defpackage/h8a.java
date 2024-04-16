package defpackage;
/* compiled from: SelectPizzeriaModule_ProvidePizzeriaFiltersServiceFactory.java */
/* renamed from: h8a  reason: default package */
/* loaded from: classes3.dex */
public final class h8a implements no3<ka8> {
    private final d8a a;
    private final as8<fa8> b;

    public h8a(d8a d8aVar, as8<fa8> as8Var) {
        this.a = d8aVar;
        this.b = as8Var;
    }

    public static h8a a(d8a d8aVar, as8<fa8> as8Var) {
        return new h8a(d8aVar, as8Var);
    }

    public static ka8 c(d8a d8aVar, fa8 fa8Var) {
        return (ka8) jh8.e(d8aVar.d(fa8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ka8 get() {
        return c(this.a, this.b.get());
    }
}

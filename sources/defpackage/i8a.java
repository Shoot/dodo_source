package defpackage;
/* compiled from: SelectPizzeriaModule_ProvidePizzeriaMapHelperFactory.java */
/* renamed from: i8a  reason: default package */
/* loaded from: classes3.dex */
public final class i8a implements no3<u88> {
    private final d8a a;
    private final as8<r43> b;

    public i8a(d8a d8aVar, as8<r43> as8Var) {
        this.a = d8aVar;
        this.b = as8Var;
    }

    public static i8a a(d8a d8aVar, as8<r43> as8Var) {
        return new i8a(d8aVar, as8Var);
    }

    public static u88 c(d8a d8aVar, r43 r43Var) {
        return (u88) jh8.e(d8aVar.e(r43Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public u88 get() {
        return c(this.a, this.b.get());
    }
}

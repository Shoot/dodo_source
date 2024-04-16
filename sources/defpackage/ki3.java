package defpackage;
/* compiled from: EnterNameInteractor_Factory.java */
/* renamed from: ki3  reason: default package */
/* loaded from: classes4.dex */
public final class ki3 implements no3<ji3> {
    private final as8<t52> a;
    private final as8<gc> b;

    public ki3(as8<t52> as8Var, as8<gc> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static ki3 a(as8<t52> as8Var, as8<gc> as8Var2) {
        return new ki3(as8Var, as8Var2);
    }

    public static ji3 c(t52 t52Var, gc gcVar) {
        return new ji3(t52Var, gcVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ji3 get() {
        return c(this.a.get(), this.b.get());
    }
}

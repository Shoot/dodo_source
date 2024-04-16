package defpackage;
/* compiled from: MenuItemRepositoryV5_Factory.java */
/* renamed from: qe6  reason: default package */
/* loaded from: classes4.dex */
public final class qe6 implements no3<pe6> {
    private final as8<we6> a;

    public qe6(as8<we6> as8Var) {
        this.a = as8Var;
    }

    public static qe6 a(as8<we6> as8Var) {
        return new qe6(as8Var);
    }

    public static pe6 c(we6 we6Var) {
        return new pe6(we6Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pe6 get() {
        return c(this.a.get());
    }
}

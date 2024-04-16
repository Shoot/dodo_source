package defpackage;
/* compiled from: MenuItemForwardCompatibilityRepository_Factory.java */
/* renamed from: fe6  reason: default package */
/* loaded from: classes4.dex */
public final class fe6 implements no3<ee6> {
    private final as8<ne6> a;

    public fe6(as8<ne6> as8Var) {
        this.a = as8Var;
    }

    public static fe6 a(as8<ne6> as8Var) {
        return new fe6(as8Var);
    }

    public static ee6 c(ne6 ne6Var) {
        return new ee6(ne6Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ee6 get() {
        return c(this.a.get());
    }
}

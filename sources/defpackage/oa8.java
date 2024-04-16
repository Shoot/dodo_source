package defpackage;
/* compiled from: PizzeriasFiltersServiceImpl_Factory.java */
/* renamed from: oa8  reason: default package */
/* loaded from: classes2.dex */
public final class oa8 implements no3<na8> {
    private final as8<ga8> a;

    public oa8(as8<ga8> as8Var) {
        this.a = as8Var;
    }

    public static oa8 a(as8<ga8> as8Var) {
        return new oa8(as8Var);
    }

    public static na8 c(ga8 ga8Var) {
        return new na8(ga8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public na8 get() {
        return c(this.a.get());
    }
}

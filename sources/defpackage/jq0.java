package defpackage;
/* compiled from: CartConverterImpl_Factory.java */
/* renamed from: jq0  reason: default package */
/* loaded from: classes4.dex */
public final class jq0 implements no3<iq0> {
    private final as8<fda> a;

    public jq0(as8<fda> as8Var) {
        this.a = as8Var;
    }

    public static jq0 a(as8<fda> as8Var) {
        return new jq0(as8Var);
    }

    public static iq0 c(fda fdaVar) {
        return new iq0(fdaVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public iq0 get() {
        return c(this.a.get());
    }
}

package defpackage;
/* compiled from: MindboxCredentialsResolver_Factory.java */
/* renamed from: rj6  reason: default package */
/* loaded from: classes4.dex */
public final class rj6 implements no3<qj6> {
    private final as8<mh0> a;

    public rj6(as8<mh0> as8Var) {
        this.a = as8Var;
    }

    public static rj6 a(as8<mh0> as8Var) {
        return new rj6(as8Var);
    }

    public static qj6 c(mh0 mh0Var) {
        return new qj6(mh0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qj6 get() {
        return c(this.a.get());
    }
}

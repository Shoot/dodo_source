package defpackage;
/* compiled from: CustomerAddressModule_ProvideSelectedAddressStateFactory.java */
/* renamed from: u42  reason: default package */
/* loaded from: classes3.dex */
public final class u42 implements no3<j9a> {
    private final as8<v53> a;

    public u42(as8<v53> as8Var) {
        this.a = as8Var;
    }

    public static u42 a(as8<v53> as8Var) {
        return new u42(as8Var);
    }

    public static j9a c(v53 v53Var) {
        return (j9a) jh8.e(s42.a.b(v53Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public j9a get() {
        return c(this.a.get());
    }
}

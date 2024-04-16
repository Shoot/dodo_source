package defpackage;
/* compiled from: CustomerAddressModule_ProvideCustomerAddressServiceFactory.java */
/* renamed from: t42  reason: default package */
/* loaded from: classes3.dex */
public final class t42 implements no3<x42> {
    private final as8<y42> a;

    public t42(as8<y42> as8Var) {
        this.a = as8Var;
    }

    public static t42 a(as8<y42> as8Var) {
        return new t42(as8Var);
    }

    public static x42 c(y42 y42Var) {
        return (x42) jh8.e(s42.a.a(y42Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public x42 get() {
        return c(this.a.get());
    }
}

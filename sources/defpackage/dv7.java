package defpackage;
/* compiled from: PaymentModule_ProvideMakePaymentServiceFactory.java */
/* renamed from: dv7  reason: default package */
/* loaded from: classes3.dex */
public final class dv7 implements no3<s56> {
    private final as8<me8> a;
    private final as8<q56> b;
    private final as8<an> c;

    public dv7(as8<me8> as8Var, as8<q56> as8Var2, as8<an> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static dv7 a(as8<me8> as8Var, as8<q56> as8Var2, as8<an> as8Var3) {
        return new dv7(as8Var, as8Var2, as8Var3);
    }

    public static s56 c(me8 me8Var, q56 q56Var, an anVar) {
        return (s56) jh8.e(gu7.a.w(me8Var, q56Var, anVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public s56 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}

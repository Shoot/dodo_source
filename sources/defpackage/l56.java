package defpackage;
/* compiled from: MainScreenModule_ProvideWaitForPaidOrderServiceFactory.java */
/* renamed from: l56  reason: default package */
/* loaded from: classes3.dex */
public final class l56 implements no3<u2c> {
    private final as8<li7> a;
    private final as8<x51> b;
    private final as8<f8c> c;

    public l56(as8<li7> as8Var, as8<x51> as8Var2, as8<f8c> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static l56 a(as8<li7> as8Var, as8<x51> as8Var2, as8<f8c> as8Var3) {
        return new l56(as8Var, as8Var2, as8Var3);
    }

    public static u2c c(li7 li7Var, x51 x51Var, f8c f8cVar) {
        return (u2c) jh8.e(j56.a.b(li7Var, x51Var, f8cVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public u2c get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}

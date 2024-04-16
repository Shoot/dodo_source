package defpackage;
/* compiled from: OrderModule_ProvideOrderServiceFactory.java */
/* renamed from: tg7  reason: default package */
/* loaded from: classes3.dex */
public final class tg7 implements no3<li7> {
    private final as8<hg7> a;

    public tg7(as8<hg7> as8Var) {
        this.a = as8Var;
    }

    public static tg7 a(as8<hg7> as8Var) {
        return new tg7(as8Var);
    }

    public static li7 c(hg7 hg7Var) {
        return (li7) jh8.e(ng7.a.f(hg7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public li7 get() {
        return c(this.a.get());
    }
}

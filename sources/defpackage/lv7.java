package defpackage;

import ru.dodopizza.backend.domain.clientcard.ClientCardAPI;
/* compiled from: PaymentModule_ProvidePaymentServiceFactory.java */
/* renamed from: lv7  reason: default package */
/* loaded from: classes3.dex */
public final class lv7 implements no3<ew7> {
    private final as8<qw7> a;
    private final as8<sp0> b;
    private final as8<ClientCardAPI> c;
    private final as8<vo0> d;
    private final as8<tw7> e;

    public lv7(as8<qw7> as8Var, as8<sp0> as8Var2, as8<ClientCardAPI> as8Var3, as8<vo0> as8Var4, as8<tw7> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static lv7 a(as8<qw7> as8Var, as8<sp0> as8Var2, as8<ClientCardAPI> as8Var3, as8<vo0> as8Var4, as8<tw7> as8Var5) {
        return new lv7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static ew7 c(qw7 qw7Var, sp0 sp0Var, ClientCardAPI clientCardAPI, vo0 vo0Var, tw7 tw7Var) {
        return (ew7) jh8.e(gu7.a.E(qw7Var, sp0Var, clientCardAPI, vo0Var, tw7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ew7 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

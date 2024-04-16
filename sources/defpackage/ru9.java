package defpackage;

import ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankListAPI;
/* compiled from: SbpBankListModule_ProvideSbpBanksServiceFactory.java */
/* renamed from: ru9  reason: default package */
/* loaded from: classes2.dex */
public final class ru9 implements no3<xu9> {
    private final as8<SbpBankListAPI> a;

    public ru9(as8<SbpBankListAPI> as8Var) {
        this.a = as8Var;
    }

    public static ru9 a(as8<SbpBankListAPI> as8Var) {
        return new ru9(as8Var);
    }

    public static xu9 c(SbpBankListAPI sbpBankListAPI) {
        return (xu9) jh8.e(pu9.a.b(sbpBankListAPI));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xu9 get() {
        return c(this.a.get());
    }
}

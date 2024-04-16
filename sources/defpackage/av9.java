package defpackage;

import ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankListAPI;
/* compiled from: SbpDomainModule_ProvideSbpBankListApiFactory.java */
/* renamed from: av9  reason: default package */
/* loaded from: classes2.dex */
public final class av9 implements no3<SbpBankListAPI> {
    private final as8<rn2> a;

    public av9(as8<rn2> as8Var) {
        this.a = as8Var;
    }

    public static av9 a(as8<rn2> as8Var) {
        return new av9(as8Var);
    }

    public static SbpBankListAPI c(rn2 rn2Var) {
        return (SbpBankListAPI) jh8.e(zu9.a.a(rn2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SbpBankListAPI get() {
        return c(this.a.get());
    }
}

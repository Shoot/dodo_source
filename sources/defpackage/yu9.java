package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankListAPI;
import ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankUnitResponse;
/* compiled from: SbpBanksService.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lyu9;", "Lxu9;", "Loz3;", "Lru/dodopizza/backend/domain/payment/dto/sbp/SbpBankUnitResponse;", "getSbpBankList", "Lru/dodopizza/backend/domain/payment/dto/sbp/SbpBankListAPI;", "a", "Lru/dodopizza/backend/domain/payment/dto/sbp/SbpBankListAPI;", "sbpBankListApi", "<init>", "(Lru/dodopizza/backend/domain/payment/dto/sbp/SbpBankListAPI;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yu9  reason: default package */
/* loaded from: classes4.dex */
public final class yu9 implements xu9 {
    private final SbpBankListAPI a;

    public yu9(SbpBankListAPI sbpBankListAPI) {
        z65.h(sbpBankListAPI, "sbpBankListApi");
        this.a = sbpBankListAPI;
    }

    @Override // defpackage.xu9
    public oz3<SbpBankUnitResponse> getSbpBankList() {
        return wz3.a(this.a.getSbpBankList().getSbpBankUnits());
    }
}

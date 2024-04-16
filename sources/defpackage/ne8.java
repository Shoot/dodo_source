package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import defpackage.ca7;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.payment.PaymentAPI;
import ru.dodopizza.backend.domain.payment.dto.v2.PaymentStatusResponseDto;
/* compiled from: PollingPaymentStatusService.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, d2 = {"Lne8;", "Lme8;", "Lru/dodopizza/backend/domain/payment/dto/v2/PaymentStatusResponseDto;", "Lba7;", c.a, "Lca7;", "b", "", "paymentId", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "a", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "paymentAPI", "Lw65;", "Lw65;", "intervalWaiter", "<init>", "(Lru/dodopizza/backend/domain/payment/PaymentAPI;Lw65;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ne8  reason: default package */
/* loaded from: classes2.dex */
public final class ne8 implements me8 {
    private final PaymentAPI a;
    private final w65 b;

    public ne8(PaymentAPI paymentAPI, w65 w65Var) {
        z65.h(paymentAPI, "paymentAPI");
        z65.h(w65Var, "intervalWaiter");
        this.a = paymentAPI;
        this.b = w65Var;
    }

    private final ba7 b(ca7 ca7Var) {
        return new ba7(ca7Var, "", "", "", "");
    }

    private final ba7 c(PaymentStatusResponseDto paymentStatusResponseDto) {
        String str;
        String str2;
        String str3;
        ca7.a aVar = ca7.b;
        String navigateUrl = paymentStatusResponseDto.getNavigateUrl();
        if (navigateUrl == null) {
            navigateUrl = "";
        }
        ca7 a = aVar.a(navigateUrl, paymentStatusResponseDto.getStatus());
        String navigateUrl2 = paymentStatusResponseDto.getNavigateUrl();
        if (navigateUrl2 == null) {
            str = "";
        } else {
            str = navigateUrl2;
        }
        String md = paymentStatusResponseDto.getMd();
        if (md == null) {
            str2 = "";
        } else {
            str2 = md;
        }
        String paReq = paymentStatusResponseDto.getPaReq();
        if (paReq == null) {
            str3 = "";
        } else {
            str3 = paReq;
        }
        String termUrl = paymentStatusResponseDto.getTermUrl();
        if (termUrl == null) {
            termUrl = "";
        }
        return new ba7(a, str, str2, str3, termUrl);
    }

    @Override // defpackage.me8
    public ba7 a(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        ba7 b = b(ca7.c);
        while (b.d() == ca7.c) {
            this.b.a();
            b = c(this.a.getPaymentStatus(str, str2));
        }
        return b;
    }
}

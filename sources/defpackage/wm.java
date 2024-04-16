package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.payment.PaymentAPI;
import ru.dodopizza.backend.domain.payment.dto.app2app.App2AppData;
import ru.dodopizza.backend.domain.payment.dto.app2app.PayByApp2AppRequestDto;
/* compiled from: App2AppPaymentService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lwm;", "Lvm;", "Los7;", "payment", "Ltm;", "a", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "Lru/dodopizza/backend/domain/payment/PaymentAPI;", "paymentApi", "Lks7;", "b", "Lks7;", "responseDtoMapper", "<init>", "(Lru/dodopizza/backend/domain/payment/PaymentAPI;Lks7;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wm  reason: default package */
/* loaded from: classes2.dex */
public final class wm implements vm {
    private final PaymentAPI a;
    private final ks7 b;

    public wm(PaymentAPI paymentAPI, ks7 ks7Var) {
        z65.h(paymentAPI, "paymentApi");
        z65.h(ks7Var, "responseDtoMapper");
        this.a = paymentAPI;
        this.b = ks7Var;
    }

    @Override // defpackage.vm
    public tm a(os7 os7Var) {
        z65.h(os7Var, "payment");
        return this.b.a(this.a.payByApp2App(os7Var.a(), new PayByApp2AppRequestDto(os7Var.e(), new App2AppData("", ""))));
    }
}

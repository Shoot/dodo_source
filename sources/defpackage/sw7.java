package defpackage;

import com.dodopizza.persistence.entity.payment.CardEntity;
import kotlin.Metadata;
/* compiled from: PaymentWayRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/payment/CardEntity;", "Lp60;", "b", "a", "payment_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: sw7  reason: default package */
/* loaded from: classes2.dex */
public final class sw7 {
    public static final CardEntity a(p60 p60Var) {
        z65.h(p60Var, "<this>");
        return new CardEntity(p60Var.getId(), p60Var.d(), p60Var.a(), p60Var.b(), p60Var.c());
    }

    public static final p60 b(CardEntity cardEntity) {
        z65.h(cardEntity, "<this>");
        String id = cardEntity.getId();
        z65.e(id);
        String startPart = cardEntity.getStartPart();
        z65.e(startPart);
        String endPart = cardEntity.getEndPart();
        z65.e(endPart);
        String expiryMonth = cardEntity.getExpiryMonth();
        z65.e(expiryMonth);
        String expiryYear = cardEntity.getExpiryYear();
        z65.e(expiryYear);
        return new p60(id, startPart, endPart, expiryMonth, expiryYear);
    }
}

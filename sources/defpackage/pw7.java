package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.payment.CardEntity;
import com.dodopizza.persistence.entity.payment.GooglePayInitDataEntity;
import com.dodopizza.persistence.entity.payment.PaymentMethodEntity;
import com.huawei.hms.opendevice.c;
import defpackage.jw7;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: PaymentWayMapper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lpw7;", "Low7;", "Ljw7;", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", DateTokenConverter.CONVERTER_KEY, "", "Lcom/dodopizza/persistence/entity/payment/PaymentMethodEntity;", "paymentMethodEntities", c.a, "paymentMethodEntity", "a", "paymentWay", "b", "Lnw7;", "Lnw7;", "paymentWayFactory", "Lxg4;", "Lxg4;", "googlePayInitDataMapper", "<init>", "(Lnw7;Lxg4;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pw7  reason: default package */
/* loaded from: classes2.dex */
public final class pw7 implements ow7 {
    private final nw7 a;
    private final xg4 b;

    public pw7(nw7 nw7Var, xg4 xg4Var) {
        z65.h(nw7Var, "paymentWayFactory");
        z65.h(xg4Var, "googlePayInitDataMapper");
        this.a = nw7Var;
        this.b = xg4Var;
    }

    private final CardEntity d(jw7 jw7Var) {
        p60 i;
        if (!(jw7Var instanceof jw7.g) || (i = ((jw7.g) jw7Var).i()) == null) {
            return null;
        }
        return sw7.a(i);
    }

    @Override // defpackage.ow7
    public jw7 a(PaymentMethodEntity paymentMethodEntity) {
        wg4 wg4Var;
        z65.h(paymentMethodEntity, "paymentMethodEntity");
        nw7 nw7Var = this.a;
        String id = paymentMethodEntity.getId();
        if (id == null) {
            id = "";
        }
        String str = id;
        du7 a = du7.b.a(Integer.valueOf(paymentMethodEntity.getPaymentType()));
        String acquirerName = paymentMethodEntity.getAcquirerName();
        String brandName = paymentMethodEntity.getBrandName();
        dt7 b = dt7.a.b(paymentMethodEntity.getIntegrationType());
        CardEntity card = paymentMethodEntity.getCard();
        int priority = paymentMethodEntity.getPriority();
        GooglePayInitDataEntity googlePayInitData = paymentMethodEntity.getGooglePayInitData();
        if (googlePayInitData == null || (wg4Var = this.b.a(googlePayInitData)) == null) {
            wg4Var = new wg4(null, null, 3, null);
        }
        return nw7Var.a(new ft7(str, a, acquirerName, brandName, b, card, priority, wg4Var, paymentMethodEntity.isRedirectSaveCardEnabled()));
    }

    @Override // defpackage.ow7
    public PaymentMethodEntity b(jw7 jw7Var) {
        String str;
        z65.h(jw7Var, "paymentWay");
        String id = jw7Var.getId();
        int i = jw7Var.c().i();
        String a = jw7Var.a();
        if (jw7Var instanceof jw7.a) {
            str = ((jw7.a) jw7Var).i().i();
        } else {
            str = "";
        }
        PaymentMethodEntity paymentMethodEntity = new PaymentMethodEntity(id, i, a, str, dt7.a.a(jw7Var.b()), d(jw7Var), jw7Var.e(), null, false, 384, null);
        if (jw7Var instanceof jw7.e) {
            paymentMethodEntity.setGooglePayInitData(this.b.b(((jw7.e) jw7Var).i()));
        }
        return paymentMethodEntity;
    }

    @Override // defpackage.ow7
    public Collection<jw7> c(Collection<? extends PaymentMethodEntity> collection) {
        int w;
        z65.h(collection, "paymentMethodEntities");
        Collection<? extends PaymentMethodEntity> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (PaymentMethodEntity paymentMethodEntity : collection2) {
            arrayList.add(a(paymentMethodEntity));
        }
        return arrayList;
    }
}

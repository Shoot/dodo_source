package defpackage;

import com.dodopizza.persistence.entity.payment.GooglePayInitDataEntity;
import kotlin.Metadata;
/* compiled from: GooglePayInitDataMapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lyg4;", "Lxg4;", "Lcom/dodopizza/persistence/entity/payment/GooglePayInitDataEntity;", "googlePayInitDataEntity", "Lwg4;", "a", "googlePayInitData", "b", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yg4  reason: default package */
/* loaded from: classes2.dex */
public final class yg4 implements xg4 {
    @Override // defpackage.xg4
    public wg4 a(GooglePayInitDataEntity googlePayInitDataEntity) {
        z65.h(googlePayInitDataEntity, "googlePayInitDataEntity");
        String environment = googlePayInitDataEntity.getEnvironment();
        if (environment == null) {
            environment = "TEST";
        }
        return new wg4(environment, (String) mh5.c(googlePayInitDataEntity.isReadyToPayRequest(), ""));
    }

    @Override // defpackage.xg4
    public GooglePayInitDataEntity b(wg4 wg4Var) {
        z65.h(wg4Var, "googlePayInitData");
        return new GooglePayInitDataEntity(wg4Var.a(), wg4Var.b());
    }
}

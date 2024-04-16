package ru.dodopizza.app.data.deserializer;

import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.cart.AppliedInfoEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.domain.exceptions.AppliedInfoIsNullException;
/* loaded from: classes3.dex */
public class PromoCodeDeserializer implements oa5<DataPromoCodeEntity> {
    private final Logger a = LoggerFactory.getLogger("PromoCodeDeserializer");

    @Override // defpackage.oa5
    /* renamed from: a */
    public DataPromoCodeEntity deserialize(pa5 pa5Var, Type type, la5 la5Var) throws JsonParseException {
        String str;
        int i;
        mb5 f = pa5Var.f();
        pa5 B = f.B("promoCode");
        if (!B.p()) {
            str = B.h();
        } else {
            str = null;
        }
        String str2 = str;
        pa5 B2 = f.B("status");
        if (!B2.p()) {
            i = B2.a();
        } else {
            i = 0;
        }
        AppliedInfoEntity appliedInfoEntity = (AppliedInfoEntity) la5Var.a(f.B("appliedInfo"), AppliedInfoEntity.class);
        BonusActionEntity bonusActionEntity = (BonusActionEntity) la5Var.a(f.B("bonusAction"), BonusActionEntity.class);
        if (appliedInfoEntity == null) {
            this.a.error("Some trouble in PromoCodeDeserializer#deserialize", (Throwable) new AppliedInfoIsNullException(pa5Var.f().B("appliedInfo").toString()));
        }
        return new DataPromoCodeEntity(str2, i, appliedInfoEntity, null, bonusActionEntity);
    }
}

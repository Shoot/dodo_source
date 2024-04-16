package defpackage;

import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.cart.AppliedInfoEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import kotlin.Metadata;
/* compiled from: promocode_convertions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/DataPromoCodeEntity;", "promoCode", "Lop8;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: jq8  reason: default package */
/* loaded from: classes4.dex */
public final class jq8 {
    public static final op8 a(DataPromoCodeEntity dataPromoCodeEntity) {
        eq8 eq8Var;
        String str;
        String str2;
        String str3;
        if (dataPromoCodeEntity == null) {
            return op8.h.a();
        }
        String str4 = null;
        if (dataPromoCodeEntity.getAppliedInfo() != null) {
            AppliedInfoEntity appliedInfo = dataPromoCodeEntity.getAppliedInfo();
            z65.e(appliedInfo);
            if (appliedInfo.getStatus() != 3) {
                if (dataPromoCodeEntity.getBonusAction() == null) {
                    return op8.h.a();
                }
                int status = dataPromoCodeEntity.getStatus();
                if (status != 1) {
                    if (status != 2) {
                        eq8Var = eq8.c;
                    } else {
                        eq8Var = eq8.b;
                    }
                } else {
                    eq8Var = eq8.a;
                }
                eq8 eq8Var2 = eq8Var;
                String str5 = (String) mh5.b(dataPromoCodeEntity.getPromoCode(), "Can`t be null");
                BonusActionEntity bonusAction = dataPromoCodeEntity.getBonusAction();
                if (bonusAction != null) {
                    str = bonusAction.getTitle();
                } else {
                    str = null;
                }
                String str6 = (String) mh5.b(str, "Can`t be null");
                BonusActionEntity bonusAction2 = dataPromoCodeEntity.getBonusAction();
                if (bonusAction2 != null) {
                    str2 = bonusAction2.getDescription();
                } else {
                    str2 = null;
                }
                String str7 = (String) mh5.b(str2, "Can`t be null");
                AppliedInfoEntity appliedInfo2 = dataPromoCodeEntity.getAppliedInfo();
                if (appliedInfo2 != null) {
                    str4 = appliedInfo2.getDescription();
                }
                if (str4 == null) {
                    str3 = "";
                } else {
                    str3 = str4;
                }
                return new op8(str5, 0, "", str6, str7, str3, eq8Var2);
            }
        }
        AppliedInfoEntity appliedInfo3 = dataPromoCodeEntity.getAppliedInfo();
        if (appliedInfo3 != null) {
            str4 = appliedInfo3.getDescription();
        }
        if (str4 != null) {
            String promoCode = dataPromoCodeEntity.getPromoCode();
            z65.e(promoCode);
            AppliedInfoEntity appliedInfo4 = dataPromoCodeEntity.getAppliedInfo();
            z65.e(appliedInfo4);
            String description = appliedInfo4.getDescription();
            z65.e(description);
            return new op8(promoCode, 0, "", "", "", description, eq8.c);
        }
        return op8.h.a();
    }
}

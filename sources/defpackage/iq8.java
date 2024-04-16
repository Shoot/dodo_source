package defpackage;

import com.dodopizza.persistence.entity.cart.PersonalPromoActionEntity;
import kotlin.Metadata;
/* compiled from: promoaction_convertions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;", "promoAction", "Lw18;", "a", "Leq8;", "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: iq8  reason: default package */
/* loaded from: classes4.dex */
public final class iq8 {
    public static final w18 a(PersonalPromoActionEntity personalPromoActionEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        if (personalPromoActionEntity != null) {
            str = personalPromoActionEntity.getId();
        } else {
            str = null;
        }
        if (str == null) {
            return w18.h.a();
        }
        String str5 = (String) mh5.b(personalPromoActionEntity.getId(), "Can`t be null");
        String title = personalPromoActionEntity.getTitle();
        if (title == null) {
            str2 = "";
        } else {
            str2 = title;
        }
        String description = personalPromoActionEntity.getDescription();
        if (description == null) {
            str3 = "";
        } else {
            str3 = description;
        }
        String errorMessage = personalPromoActionEntity.getErrorMessage();
        if (errorMessage == null) {
            str4 = "";
        } else {
            str4 = errorMessage;
        }
        return new w18(str5, 0, "", str2, str3, str4, b(personalPromoActionEntity));
    }

    private static final eq8 b(PersonalPromoActionEntity personalPromoActionEntity) {
        int status = personalPromoActionEntity.getStatus();
        if (status != 1) {
            if (status != 2) {
                return eq8.c;
            }
            return eq8.b;
        }
        return eq8.a;
    }
}

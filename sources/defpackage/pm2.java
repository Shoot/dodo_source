package defpackage;

import com.dodopizza.persistence.entity.cart.AppliedBonusActionEntity;
import io.realm.k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: databonusactiontransforms.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\b"}, d2 = {"Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/cart/AppliedBonusActionEntity;", "appliedBonusActionEntities", "", "Lce0;", "b", "appliedBonusActionEntity", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: pm2  reason: default package */
/* loaded from: classes4.dex */
public final class pm2 {
    public static final ce0 a(AppliedBonusActionEntity appliedBonusActionEntity) {
        String str;
        String str2;
        z65.h(appliedBonusActionEntity, "appliedBonusActionEntity");
        String externalId = appliedBonusActionEntity.getExternalId();
        if (externalId == null) {
            str = "";
        } else {
            str = externalId;
        }
        String title = appliedBonusActionEntity.getTitle();
        if (title == null) {
            str2 = "";
        } else {
            str2 = title;
        }
        String description = appliedBonusActionEntity.getDescription();
        if (description == null) {
            description = "";
        }
        return new ce0(str, str2, description, "", new xp(yp.c, ""));
    }

    public static final List<ce0> b(k0<AppliedBonusActionEntity> k0Var) {
        ArrayList arrayList = new ArrayList();
        if (k0Var != null) {
            for (AppliedBonusActionEntity appliedBonusActionEntity : k0Var) {
                z65.e(appliedBonusActionEntity);
                arrayList.add(a(appliedBonusActionEntity));
            }
        }
        return arrayList;
    }
}

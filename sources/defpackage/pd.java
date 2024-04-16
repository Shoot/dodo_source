package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: AnalyticsProduct.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"Lbc;", "Lod;", "item", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: pd  reason: default package */
/* loaded from: classes4.dex */
public final class pd {
    public static final bc a(bc bcVar, od odVar) {
        z65.h(bcVar, "<this>");
        z65.h(odVar, "item");
        bc.e(bcVar, ShoppingInfoEntity.FIELD_PRODUCT_ID, odVar.c(), false, 4, null);
        bc.e(bcVar, Action.NAME_ATTRIBUTE, odVar.d(), false, 4, null);
        bc.e(bcVar, "price", odVar.e(), false, 4, null);
        bc.e(bcVar, "currency", odVar.b(), false, 4, null);
        bc.e(bcVar, "quantity", odVar.f(), false, 4, null);
        bc.e(bcVar, "category", odVar.a(), false, 4, null);
        bc.e(bcVar, "variant", odVar.g(), false, 4, null);
        return bcVar;
    }
}

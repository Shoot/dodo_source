package defpackage;

import com.dodopizza.persistence.entity.MoneyType;
import kotlin.Metadata;
/* compiled from: moneytransforms.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0004"}, d2 = {"Lhn6;", "Lcom/dodopizza/persistence/entity/MoneyType;", "a", "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: wn6  reason: default package */
/* loaded from: classes4.dex */
public final class wn6 {
    public static final MoneyType a(hn6 hn6Var) {
        z65.h(hn6Var, "<this>");
        return new MoneyType(hn6Var.c(), hn6Var.a());
    }

    public static final hn6 b(MoneyType moneyType) {
        z65.h(moneyType, "<this>");
        return new hn6(moneyType.getAmount(), moneyType.getCurrency());
    }
}

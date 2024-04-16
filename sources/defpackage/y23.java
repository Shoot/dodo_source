package defpackage;

import com.dodopizza.persistence.entity.cart.DiscountEntity;
import com.dodopizza.persistence.entity.cart.PersonalPriceDiscountEntity;
import kotlin.Metadata;
/* compiled from: DiscountConverter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Ly23;", "Lx23;", "Lcom/dodopizza/persistence/entity/cart/DiscountEntity;", "entity", "Lv23;", "b", "model", "a", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y23  reason: default package */
/* loaded from: classes4.dex */
public final class y23 implements x23 {
    private final hq3 a;

    public y23(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    @Override // defpackage.x23
    public DiscountEntity a(v23 v23Var) {
        PersonalPriceDiscountEntity personalPriceDiscountEntity;
        z65.h(v23Var, "model");
        String b = v23Var.b();
        String f = v23Var.f();
        String c = v23Var.c();
        double a = v23Var.a().a();
        long d = v23Var.d();
        n18 e = v23Var.e();
        if (e != null) {
            personalPriceDiscountEntity = new PersonalPriceDiscountEntity(e.a());
        } else {
            personalPriceDiscountEntity = null;
        }
        return new DiscountEntity(b, f, c, a, d, personalPriceDiscountEntity);
    }

    @Override // defpackage.x23
    public v23 b(DiscountEntity discountEntity) {
        z65.h(discountEntity, "entity");
        n18 n18Var = null;
        if (discountEntity.getPersonalPriceDiscount() != null && !this.a.a(bq3.v5)) {
            return null;
        }
        String bonusActionId = discountEntity.getBonusActionId();
        if (bonusActionId == null) {
            bonusActionId = "";
        }
        String str = bonusActionId;
        String title = discountEntity.getTitle();
        String description = discountEntity.getDescription();
        hn6 b = kn6.c.b(discountEntity.getAmount());
        long loyaltyCoinsUsed = discountEntity.getLoyaltyCoinsUsed();
        PersonalPriceDiscountEntity personalPriceDiscount = discountEntity.getPersonalPriceDiscount();
        if (personalPriceDiscount != null) {
            n18Var = new n18(personalPriceDiscount.getEndDateTimeUtc());
        }
        return new v23(str, title, description, b, loyaltyCoinsUsed, n18Var);
    }
}

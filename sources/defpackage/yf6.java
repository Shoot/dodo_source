package defpackage;

import com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity;
import defpackage.fda;
import kotlin.Metadata;
/* compiled from: MenuPersonalPriceInfoConverter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lyf6;", "Lxf6;", "Lcom/dodopizza/persistence/entity/personalization/MenuPersonalPriceInfoEntity;", "entity", "Lvf6;", "a", "Lfda;", "Lfda;", "serverDateTimeParser", "<init>", "(Lfda;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yf6  reason: default package */
/* loaded from: classes4.dex */
public final class yf6 implements xf6 {
    private final fda a;

    public yf6(fda fdaVar) {
        z65.h(fdaVar, "serverDateTimeParser");
        this.a = fdaVar;
    }

    @Override // defpackage.xf6
    public vf6 a(MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity) {
        z65.h(menuPersonalPriceInfoEntity, "entity");
        String productId = menuPersonalPriceInfoEntity.getProductId();
        kn6 kn6Var = kn6.c;
        return new vf6(productId, kn6Var.b(menuPersonalPriceInfoEntity.getRawPrice()), kn6Var.b(menuPersonalPriceInfoEntity.getDiscountedPrice()), menuPersonalPriceInfoEntity.getDiscount(), z23.b.a(menuPersonalPriceInfoEntity.getDiscountMode()), fda.a.a(this.a, menuPersonalPriceInfoEntity.getEndDateTimeUtc(), null, 2, null), menuPersonalPriceInfoEntity.getPriority(), menuPersonalPriceInfoEntity.getMenuCategoryId());
    }
}

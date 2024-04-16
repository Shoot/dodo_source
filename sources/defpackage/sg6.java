package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dto.ProductSchemesDto;
/* compiled from: MenuProductsConverterFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lsg6;", "Lrg6;", "Lru/dodopizza/backend/domain/menu/dto/ProductSchemesDto;", "productSchemes", "Lqg6;", "a", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sg6  reason: default package */
/* loaded from: classes4.dex */
public final class sg6 implements rg6 {
    private final hq3 a;

    public sg6(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    @Override // defpackage.rg6
    public qg6 a(ProductSchemesDto productSchemesDto) {
        z65.h(productSchemesDto, "productSchemes");
        return new tg6(new hna(productSchemesDto.getSizeSchemes()), new y63(productSchemesDto.getDoughSchemes()), this.a.a(bq3.j6));
    }
}

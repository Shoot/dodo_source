package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.dn9;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.common.ImageUrls;
import ru.dodopizza.backend.domain.controlling.RnDigitalApi;
import ru.dodopizza.backend.domain.controlling.dto.RnDigitalLinkDto;
import ru.dodopizza.backend.domain.controlling.dto.RnDigitalLinkRequestDto;
/* compiled from: RnDigitalServiceImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lfn9;", "Len9;", "", "orderUuid", "Ldn9;", c.a, "Lru/dodopizza/backend/domain/controlling/dto/RnDigitalLinkDto;", "", "transparent", "b", "orderId", "a", "Lru/dodopizza/backend/domain/controlling/RnDigitalApi;", "Lru/dodopizza/backend/domain/controlling/RnDigitalApi;", "rnDigitalApi", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lru/dodopizza/backend/domain/controlling/RnDigitalApi;Lhq3;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fn9  reason: default package */
/* loaded from: classes.dex */
public final class fn9 implements en9 {
    private final RnDigitalApi a;
    private final hq3 b;

    public fn9(RnDigitalApi rnDigitalApi, hq3 hq3Var) {
        z65.h(rnDigitalApi, "rnDigitalApi");
        z65.h(hq3Var, "featureService");
        this.a = rnDigitalApi;
        this.b = hq3Var;
    }

    private final String b(RnDigitalLinkDto rnDigitalLinkDto, boolean z) {
        String productImageUrl;
        if (z) {
            ImageUrls productImageUrls = rnDigitalLinkDto.getProductImageUrls();
            if (productImageUrls != null) {
                productImageUrl = productImageUrls.getWebp();
            } else {
                productImageUrl = null;
            }
        } else {
            productImageUrl = rnDigitalLinkDto.getProductImageUrl();
        }
        if (productImageUrl == null) {
            return "";
        }
        return productImageUrl;
    }

    private final dn9 c(String str) {
        RnDigitalLinkDto rnDigitalLink = this.a.getRnDigitalLink(new RnDigitalLinkRequestDto(str));
        if (rnDigitalLink.getShowCheckup()) {
            boolean a = this.b.a(bq3.j6);
            String formLink = rnDigitalLink.getFormLink();
            z65.e(formLink);
            String title = rnDigitalLink.getTitle();
            z65.e(title);
            return new dn9.a(formLink, title, b(rnDigitalLink, a));
        }
        return dn9.b.a;
    }

    @Override // defpackage.en9
    public dn9 a(String str) {
        String F;
        z65.h(str, "orderId");
        F = l0b.F(str, "-", "", false, 4, null);
        return c(F);
    }
}

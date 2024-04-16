package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.common.ImageUrls;
import ru.dodopizza.backend.domain.covid.CovidApi;
import ru.dodopizza.backend.domain.covid.CovidWarningInfoDto;
/* compiled from: CovidService.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0019"}, d2 = {"Lzz1;", "Lyz1;", "Ld02;", c.a, "Lru/dodopizza/backend/domain/covid/CovidWarningInfoDto;", "", "isTransparentImageUrlEnabled", DateTokenConverter.CONVERTER_KEY, "transparent", "", "b", "a", "Lru/dodopizza/backend/domain/covid/CovidApi;", "Lru/dodopizza/backend/domain/covid/CovidApi;", "covidApi", "Ldt5;", "Ldt5;", "locality", "Lhq3;", "Lhq3;", "featureService", "Ld02;", "covidWarningInfo", "<init>", "(Lru/dodopizza/backend/domain/covid/CovidApi;Ldt5;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zz1  reason: default package */
/* loaded from: classes4.dex */
public final class zz1 implements yz1 {
    private final CovidApi a;
    private final dt5 b;
    private final hq3 c;
    private d02 d;

    public zz1(CovidApi covidApi, dt5 dt5Var, hq3 hq3Var) {
        z65.h(covidApi, "covidApi");
        z65.h(dt5Var, "locality");
        z65.h(hq3Var, "featureService");
        this.a = covidApi;
        this.b = dt5Var;
        this.c = hq3Var;
    }

    private final String b(CovidWarningInfoDto covidWarningInfoDto, boolean z) {
        ImageUrls imageUrls;
        String webp;
        if (!z || (imageUrls = covidWarningInfoDto.getImageUrls()) == null || (webp = imageUrls.getWebp()) == null) {
            return covidWarningInfoDto.getImageUrl();
        }
        return webp;
    }

    private final d02 c() {
        d02 d = d(this.a.getCovidWarningInfo(this.b.d()), this.c.a(bq3.j6));
        this.d = d;
        return d;
    }

    private final d02 d(CovidWarningInfoDto covidWarningInfoDto, boolean z) {
        return new d02(covidWarningInfoDto.getTitle(), covidWarningInfoDto.getText(), b(covidWarningInfoDto, z), covidWarningInfoDto.getCheckoutText());
    }

    @Override // defpackage.yz1
    public d02 a() {
        d02 d02Var = this.d;
        if (d02Var == null) {
            return c();
        }
        return d02Var;
    }
}

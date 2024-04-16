package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.checkout.dto.CheckoutInfoDto;
import ru.dodopizza.backend.domain.checkout.dto.DeferredIntervalCommentDto;
import ru.dodopizza.backend.domain.checkout.dto.DeferredIntervalItemDto;
import ru.dodopizza.backend.domain.checkout.dto.DeferredIntervalsV1Dto;
/* compiled from: CheckoutInfoConverter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lb51;", "", "Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalsV1Dto;", RemoteMessageConst.FROM, "", "isCarryout", "Lns2;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalItemDto;", "Lls2;", c.a, "Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalCommentDto;", "Ljs2;", "b", "Lru/dodopizza/backend/domain/checkout/dto/CheckoutInfoDto;", "La51;", "a", "Lpgb;", "Lpgb;", "dateTimeParser", "<init>", "(Lpgb;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b51  reason: default package */
/* loaded from: classes4.dex */
public final class b51 {
    private final pgb a;

    public b51(pgb pgbVar) {
        z65.h(pgbVar, "dateTimeParser");
        this.a = pgbVar;
    }

    private final js2 b(DeferredIntervalCommentDto deferredIntervalCommentDto) {
        return new js2(deferredIntervalCommentDto.getText());
    }

    private final ls2 c(DeferredIntervalItemDto deferredIntervalItemDto, boolean z) {
        Long l;
        js2 js2Var;
        String title = deferredIntervalItemDto.getTitle();
        String deferredTime = deferredIntervalItemDto.getDeferredTime();
        if (deferredTime != null) {
            l = Long.valueOf(this.a.a(deferredTime));
        } else {
            l = null;
        }
        DeferredIntervalCommentDto comment = deferredIntervalItemDto.getComment();
        if (comment != null) {
            js2Var = b(comment);
        } else {
            js2Var = null;
        }
        return new ls2(title, l, js2Var, deferredIntervalItemDto.getDisabled(), deferredIntervalItemDto.getSuggested(), z);
    }

    private final ns2 d(DeferredIntervalsV1Dto deferredIntervalsV1Dto, boolean z) {
        int w;
        String information = deferredIntervalsV1Dto.getInformation();
        List<DeferredIntervalItemDto> items = deferredIntervalsV1Dto.getItems();
        w = lc1.w(items, 10);
        ArrayList arrayList = new ArrayList(w);
        for (DeferredIntervalItemDto deferredIntervalItemDto : items) {
            arrayList.add(c(deferredIntervalItemDto, z));
        }
        return new ns2(information, arrayList);
    }

    public final a51 a(CheckoutInfoDto checkoutInfoDto, boolean z) {
        z65.h(checkoutInfoDto, RemoteMessageConst.FROM);
        return new a51(d(checkoutInfoDto.getDeferredIntervalsV1(), z));
    }
}

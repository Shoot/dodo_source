package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.controlling.OrderRatingAPI;
import ru.dodopizza.backend.domain.controlling.dto.SuggestedTipDto;
import ru.dodopizza.backend.domain.controlling.dto.TipsOptionDto;
/* compiled from: CourierTipsServiceImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Luz1;", "Ltz1;", "", "orderId", "Lsz1;", "a", "Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;", "Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;", "orderRatingAPI", "<init>", "(Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uz1  reason: default package */
/* loaded from: classes.dex */
public final class uz1 implements tz1 {
    private final OrderRatingAPI a;

    public uz1(OrderRatingAPI orderRatingAPI) {
        z65.h(orderRatingAPI, "orderRatingAPI");
        this.a = orderRatingAPI;
    }

    @Override // defpackage.tz1
    public sz1 a(String str) {
        String str2;
        String str3;
        String str4;
        int w;
        z65.h(str, "orderId");
        try {
            TipsOptionDto tipsOptions = this.a.getTipsOptions(str);
            boolean isAvailable = tipsOptions.isAvailable();
            String payTipsUrl = tipsOptions.getPayTipsUrl();
            if (payTipsUrl == null) {
                str2 = "";
            } else {
                str2 = payTipsUrl;
            }
            String successRedirectUrl = tipsOptions.getSuccessRedirectUrl();
            if (successRedirectUrl == null) {
                str3 = "";
            } else {
                str3 = successRedirectUrl;
            }
            String failureRedirectUrl = tipsOptions.getFailureRedirectUrl();
            if (failureRedirectUrl == null) {
                str4 = "";
            } else {
                str4 = failureRedirectUrl;
            }
            List<SuggestedTipDto> suggestedTips = tipsOptions.getSuggestedTips();
            w = lc1.w(suggestedTips, 10);
            ArrayList arrayList = new ArrayList(w);
            for (SuggestedTipDto suggestedTipDto : suggestedTips) {
                arrayList.add(new v1b(suggestedTipDto.getAmount(), suggestedTipDto.getPredefinedUrl()));
            }
            return new sz1(isAvailable, str2, str3, str4, arrayList);
        } catch (Exception unused) {
            return sz1.f.a();
        }
    }
}

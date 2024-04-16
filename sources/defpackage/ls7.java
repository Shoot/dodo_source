package defpackage;

import defpackage.zt9;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.payment.dto.sber.PayBySberPayResponseDto;
/* compiled from: PayBySberPayResponseDtoMapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lls7;", "", "Lru/dodopizza/backend/domain/payment/dto/sber/PayBySberPayResponseDto;", "responseDto", "Lzt9;", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ls7  reason: default package */
/* loaded from: classes2.dex */
public final class ls7 {
    public final zt9 a(PayBySberPayResponseDto payBySberPayResponseDto) {
        boolean y;
        z65.h(payBySberPayResponseDto, "responseDto");
        if (!payBySberPayResponseDto.isSuccess()) {
            return zt9.a.a;
        }
        String sberAppDeepLink = payBySberPayResponseDto.getSberAppDeepLink();
        if (sberAppDeepLink != null) {
            y = l0b.y(sberAppDeepLink);
            if (!y) {
                return new zt9.b(sberAppDeepLink);
            }
            throw new IllegalArgumentException("SberPay deep link is invalid".toString());
        }
        throw new IllegalArgumentException("SberPay deep link is missing".toString());
    }
}

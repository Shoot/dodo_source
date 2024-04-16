package defpackage;

import defpackage.tm;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.payment.dto.app2app.PayByApp2AppResponseDto;
/* compiled from: PayByApp2AppResponseDtoMapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lks7;", "", "Lru/dodopizza/backend/domain/payment/dto/app2app/PayByApp2AppResponseDto;", "responseDto", "Ltm;", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ks7  reason: default package */
/* loaded from: classes2.dex */
public final class ks7 {
    public final tm a(PayByApp2AppResponseDto payByApp2AppResponseDto) {
        boolean y;
        z65.h(payByApp2AppResponseDto, "responseDto");
        if (!payByApp2AppResponseDto.isSuccess()) {
            return tm.a.a;
        }
        String deepLink = payByApp2AppResponseDto.getDeepLink();
        if (deepLink != null) {
            y = l0b.y(deepLink);
            if (!y) {
                return new tm.b(deepLink);
            }
            throw new IllegalArgumentException("App2App deep link is invalid".toString());
        }
        throw new IllegalArgumentException("App2App deep link is missing".toString());
    }
}

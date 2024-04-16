package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.jw7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.backend.domain.order.dto.BrowserInfoDto;
import ru.dodopizza.backend.domain.order.dto.DeliveryInfoDto;
import ru.dodopizza.backend.domain.order.dto.PaymentInfoDto;
import ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto;
import ru.dodopizza.backend.domain.state.dto.PackageTypeDto;
/* compiled from: OrderManagerMapping.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005H\u0002\u001a\n\u0010\n\u001a\u00020\t*\u00020\b\u001a\n\u0010\r\u001a\u00020\f*\u00020\u000b¨\u0006\u000e"}, d2 = {"Lhx2;", "Ljgb;", "timeFormatter", "Lru/dodopizza/backend/domain/order/dto/DeliveryInfoDto;", "b", "Lxo7;", "Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", DateTokenConverter.CONVERTER_KEY, "Lct7;", "Lru/dodopizza/backend/domain/order/dto/PaymentInfoDto;", c.a, "Lv13;", "Lru/dodopizza/backend/domain/order/dto/BrowserInfoDto;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: kg7  reason: default package */
/* loaded from: classes4.dex */
public final class kg7 {

    /* compiled from: OrderManagerMapping.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kg7$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[xo7.values().length];
            try {
                iArr[xo7.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xo7.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xo7.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BrowserInfoDto a(v13 v13Var) {
        z65.h(v13Var, "<this>");
        return new BrowserInfoDto(v13Var.a(), v13Var.c(), v13Var.b(), v13Var.d(), v13Var.e(), v13Var.f(), v13Var.g());
    }

    public static final DeliveryInfoDto b(hx2 hx2Var, jgb jgbVar) {
        DeliveryAddressDto deliveryAddressDto;
        String str;
        z65.h(hx2Var, "<this>");
        z65.h(jgbVar, "timeFormatter");
        int i = hx2Var.c().i();
        w6 a2 = hx2Var.a();
        if (a2 != null) {
            deliveryAddressDto = j9.a(a2);
        } else {
            deliveryAddressDto = null;
        }
        String e = hx2Var.e();
        Long b = hx2Var.b();
        if (b != null) {
            str = jgbVar.a(b.longValue());
        } else {
            str = null;
        }
        return new DeliveryInfoDto(i, deliveryAddressDto, e, str, hx2Var.g(), hx2Var.f(), d(hx2Var.d()));
    }

    public static final PaymentInfoDto c(ct7 ct7Var) {
        jw7.g gVar;
        String str;
        p60 i;
        z65.h(ct7Var, "<this>");
        int i2 = ct7Var.b().c().i();
        jw7 b = ct7Var.b();
        Double d = null;
        if (b instanceof jw7.g) {
            gVar = (jw7.g) b;
        } else {
            gVar = null;
        }
        if (gVar != null && (i = gVar.i()) != null) {
            str = i.getId();
        } else {
            str = null;
        }
        hn6 a2 = ct7Var.a();
        if (a2 != null) {
            d = Double.valueOf(a2.a());
        }
        return new PaymentInfoDto(i2, str, d);
    }

    private static final PackageTypeDto d(xo7 xo7Var) {
        int i = a.$EnumSwitchMapping$0[xo7Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return PackageTypeDto.REUSABLE;
        }
        return PackageTypeDto.DISPOSABLE;
    }
}

package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.payment.core.network.dto.PaymentStatusDto;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AbstractIterator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lzta;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: zta  reason: default package */
/* loaded from: classes3.dex */
final class zta {
    public static final zta a = new zta("Ready", 0);
    public static final zta b = new zta("NotReady", 1);
    public static final zta c = new zta("Done", 2);
    public static final zta d = new zta(PaymentStatusDto.PAYMENT_STATUS_FAILED, 3);
    private static final /* synthetic */ zta[] e;
    private static final /* synthetic */ kj3 f;

    static {
        zta[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private zta(String str, int i) {
    }

    private static final /* synthetic */ zta[] a() {
        return new zta[]{a, b, c, d};
    }

    public static zta valueOf(String str) {
        return (zta) Enum.valueOf(zta.class, str);
    }

    public static zta[] values() {
        return (zta[]) e.clone();
    }
}

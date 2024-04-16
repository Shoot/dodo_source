package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaidOrderState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Llp7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lp7  reason: default package */
/* loaded from: classes4.dex */
public final class lp7 {
    public static final lp7 a = new lp7("OK", 0);
    public static final lp7 b = new lp7("ALMOST_OK", 1);
    public static final lp7 c = new lp7("FAILURE", 2);
    public static final lp7 d = new lp7("PAYMENT_FAILURE", 3);
    private static final /* synthetic */ lp7[] e;
    private static final /* synthetic */ kj3 f;

    static {
        lp7[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private lp7(String str, int i) {
    }

    private static final /* synthetic */ lp7[] a() {
        return new lp7[]{a, b, c, d};
    }

    public static lp7 valueOf(String str) {
        return (lp7) Enum.valueOf(lp7.class, str);
    }

    public static lp7[] values() {
        return (lp7[]) e.clone();
    }
}

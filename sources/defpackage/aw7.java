package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Law7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: aw7  reason: default package */
/* loaded from: classes4.dex */
public final class aw7 {
    public static final aw7 a = new aw7("FAILURE", 0);
    public static final aw7 b = new aw7("TEMPORARY_UNAVAILABLE", 1);
    public static final aw7 c = new aw7("CHECK", 2);
    public static final aw7 d = new aw7("CANCEL", 3);
    private static final /* synthetic */ aw7[] e;
    private static final /* synthetic */ kj3 f;

    static {
        aw7[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private aw7(String str, int i) {
    }

    private static final /* synthetic */ aw7[] a() {
        return new aw7[]{a, b, c, d};
    }

    public static aw7 valueOf(String str) {
        return (aw7) Enum.valueOf(aw7.class, str);
    }

    public static aw7[] values() {
        return (aw7[]) e.clone();
    }
}

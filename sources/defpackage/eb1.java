package defpackage;

import java.math.RoundingMode;
import java.text.NumberFormat;
import kotlin.Metadata;
/* compiled from: CoinsFormatter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Leb1;", "", "", "number", "", "a", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "b", "Ljava/text/NumberFormat;", "formatter", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eb1  reason: default package */
/* loaded from: classes3.dex */
public final class eb1 {
    public static final eb1 a = new eb1();
    private static final NumberFormat b;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setRoundingMode(RoundingMode.FLOOR);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(0);
        b = numberFormat;
    }

    private eb1() {
    }

    public final String a(double d) {
        String format = b.format(d);
        z65.g(format, "format(...)");
        return format;
    }
}

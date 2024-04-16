package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderRatingStrings.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lv69;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v69  reason: default package */
/* loaded from: classes.dex */
public final class v69 {
    public static final v69 a = new v69("BINARY_FEEDBACK_TITLE", 0);
    public static final v69 b = new v69("RATE_ORDER_TITLE", 1);
    public static final v69 c = new v69("ORDER_RATING_TITLE", 2);
    private static final /* synthetic */ v69[] d;
    private static final /* synthetic */ kj3 e;

    static {
        v69[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private v69(String str, int i) {
    }

    private static final /* synthetic */ v69[] a() {
        return new v69[]{a, b, c};
    }

    public static v69 valueOf(String str) {
        return (v69) Enum.valueOf(v69.class, str);
    }

    public static v69[] values() {
        return (v69[]) d.clone();
    }
}

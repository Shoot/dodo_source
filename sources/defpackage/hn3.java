package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpectedPizzeriaType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lhn3;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hn3  reason: default package */
/* loaded from: classes2.dex */
public final class hn3 {
    public static final hn3 a = new hn3("CARRYOUT", 0);
    public static final hn3 b = new hn3("RESTAURANT_OR_CARRYOUT", 1);
    public static final hn3 c = new hn3("ALL", 2);
    private static final /* synthetic */ hn3[] d;
    private static final /* synthetic */ kj3 e;

    static {
        hn3[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private hn3(String str, int i) {
    }

    private static final /* synthetic */ hn3[] a() {
        return new hn3[]{a, b, c};
    }

    public static hn3 valueOf(String str) {
        return (hn3) Enum.valueOf(hn3.class, str);
    }

    public static hn3[] values() {
        return (hn3[]) d.clone();
    }
}

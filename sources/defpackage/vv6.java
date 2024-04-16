package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkAvailabilityState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lvv6;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vv6  reason: default package */
/* loaded from: classes3.dex */
public final class vv6 {
    public static final vv6 a = new vv6("AVAILABLE", 0);
    public static final vv6 b = new vv6("NOT_AVAILABLE", 1);
    public static final vv6 c = new vv6("RESTORED", 2);
    private static final /* synthetic */ vv6[] d;
    private static final /* synthetic */ kj3 e;

    static {
        vv6[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private vv6(String str, int i) {
    }

    private static final /* synthetic */ vv6[] a() {
        return new vv6[]{a, b, c};
    }

    public static vv6 valueOf(String str) {
        return (vv6) Enum.valueOf(vv6.class, str);
    }

    public static vv6[] values() {
        return (vv6[]) d.clone();
    }
}

package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PackageType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lxo7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: xo7  reason: default package */
/* loaded from: classes.dex */
public final class xo7 {
    public static final xo7 a = new xo7("DISPOSABLE", 0);
    public static final xo7 b = new xo7("REUSABLE", 1);
    public static final xo7 c = new xo7(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
    private static final /* synthetic */ xo7[] d;
    private static final /* synthetic */ kj3 e;

    static {
        xo7[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private xo7(String str, int i) {
    }

    private static final /* synthetic */ xo7[] a() {
        return new xo7[]{a, b, c};
    }

    public static xo7 valueOf(String str) {
        return (xo7) Enum.valueOf(xo7.class, str);
    }

    public static xo7[] values() {
        return (xo7[]) d.clone();
    }
}

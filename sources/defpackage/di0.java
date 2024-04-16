package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapAddressStateVO.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ldi0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: di0  reason: default package */
/* loaded from: classes2.dex */
public final class di0 {
    public static final di0 a = new di0("IDLE", 0);
    public static final di0 b = new di0("PROGRESS", 1);
    public static final di0 c = new di0("DISABLED", 2);
    private static final /* synthetic */ di0[] d;
    private static final /* synthetic */ kj3 e;

    static {
        di0[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private di0(String str, int i) {
    }

    private static final /* synthetic */ di0[] a() {
        return new di0[]{a, b, c};
    }

    public static di0 valueOf(String str) {
        return (di0) Enum.valueOf(di0.class, str);
    }

    public static di0[] values() {
        return (di0[]) d.clone();
    }
}

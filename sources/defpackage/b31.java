package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiCheckService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lb31;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b31  reason: default package */
/* loaded from: classes4.dex */
public final class b31 {
    public static final b31 a = new b31("SUCCESS", 0);
    public static final b31 b = new b31("INITIALISAION_ERROR", 1);
    public static final b31 c = new b31("NEED_UPDATE", 2);
    private static final /* synthetic */ b31[] d;
    private static final /* synthetic */ kj3 e;

    static {
        b31[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private b31(String str, int i) {
    }

    private static final /* synthetic */ b31[] a() {
        return new b31[]{a, b, c};
    }

    public static b31 valueOf(String str) {
        return (b31) Enum.valueOf(b31.class, str);
    }

    public static b31[] values() {
        return (b31[]) d.clone();
    }
}

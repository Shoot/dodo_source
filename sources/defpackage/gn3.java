package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpectedPizzeriaType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lgn3;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gn3  reason: default package */
/* loaded from: classes4.dex */
public final class gn3 {
    public static final gn3 a = new gn3("CARRYOUT", 0);
    public static final gn3 b = new gn3("RESTAURANT_OR_CARRYOUT", 1);
    public static final gn3 c = new gn3("ALL", 2);
    private static final /* synthetic */ gn3[] d;
    private static final /* synthetic */ kj3 e;

    static {
        gn3[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private gn3(String str, int i) {
    }

    private static final /* synthetic */ gn3[] a() {
        return new gn3[]{a, b, c};
    }

    public static gn3 valueOf(String str) {
        return (gn3) Enum.valueOf(gn3.class, str);
    }

    public static gn3[] values() {
        return (gn3[]) d.clone();
    }
}

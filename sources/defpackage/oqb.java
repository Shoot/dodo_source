package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnexpectedStateStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Loqb;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oqb  reason: default package */
/* loaded from: classes4.dex */
public final class oqb {
    public static final oqb a = new oqb("ORDER_PLACED", 0);
    public static final oqb b = new oqb("ORDER_PAID", 1);
    public static final oqb c = new oqb("ORDER_PLACE_FAILED", 2);
    private static final /* synthetic */ oqb[] d;
    private static final /* synthetic */ kj3 e;

    static {
        oqb[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private oqb(String str, int i) {
    }

    private static final /* synthetic */ oqb[] a() {
        return new oqb[]{a, b, c};
    }

    public static oqb valueOf(String str) {
        return (oqb) Enum.valueOf(oqb.class, str);
    }

    public static oqb[] values() {
        return (oqb[]) d.clone();
    }
}

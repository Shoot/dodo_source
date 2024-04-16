package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GEOFlowScenario.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lha4;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ha4  reason: default package */
/* loaded from: classes2.dex */
public final class ha4 {
    public static final ha4 a = new ha4("FULL_ONBOARDING_SCENARIO", 0);
    public static final ha4 b = new ha4("DELIVERY_LOCATION_SCENARIO", 1);
    public static final ha4 c = new ha4("DELIVERY_LOCATION_WITHOUT_CHANGE_SCENARIO", 2);
    private static final /* synthetic */ ha4[] d;
    private static final /* synthetic */ kj3 e;

    static {
        ha4[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private ha4(String str, int i) {
    }

    private static final /* synthetic */ ha4[] a() {
        return new ha4[]{a, b, c};
    }

    public static ha4 valueOf(String str) {
        return (ha4) Enum.valueOf(ha4.class, str);
    }

    public static ha4[] values() {
        return (ha4[]) d.clone();
    }
}

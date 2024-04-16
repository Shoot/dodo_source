package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoyaltyHistoryOperation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lgb7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gb7  reason: default package */
/* loaded from: classes4.dex */
public final class gb7 {
    public static final gb7 a = new gb7("INCREASE", 0);
    public static final gb7 b = new gb7("DECREASE", 1);
    public static final gb7 c = new gb7("ROLLBACK", 2);
    private static final /* synthetic */ gb7[] d;
    private static final /* synthetic */ kj3 e;

    static {
        gb7[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private gb7(String str, int i) {
    }

    private static final /* synthetic */ gb7[] a() {
        return new gb7[]{a, b, c};
    }

    public static gb7 valueOf(String str) {
        return (gb7) Enum.valueOf(gb7.class, str);
    }

    public static gb7[] values() {
        return (gb7[]) d.clone();
    }
}

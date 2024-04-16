package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lni7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ni7  reason: default package */
/* loaded from: classes2.dex */
public final class ni7 {
    public static final ni7 a = new ni7("COMPLETED", 0);
    public static final ni7 b = new ni7("CANCELED", 1);
    private static final /* synthetic */ ni7[] c;
    private static final /* synthetic */ kj3 d;

    static {
        ni7[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private ni7(String str, int i) {
    }

    private static final /* synthetic */ ni7[] a() {
        return new ni7[]{a, b};
    }

    public static ni7 valueOf(String str) {
        return (ni7) Enum.valueOf(ni7.class, str);
    }

    public static ni7[] values() {
        return (ni7[]) c.clone();
    }
}

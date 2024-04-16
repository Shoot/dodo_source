package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lgw7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gw7  reason: default package */
/* loaded from: classes2.dex */
public final class gw7 {
    public static final gw7 a = new gw7("CREATED", 0);
    public static final gw7 b = new gw7("PENDING", 1);
    public static final gw7 c = new gw7("COMPLETED", 2);
    private static final /* synthetic */ gw7[] d;
    private static final /* synthetic */ kj3 e;

    static {
        gw7[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private gw7(String str, int i) {
    }

    private static final /* synthetic */ gw7[] a() {
        return new gw7[]{a, b, c};
    }

    public static gw7 valueOf(String str) {
        return (gw7) Enum.valueOf(gw7.class, str);
    }

    public static gw7[] values() {
        return (gw7[]) d.clone();
    }
}

package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MainScreenTab.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ln56;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n56  reason: default package */
/* loaded from: classes2.dex */
public final class n56 {
    public static final n56 a = new n56("MENU", 0);
    public static final n56 b = new n56("CONTACTS", 1);
    public static final n56 c = new n56("CART", 2);
    private static final /* synthetic */ n56[] d;
    private static final /* synthetic */ kj3 e;

    static {
        n56[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private n56(String str, int i) {
    }

    private static final /* synthetic */ n56[] a() {
        return new n56[]{a, b, c};
    }

    public static n56 valueOf(String str) {
        return (n56) Enum.valueOf(n56.class, str);
    }

    public static n56[] values() {
        return (n56[]) d.clone();
    }
}

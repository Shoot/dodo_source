package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderTypeSwitcherPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ley5;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ey5  reason: default package */
/* loaded from: classes2.dex */
public final class ey5 {
    public static final ey5 a = new ey5("LOGIN_FOR_DELIVERY", 0);
    public static final ey5 b = new ey5("LOGIN_FOR_RESTAURANT", 1);
    private static final /* synthetic */ ey5[] c;
    private static final /* synthetic */ kj3 d;

    static {
        ey5[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private ey5(String str, int i) {
    }

    private static final /* synthetic */ ey5[] a() {
        return new ey5[]{a, b};
    }

    public static ey5 valueOf(String str) {
        return (ey5) Enum.valueOf(ey5.class, str);
    }

    public static ey5[] values() {
        return (ey5[]) c.clone();
    }
}

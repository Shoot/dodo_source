package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CartButtonPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcq0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cq0  reason: default package */
/* loaded from: classes2.dex */
public final class cq0 {
    public static final cq0 a = new cq0("PINNED", 0);
    public static final cq0 b = new cq0("SCROLLABLE", 1);
    private static final /* synthetic */ cq0[] c;
    private static final /* synthetic */ kj3 d;

    static {
        cq0[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private cq0(String str, int i) {
    }

    private static final /* synthetic */ cq0[] a() {
        return new cq0[]{a, b};
    }

    public static cq0 valueOf(String str) {
        return (cq0) Enum.valueOf(cq0.class, str);
    }

    public static cq0[] values() {
        return (cq0[]) c.clone();
    }
}

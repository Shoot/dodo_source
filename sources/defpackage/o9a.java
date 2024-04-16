package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PizzeriaSelectionResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lo9a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o9a  reason: default package */
/* loaded from: classes2.dex */
public final class o9a {
    public static final o9a a = new o9a("CARRYOUT", 0);
    public static final o9a b = new o9a("RESTAURANT", 1);
    private static final /* synthetic */ o9a[] c;
    private static final /* synthetic */ kj3 d;

    static {
        o9a[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private o9a(String str, int i) {
    }

    private static final /* synthetic */ o9a[] a() {
        return new o9a[]{a, b};
    }

    public static o9a valueOf(String str) {
        return (o9a) Enum.valueOf(o9a.class, str);
    }

    public static o9a[] values() {
        return (o9a[]) c.clone();
    }
}

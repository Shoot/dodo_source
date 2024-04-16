package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MenuCategory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ly33;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y33  reason: default package */
/* loaded from: classes4.dex */
public final class y33 {
    public static final y33 a = new y33("REGULAR", 0);
    public static final y33 b = new y33("LOYALTY", 1);
    private static final /* synthetic */ y33[] c;
    private static final /* synthetic */ kj3 d;

    static {
        y33[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private y33(String str, int i) {
    }

    private static final /* synthetic */ y33[] a() {
        return new y33[]{a, b};
    }

    public static y33 valueOf(String str) {
        return (y33) Enum.valueOf(y33.class, str);
    }

    public static y33[] values() {
        return (y33[]) c.clone();
    }
}

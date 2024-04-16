package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectedPizzeriaType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ln9a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: n9a  reason: default package */
/* loaded from: classes4.dex */
public final class n9a {
    public static final n9a a = new n9a("CARRYOUT", 0);
    public static final n9a b = new n9a("RESTAURANT", 1);
    private static final /* synthetic */ n9a[] c;
    private static final /* synthetic */ kj3 d;

    static {
        n9a[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private n9a(String str, int i) {
    }

    private static final /* synthetic */ n9a[] a() {
        return new n9a[]{a, b};
    }

    public static n9a valueOf(String str) {
        return (n9a) Enum.valueOf(n9a.class, str);
    }

    public static n9a[] values() {
        return (n9a[]) c.clone();
    }
}

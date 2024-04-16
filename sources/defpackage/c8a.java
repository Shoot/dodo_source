package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectPizzeriaVOData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lc8a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: c8a  reason: default package */
/* loaded from: classes4.dex */
public final class c8a {
    public static final c8a a = new c8a("MAP", 0);
    public static final c8a b = new c8a("LIST", 1);
    private static final /* synthetic */ c8a[] c;
    private static final /* synthetic */ kj3 d;

    static {
        c8a[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private c8a(String str, int i) {
    }

    private static final /* synthetic */ c8a[] a() {
        return new c8a[]{a, b};
    }

    public static c8a valueOf(String str) {
        return (c8a) Enum.valueOf(c8a.class, str);
    }

    public static c8a[] values() {
        return (c8a[]) c.clone();
    }
}

package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapAddressStateVO.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lye0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ye0  reason: default package */
/* loaded from: classes2.dex */
public final class ye0 {
    public static final ye0 a = new ye0("EXPANDED", 0);
    public static final ye0 b = new ye0("HIDDEN", 1);
    private static final /* synthetic */ ye0[] c;
    private static final /* synthetic */ kj3 d;

    static {
        ye0[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private ye0(String str, int i) {
    }

    private static final /* synthetic */ ye0[] a() {
        return new ye0[]{a, b};
    }

    public static ye0 valueOf(String str) {
        return (ye0) Enum.valueOf(ye0.class, str);
    }

    public static ye0[] values() {
        return (ye0[]) c.clone();
    }
}

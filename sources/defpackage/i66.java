package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapAddressVO.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Li66;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i66  reason: default package */
/* loaded from: classes2.dex */
public final class i66 {
    public static final i66 a = new i66("ENTER_ADDRESS_MANUALLY", 0);
    public static final i66 b = new i66("CONFIRM", 1);
    private static final /* synthetic */ i66[] c;
    private static final /* synthetic */ kj3 d;

    static {
        i66[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private i66(String str, int i) {
    }

    private static final /* synthetic */ i66[] a() {
        return new i66[]{a, b};
    }

    public static i66 valueOf(String str) {
        return (i66) Enum.valueOf(i66.class, str);
    }

    public static i66[] values() {
        return (i66[]) c.clone();
    }
}

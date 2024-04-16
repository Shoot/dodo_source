package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MenuItemVO.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lhf6;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hf6  reason: default package */
/* loaded from: classes2.dex */
public final class hf6 {
    public static final hf6 a = new hf6("V4", 0);
    public static final hf6 b = new hf6("V5", 1);
    private static final /* synthetic */ hf6[] c;
    private static final /* synthetic */ kj3 d;

    static {
        hf6[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private hf6(String str, int i) {
    }

    private static final /* synthetic */ hf6[] a() {
        return new hf6[]{a, b};
    }

    public static hf6 valueOf(String str) {
        return (hf6) Enum.valueOf(hf6.class, str);
    }

    public static hf6[] values() {
        return (hf6[]) c.clone();
    }
}

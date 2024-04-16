package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionMapDeliveryVOData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lm8;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: m8  reason: default package */
/* loaded from: classes2.dex */
public final class m8 {
    public static final m8 a = new m8("OPENED", 0);
    public static final m8 b = new m8("CLOSED", 1);
    private static final /* synthetic */ m8[] c;
    private static final /* synthetic */ kj3 d;

    static {
        m8[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private m8(String str, int i) {
    }

    private static final /* synthetic */ m8[] a() {
        return new m8[]{a, b};
    }

    public static m8 valueOf(String str) {
        return (m8) Enum.valueOf(m8.class, str);
    }

    public static m8[] values() {
        return (m8[]) c.clone();
    }
}

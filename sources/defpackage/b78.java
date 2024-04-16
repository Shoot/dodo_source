package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PizzaConcept.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lb78;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b78  reason: default package */
/* loaded from: classes4.dex */
public final class b78 {
    public static final b78 a = new b78("TRADITIONAL", 0);
    public static final b78 b = new b78("ROMAN", 1);
    private static final /* synthetic */ b78[] c;
    private static final /* synthetic */ kj3 d;

    static {
        b78[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private b78(String str, int i) {
    }

    private static final /* synthetic */ b78[] a() {
        return new b78[]{a, b};
    }

    public static b78 valueOf(String str) {
        return (b78) Enum.valueOf(b78.class, str);
    }

    public static b78[] values() {
        return (b78[]) c.clone();
    }
}

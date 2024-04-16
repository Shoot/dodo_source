package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ComboTemplateConstructorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lgj1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gj1  reason: default package */
/* loaded from: classes4.dex */
public final class gj1 {
    public static final gj1 a = new gj1("PLANE", 0);
    public static final gj1 b = new gj1("CUSTOMIZE", 1);
    private static final /* synthetic */ gj1[] c;
    private static final /* synthetic */ kj3 d;

    static {
        gj1[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private gj1(String str, int i) {
    }

    private static final /* synthetic */ gj1[] a() {
        return new gj1[]{a, b};
    }

    public static gj1 valueOf(String str) {
        return (gj1) Enum.valueOf(gj1.class, str);
    }

    public static gj1[] values() {
        return (gj1[]) c.clone();
    }
}

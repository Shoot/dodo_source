package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectPizzeriaFragmentCheckoutWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lfn3;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fn3  reason: default package */
/* loaded from: classes4.dex */
public final class fn3 {
    public static final fn3 a = new fn3("CARRYOUT", 0);
    public static final fn3 b = new fn3("RESTAURANT_OR_CARRYOUT", 1);
    private static final /* synthetic */ fn3[] c;
    private static final /* synthetic */ kj3 d;

    static {
        fn3[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private fn3(String str, int i) {
    }

    private static final /* synthetic */ fn3[] a() {
        return new fn3[]{a, b};
    }

    public static fn3 valueOf(String str) {
        return (fn3) Enum.valueOf(fn3.class, str);
    }

    public static fn3[] values() {
        return (fn3[]) c.clone();
    }
}

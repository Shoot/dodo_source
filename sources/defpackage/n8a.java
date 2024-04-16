package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectPizzeriaSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ln8a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: n8a  reason: default package */
/* loaded from: classes4.dex */
public final class n8a {
    public static final n8a a = new n8a("MENU", 0);
    public static final n8a b = new n8a("CHECKOUT", 1);
    public static final n8a c = new n8a("ONBOARDING", 2);
    private static final /* synthetic */ n8a[] d;
    private static final /* synthetic */ kj3 e;

    static {
        n8a[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private n8a(String str, int i) {
    }

    private static final /* synthetic */ n8a[] a() {
        return new n8a[]{a, b, c};
    }

    public static n8a valueOf(String str) {
        return (n8a) Enum.valueOf(n8a.class, str);
    }

    public static n8a[] values() {
        return (n8a[]) d.clone();
    }
}

package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SectionItemTypeV5.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx2a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: x2a  reason: default package */
/* loaded from: classes.dex */
public final class x2a {
    public static final x2a a = new x2a("Unknown", 0);
    public static final x2a b = new x2a("MenuItem", 1);
    public static final x2a c = new x2a("Subsection", 2);
    private static final /* synthetic */ x2a[] d;
    private static final /* synthetic */ kj3 e;

    static {
        x2a[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private x2a(String str, int i) {
    }

    private static final /* synthetic */ x2a[] a() {
        return new x2a[]{a, b, c};
    }

    public static x2a valueOf(String str) {
        return (x2a) Enum.valueOf(x2a.class, str);
    }

    public static x2a[] values() {
        return (x2a[]) d.clone();
    }
}

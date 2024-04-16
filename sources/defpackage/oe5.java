package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVariance.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Loe5;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: oe5  reason: default package */
/* loaded from: classes3.dex */
public final class oe5 {
    public static final oe5 a = new oe5("INVARIANT", 0);
    public static final oe5 b = new oe5("IN", 1);
    public static final oe5 c = new oe5("OUT", 2);
    private static final /* synthetic */ oe5[] d;
    private static final /* synthetic */ kj3 e;

    static {
        oe5[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private oe5(String str, int i) {
    }

    private static final /* synthetic */ oe5[] a() {
        return new oe5[]{a, b, c};
    }

    public static oe5 valueOf(String str) {
        return (oe5) Enum.valueOf(oe5.class, str);
    }

    public static oe5[] values() {
        return (oe5[]) d.clone();
    }
}

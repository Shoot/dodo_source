package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsics.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lsx1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: sx1  reason: default package */
/* loaded from: classes3.dex */
public final class sx1 {
    public static final sx1 a = new sx1("COROUTINE_SUSPENDED", 0);
    public static final sx1 b = new sx1("UNDECIDED", 1);
    public static final sx1 c = new sx1("RESUMED", 2);
    private static final /* synthetic */ sx1[] d;
    private static final /* synthetic */ kj3 e;

    static {
        sx1[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private sx1(String str, int i) {
    }

    private static final /* synthetic */ sx1[] a() {
        return new sx1[]{a, b, c};
    }

    public static sx1 valueOf(String str) {
        return (sx1) Enum.valueOf(sx1.class, str);
    }

    public static sx1[] values() {
        return (sx1[]) d.clone();
    }
}

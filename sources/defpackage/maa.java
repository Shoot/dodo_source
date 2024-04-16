package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionMapSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lmaa;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: maa  reason: default package */
/* loaded from: classes2.dex */
public final class maa {
    public static final maa a = new maa("MENU", 0);
    public static final maa b = new maa("CHECKOUT", 1);
    public static final maa c = new maa("ONBOARDING", 2);
    private static final /* synthetic */ maa[] d;
    private static final /* synthetic */ kj3 e;

    static {
        maa[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private maa(String str, int i) {
    }

    private static final /* synthetic */ maa[] a() {
        return new maa[]{a, b, c};
    }

    public static maa valueOf(String str) {
        return (maa) Enum.valueOf(maa.class, str);
    }

    public static maa[] values() {
        return (maa[]) d.clone();
    }
}

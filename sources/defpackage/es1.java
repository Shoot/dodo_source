package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactMeSwitchType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Les1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: es1  reason: default package */
/* loaded from: classes.dex */
public final class es1 {
    public static final es1 a = new es1("IMPLICIT", 0);
    public static final es1 b = new es1("VIA_PHONE", 1);
    public static final es1 c = new es1("VIA_CHAT", 2);
    private static final /* synthetic */ es1[] d;
    private static final /* synthetic */ kj3 e;

    static {
        es1[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private es1(String str, int i) {
    }

    private static final /* synthetic */ es1[] a() {
        return new es1[]{a, b, c};
    }

    public static es1 valueOf(String str) {
        return (es1) Enum.valueOf(es1.class, str);
    }

    public static es1[] values() {
        return (es1[]) d.clone();
    }
}

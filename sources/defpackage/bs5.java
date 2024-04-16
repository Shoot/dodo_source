package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersonalOfferVO.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lbs5;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bs5  reason: default package */
/* loaded from: classes2.dex */
public final class bs5 {
    public static final bs5 a = new bs5("NONE", 0);
    public static final bs5 b = new bs5("APPLYING_STATE", 1);
    public static final bs5 c = new bs5("LOADING_STATE", 2);
    private static final /* synthetic */ bs5[] d;
    private static final /* synthetic */ kj3 e;

    static {
        bs5[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private bs5(String str, int i) {
    }

    private static final /* synthetic */ bs5[] a() {
        return new bs5[]{a, b, c};
    }

    public static bs5 valueOf(String str) {
        return (bs5) Enum.valueOf(bs5.class, str);
    }

    public static bs5[] values() {
        return (bs5[]) d.clone();
    }
}

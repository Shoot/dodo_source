package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShoppingCartVO.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lex2;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ex2  reason: default package */
/* loaded from: classes2.dex */
public final class ex2 {
    public static final ex2 a = new ex2("NORMAL", 0);
    public static final ex2 b = new ex2("INCREASED", 1);
    public static final ex2 c = new ex2("FREE", 2);
    private static final /* synthetic */ ex2[] d;
    private static final /* synthetic */ kj3 e;

    static {
        ex2[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private ex2(String str, int i) {
    }

    private static final /* synthetic */ ex2[] a() {
        return new ex2[]{a, b, c};
    }

    public static ex2 valueOf(String str) {
        return (ex2) Enum.valueOf(ex2.class, str);
    }

    public static ex2[] values() {
        return (ex2[]) d.clone();
    }
}

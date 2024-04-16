package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderRatingStrings.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lf69;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f69  reason: default package */
/* loaded from: classes.dex */
public final class f69 {
    public static final f69 a = new f69("BINARY_FEEDBACK_WAS_NOT_SENT", 0);
    public static final f69 b = new f69("RATING_WAS_NOT_SENT", 1);
    public static final f69 c = new f69("EMPTY_RATING", 2);
    private static final /* synthetic */ f69[] d;
    private static final /* synthetic */ kj3 e;

    static {
        f69[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private f69(String str, int i) {
    }

    private static final /* synthetic */ f69[] a() {
        return new f69[]{a, b, c};
    }

    public static f69 valueOf(String str) {
        return (f69) Enum.valueOf(f69.class, str);
    }

    public static f69[] values() {
        return (f69[]) d.clone();
    }
}

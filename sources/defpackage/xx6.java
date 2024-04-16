package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsAnalytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lxx6;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xx6  reason: default package */
/* loaded from: classes4.dex */
public final class xx6 {
    public static final xx6 b = new xx6("SUBSCRIBED", 0, "subscribed");
    public static final xx6 c = new xx6("UNSUBSCRIBED", 1, "unsubscribed");
    private static final /* synthetic */ xx6[] d;
    private static final /* synthetic */ kj3 e;
    private final String a;

    static {
        xx6[] a = a();
        d = a;
        e = lj3.a(a);
    }

    private xx6(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ xx6[] a() {
        return new xx6[]{b, c};
    }

    public static xx6 valueOf(String str) {
        return (xx6) Enum.valueOf(xx6.class, str);
    }

    public static xx6[] values() {
        return (xx6[]) d.clone();
    }

    public final String getValue() {
        return this.a;
    }
}

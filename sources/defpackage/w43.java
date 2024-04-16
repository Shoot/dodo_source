package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OtherAnalytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lw43;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w43  reason: default package */
/* loaded from: classes4.dex */
public final class w43 {
    public static final w43 b = new w43("ACCEPTED", 0, "correct");
    public static final w43 c = new w43("REJECTED", 1, "need update");
    private static final /* synthetic */ w43[] d;
    private static final /* synthetic */ kj3 e;
    private final String a;

    static {
        w43[] a = a();
        d = a;
        e = lj3.a(a);
    }

    private w43(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ w43[] a() {
        return new w43[]{b, c};
    }

    public static w43 valueOf(String str) {
        return (w43) Enum.valueOf(w43.class, str);
    }

    public static w43[] values() {
        return (w43[]) d.clone();
    }

    public final String getValue() {
        return this.a;
    }
}

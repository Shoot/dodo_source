package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OtherAnalytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lo98;", "", "", "a", "Z", "i", "()Z", "value", "<init>", "(Ljava/lang/String;IZ)V", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o98  reason: default package */
/* loaded from: classes4.dex */
public final class o98 {
    public static final o98 b = new o98("ACCEPTED", 0, true);
    public static final o98 c = new o98("REJECTED", 1, false);
    private static final /* synthetic */ o98[] d;
    private static final /* synthetic */ kj3 e;
    private final boolean a;

    static {
        o98[] a = a();
        d = a;
        e = lj3.a(a);
    }

    private o98(String str, int i, boolean z) {
        this.a = z;
    }

    private static final /* synthetic */ o98[] a() {
        return new o98[]{b, c};
    }

    public static o98 valueOf(String str) {
        return (o98) Enum.valueOf(o98.class, str);
    }

    public static o98[] values() {
        return (o98[]) d.clone();
    }

    public final boolean i() {
        return this.a;
    }
}

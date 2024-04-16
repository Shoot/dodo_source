package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RequestedContactType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ldj9;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dj9  reason: default package */
/* loaded from: classes.dex */
public final class dj9 {
    public static final dj9 a = new dj9("NONE", 0);
    public static final dj9 b = new dj9("PHONE", 1);
    public static final dj9 c = new dj9("CHAT", 2);
    private static final /* synthetic */ dj9[] d;
    private static final /* synthetic */ kj3 e;

    static {
        dj9[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private dj9(String str, int i) {
    }

    private static final /* synthetic */ dj9[] a() {
        return new dj9[]{a, b, c};
    }

    public static dj9 valueOf(String str) {
        return (dj9) Enum.valueOf(dj9.class, str);
    }

    public static dj9[] values() {
        return (dj9[]) d.clone();
    }
}

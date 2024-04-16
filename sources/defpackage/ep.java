package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lep;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ep  reason: default package */
/* loaded from: classes.dex */
public final class ep {
    public static final ep a = new ep("FOREGROUND", 0);
    public static final ep b = new ep("BACKGROUND", 1);
    private static final /* synthetic */ ep[] c;
    private static final /* synthetic */ kj3 d;

    static {
        ep[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private ep(String str, int i) {
    }

    private static final /* synthetic */ ep[] a() {
        return new ep[]{a, b};
    }

    public static ep valueOf(String str) {
        return (ep) Enum.valueOf(ep.class, str);
    }

    public static ep[] values() {
        return (ep[]) c.clone();
    }
}

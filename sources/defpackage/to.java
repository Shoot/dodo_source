package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppRestartApproveResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lto;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: to  reason: default package */
/* loaded from: classes2.dex */
public final class to {
    public static final to a = new to("APPROVED", 0);
    public static final to b = new to("REJECTED", 1);
    private static final /* synthetic */ to[] c;
    private static final /* synthetic */ kj3 d;

    static {
        to[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private to(String str, int i) {
    }

    private static final /* synthetic */ to[] a() {
        return new to[]{a, b};
    }

    public static to valueOf(String str) {
        return (to) Enum.valueOf(to.class, str);
    }

    public static to[] values() {
        return (to[]) c.clone();
    }
}

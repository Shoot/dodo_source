package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppNotificationAnalytics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000b¨\u0006\f"}, d2 = {"Lly4;", "", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ly4  reason: default package */
/* loaded from: classes4.dex */
public final class ly4 implements qd {
    public static final ly4 b = new ly4("MAIN", 0, "main");
    private static final /* synthetic */ ly4[] c;
    private static final /* synthetic */ kj3 d;
    private final String a;

    static {
        ly4[] a = a();
        c = a;
        d = lj3.a(a);
    }

    private ly4(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ ly4[] a() {
        return new ly4[]{b};
    }

    public static ly4 valueOf(String str) {
        return (ly4) Enum.valueOf(ly4.class, str);
    }

    public static ly4[] values() {
        return (ly4[]) c.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}

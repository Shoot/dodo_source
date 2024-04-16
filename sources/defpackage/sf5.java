package defpackage;
/* compiled from: KeyStatus.java */
/* renamed from: sf5  reason: default package */
/* loaded from: classes2.dex */
public final class sf5 {
    public static final sf5 b = new sf5("ENABLED");
    public static final sf5 c = new sf5("DISABLED");
    public static final sf5 d = new sf5("DESTROYED");
    private final String a;

    private sf5(String str) {
        this.a = str;
    }

    public String toString() {
        return this.a;
    }
}
